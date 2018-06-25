package com.yaet.blog.redis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Serializer {

    private static final Logger LOGGER = LoggerFactory.getLogger(Serializer.class);

    static byte[] serialize(Object object) {

        ObjectOutputStream oos = null;

        ByteArrayOutputStream baos = null;

        try {
            // 序列化
            baos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(baos);
            oos.writeObject(object);
            return baos.toByteArray();
        } catch (Exception e) {
            LOGGER.error("序列化失败！(ERR_CD_0005)");
            e.printStackTrace();
        }
        return null;
    }

    static Object deserialize(byte[] bytes) {
        if (bytes == null)
            return null;

        ByteArrayInputStream bais = null;
        try {
            // 反序列化
            bais = new ByteArrayInputStream(bytes);
            ObjectInputStream ois = new ObjectInputStream(bais);
            return ois.readObject();
        } catch (Exception e) {
            LOGGER.error("反序列化失败！(ERR_CD_0006)");
            e.printStackTrace();
        }
        return null;
    }
}
