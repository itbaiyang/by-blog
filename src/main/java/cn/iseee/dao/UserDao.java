package cn.iseee.dao;

import cn.iseee.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by popla on 2017/6/23.
 */
public interface UserDao {

    long insertUser(User user);

    int deleteUser(long userId);

    long updateUser(User user);

    User queryById(long userId);

    List<User> queryAll(@Param("offset") int offset, @Param("limit") int limit);
}
