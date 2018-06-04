package com.yaet.blog.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class RedisUtil {
    private static JedisPool jedisPool = null;

    private static Logger logger = LoggerFactory.getLogger(RedisUtil.class);

    static {
        try {
            jedisPool = new JedisPool();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public synchronized static Jedis getJedis() {
        try {
            if (jedisPool != null) {
                logger.info("获取Jedis实例成功！(INF_CD_0001)");
                return jedisPool.getResource();
            } else {
                logger.error("获取Jedis实例失败！(ERR_CD_0001)");
                return null;
            }
        } catch (Exception e) {
            logger.error("获取Jedis实例失败！(ERR_CD_0002)");
            e.printStackTrace();
            return null;
        }
    }

    public static void returnResource(Jedis jedis) {
        try {
            jedis = jedisPool.getResource();
        } finally {
            if (jedis != null) {
                jedis.close();
            }
        }
    }
}
