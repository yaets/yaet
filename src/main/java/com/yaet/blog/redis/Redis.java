package com.yaet.blog.redis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class Redis {

    private static final Logger LOGGER = LoggerFactory.getLogger(Redis.class);
    // Redis服务器IP
    private static String SERVER = "127.0.0.1";
    // Redis的端口号
    private static int PORT = 6379;
    // 超时
    private static int TIMEOUT = 180;
    // 访问密码
    private static String AUTH = "jky0130";
    private static JedisPool jedisPool = null;

    static {
        try {
            JedisPoolConfig config = new JedisPoolConfig();
            LOGGER.info(config.getTestOnBorrow() + "");
            LOGGER.info(config.getMaxWaitMillis() + "");
            LOGGER.info(config.getMinIdle() + "");
            LOGGER.info(config.getEvictionPolicyClassName() + "");
            LOGGER.info(config.getJmxNameBase() + "");
            LOGGER.info(config.getJmxNamePrefix() + "");
            LOGGER.info(config.getBlockWhenExhausted() + "");
            LOGGER.info(config.getFairness() + "");
            LOGGER.info(config.getJmxEnabled() + "");
            LOGGER.info(config.getLifo() + "");
            LOGGER.info(config.getMaxIdle() + "");
            LOGGER.info(config.getMaxTotal() + "");
            LOGGER.info(config.getMinEvictableIdleTimeMillis() + "");
            LOGGER.info(config.getNumTestsPerEvictionRun() + "");
            LOGGER.info(config.getSoftMinEvictableIdleTimeMillis() + "");
            LOGGER.info(config.getTestOnCreate() + "");
            LOGGER.info(config.getTestOnReturn() + "");
            LOGGER.info(config.getTestWhileIdle() + "");
            LOGGER.info(config.getTimeBetweenEvictionRunsMillis() + "");
            LOGGER.info(config.getClass() + "");
            jedisPool = new JedisPool(config, SERVER, PORT, TIMEOUT, AUTH);
        } catch (Exception e) {
            LOGGER.error("Jedis连接池创建失败！(ERR_CD_0001)");
            e.printStackTrace();
        }
    }

    synchronized static Jedis getJedis() {
        try {
            if (jedisPool != null) {
                return jedisPool.getResource();
            } else {
                LOGGER.error("获取Jedis实例失败！(ERR_CD_0002)");
                return null;
            }
        } catch (Exception e) {
            LOGGER.error("获取Jedis实例失败！(ERR_CD_0003)");
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
