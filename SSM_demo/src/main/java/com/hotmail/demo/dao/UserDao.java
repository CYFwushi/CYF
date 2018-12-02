package com.hotmail.demo.dao;

/**
 * Created by Administrator on 2018/12/2 0002.
 */

import com.hotmail.demo.domain.User;
import org.springframework.stereotype.Component;

@Component
public interface UserDao {

    User selectUser(long id);

    void insert(User user1);
}
