package com.hotmail.demo.service.impl;
import com.hotmail.demo.dao.UserDao;
import com.hotmail.demo.domain.User;
import com.hotmail.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public User selectUser(long userId) {
        return this.userDao.selectUser(userId);
    }


    public void insert(User user1) {
        userDao.insert(user1);
    }
}
