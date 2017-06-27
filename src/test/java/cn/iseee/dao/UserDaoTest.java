package cn.iseee.dao;

import cn.iseee.entity.User;
import cn.iseee.util.MD5Tools;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by popla on 2017/6/23.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class UserDaoTest {

    @Resource
    private UserDao userDao;
    @Test
    public void insertUser() throws Exception {
        User user = new User();
        MD5Tools md5Tools = new MD5Tools();
        user.setUserName("baiyang");
        user.setPassword(md5Tools.MD5("123456"));
        user.setCreateTime(new Date());
        System.out.println(user);
        userDao.insertUser(user);
        System.out.println(user.getUserId());
    }

    @Test
    public void deleteUser() throws Exception {
        long id = 1;
        int deleteCount = userDao.deleteUser(id);
        System.out.println(deleteCount);
    }

    @Test
    public void updateUser() throws Exception {
        User user = new User();
        int id = 101;
        user.setUserId(id);
        MD5Tools md5Tools = new MD5Tools();
        user.setUserName("baiyang");
        user.setPassword(md5Tools.MD5("123456"));
        user.setCreateTime(new Date());
        System.out.println(user);
        userDao.insertUser(user);
        System.out.println(user.getUserId());
    }

    @Test
    public void queryById() throws Exception {
        int id = 100;
        User user = userDao.queryById(id);
        System.out.println(user);
    }

    @Test
    public void queryAll() throws Exception {
        List<User> users = userDao.queryAll(0,10);
        for(User user : users){
            System.out.println(user);
        }
    }

}