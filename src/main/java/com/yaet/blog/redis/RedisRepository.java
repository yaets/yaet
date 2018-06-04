package com.yaet.blog.redis;

import java.util.List;

public interface RedisRepository<H, K, V> {
    //增
    void add(K key, String value);

    void addObj(H objectKey, K key, V object);

    //删
    void delete(K key);

    void delete(List<K> listKeys);

    void deletObj(H objecyKey, K key);

    //改
    void update(K key, String value);

    void updateObj(H objectKey, K key, V object);

    //查
    String get(K key);

    V getObj(H objectKey, K key);
}
