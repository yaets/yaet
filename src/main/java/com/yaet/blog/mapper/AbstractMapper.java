package com.yaet.blog.mapper;

import java.util.List;

public interface AbstractMapper<T> {

    int insert(T t);

    int delete(T t);

    int update(T t);

    T get();

    List<T> list();

    int count();
}
