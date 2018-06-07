package redis.impl;

import com.yaet.blog.pojo.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import redis.RedisRepository;

import javax.annotation.Resource;
import java.util.List;

@Component("UserRedisRepo")
public class UserRedisRepository implements RedisRepository<String, String, User> {

    @Resource(name = "redisTemplate")
    private RedisTemplate<String, String> redisTemplate;

    private Logger logger = LoggerFactory.getLogger(UserRedisRepository.class);

    @Override
    public void add(String key, String value) {
        if (redisTemplate == null) {
            logger.warn("redisTemplate 实例化失败");
        } else {
            redisTemplate.opsForValue().set(key, value);
        }
    }

    @Override
    public void addObj(String objectKey, String key, User object) {
        if (redisTemplate == null) {
            logger.warn("redisTemplate 实例化失败");
        } else {
            redisTemplate.opsForHash().put(objectKey, key, object);
        }
    }

    @Override
    public void delete(String key) {

    }

    @Override
    public void delete(List<String> listKeys) {

    }

    @Override
    public void deletObj(String objecyKey, String key) {

    }

    @Override
    public void update(String key, String value) {

    }

    @Override
    public void updateObj(String objectKey, String key, User object) {

    }

    @Override
    public String get(String key) {
        return redisTemplate.opsForValue().get(key);
    }

    @Override
    public User getObj(String objectKey, String key) {
        User user = (User) redisTemplate.opsForHash().get(objectKey, key);
        return user;
    }
}
