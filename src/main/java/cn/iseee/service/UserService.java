package cn.iseee.service;

import cn.iseee.entity.User;

import java.util.List;

/**
 * Created by popla on 2017/6/26.
 */
public interface UserService {

    long insertUser(User user);

    int deleteUser(long userId);

    long updateUser(User user);

    List<User> getUserList(int offset, int limit);

    User queryById(long userId);
}
