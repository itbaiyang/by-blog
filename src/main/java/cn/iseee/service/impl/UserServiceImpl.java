package cn.iseee.service.impl;

import cn.iseee.dao.UserDao;
import cn.iseee.entity.User;
import cn.iseee.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by popla on 2017/6/26.
 */

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    public long insertUser(User user) {
        long res = userDao.insertUser(user);
        return res;
    }

    public int deleteUser(long userId) {
        int res = userDao.deleteUser(userId);
        return res;
    }

    public long updateUser(User user) {
        long res = userDao.updateUser(user);
        return res;
    }

    public List<User> getUserList(int offset, int limit) {
        List<User> userList = userDao.queryAll(offset, limit);
        return userList;
    }

    public User queryById(long userId) {
        User user = userDao.queryById(userId);
        return user;
    }
}
