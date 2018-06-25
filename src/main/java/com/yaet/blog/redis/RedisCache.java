package com.yaet.blog.redis;


import org.apache.ibatis.cache.Cache;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 使用第三方缓存服务器，处理二级缓存
 */
public class RedisCache implements Cache {

    private final ReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    private String id;

    public RedisCache(final String id) {
        if (id == null) {
            throw new IllegalArgumentException("缓存id不能为空！(ERR_CD_0004)");
        }
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    // 把key/value保存到缓存对象中
    public void putObject(Object key, Object value) {
        Redis.getJedis().set(Serializer.serialize(key.toString()), Serializer.serialize(value));
    }

    // 通过key从缓存对象中获取value
    public Object getObject(Object key) {
        return Serializer.deserialize(Redis.getJedis().get(Serializer.serialize(key.toString())));
    }

    // 不是需要实现的方法,没有被核心框架调用
    // 方法作用: 根据key移除对应的value
    public Object removeObject(Object key) {
        return Redis.getJedis().expire(Serializer.serialize(key.toString()), 0);
    }

    // 清除缓存(操作影响性能,效率低,不建议经常清除)
    public void clear() {
        Redis.getJedis().flushDB();
    }

    // 获取缓存对象中存取的key/value的数量
    public int getSize() {
        return Integer.valueOf(Redis.getJedis().dbSize().toString());
    }

    // 获取读写锁
    // 从mybatis的3.2.6版本,这个方法不再被框架核心调用
    // 所有需要的锁,都必须由缓存供应商来提供
    public ReadWriteLock getReadWriteLock() {
        return readWriteLock;
    }
}
