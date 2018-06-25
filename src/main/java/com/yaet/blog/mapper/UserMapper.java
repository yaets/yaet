package com.yaet.blog.mapper;

import com.yaet.blog.pojo.User;

import java.util.List;

public interface UserMapper {

    int insert(User user);

    int delete(String userId);

    int update(User user);

    User get(String userId);

    List<User> list();
}
