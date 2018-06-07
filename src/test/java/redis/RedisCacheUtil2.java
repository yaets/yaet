package redis;

import org.apache.commons.lang3.SerializationUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.support.SimpleValueWrapper;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.concurrent.Callable;

@Repository
public class RedisCacheUtil2 implements Cache {

    private Logger logger = LoggerFactory.getLogger(RedisCacheUtil2.class);

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @Override
    public String getName() {
        return null;
    }

    @Override
    public Object getNativeCache() {
        return null;
    }

    @Override
    public ValueWrapper get(Object key) {
        final String keyS = key.toString();
        logger.debug("-------获取缓存开始-------" + keyS);
        Object object = redisTemplate.execute((RedisCallback<Object>) connection -> {
            byte[] keyBs = keyS.getBytes();
            byte[] value = connection.get(keyBs);
            if (value == null) {
                System.out.println("------缓存不存在-------");
                return null;
            }
            return SerializationUtils.deserialize(value);
        });
        ValueWrapper valueWrapper = (object != null ? new SimpleValueWrapper(object) : null);
        logger.debug("-------获取缓存完成-------" + valueWrapper);
        return valueWrapper;
    }

    @Override
    public <T> T get(Object key, Class<T> type) {
        return null;
    }

    @Override
    public <T> T get(Object key, Callable<T> valueLoader) {
        return null;
    }

    @Override
    public void put(Object key, Object value) {
        final String keyS = key.toString();
        final Object valueO = value;
        final long liveTime = 86400;
        logger.debug("-------插入缓存开始-------" + keyS);
        redisTemplate.execute((RedisCallback<Long>) connection -> {
            byte[] keyBs = keyS.getBytes();
            byte[] valueBs = SerializationUtils.serialize((Serializable) valueO);
            connection.set(keyBs, valueBs);
            connection.expire(keyBs, liveTime);
            return 1L;
        });
        logger.debug("-------插入缓存完成-------" + keyS);
    }

    @Override
    public ValueWrapper putIfAbsent(Object key, Object value) {
        return null;
    }

    @Override
    public void evict(Object key) {
        final String keyS = key.toString();
        logger.debug("-------删除缓存开始-------");
        redisTemplate.execute((RedisCallback<Long>) connection -> connection.del(keyS.getBytes()));
        logger.debug("-------删除缓存完成-------");
    }

    @Override
    public void clear() {
        logger.debug("-------清理缓存开始-------");
        redisTemplate.execute((RedisCallback<String>) connection -> {
            connection.flushDb();
            return "OK";
        });
        logger.debug("-------清理缓存完成-------");
    }

    public RedisTemplate<String, Object> getRedisTemplate() {
        return redisTemplate;
    }

    public void setRedisTemplate(RedisTemplate<String, Object> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }
}
