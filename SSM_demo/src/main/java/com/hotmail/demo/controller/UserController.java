package com.hotmail.demo.controller;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hotmail.demo.domain.User;
import com.hotmail.demo.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

import org.apache.log4j.Logger;
/**
 * Created by Administrator on 2018/12/2 0002.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceImpl userServiceImpl;

    Logger logger = Logger.getLogger(UserController.class);
    @RequestMapping("/showUser.do")
    public void yeahj(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("nihaoya,wojianlaile");
        System.out.println("nihaoya,wojianlaile");
        System.out.println("nihaoya,wojianlaile");
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        logger.info("你牛逼啊啊---212121212电饭锅梵蒂冈电656656565656565饭锅电饭锅发的132323-----------------------------");
        logger.info("你牛逼啊啊---212121212电饭锅梵蒂冈电656656565656565饭锅电饭锅发的132323-----------------------------");
        hahah();
        logger.info("不得了大不了的---88888888888888-----------------------------");
        logger.info("你牛逼啊啊-------7777777777788888888888hahahaahah-------------------------");
        logger.info("你牛逼啊啊-------7777777777788888888888hahahaahah-------------------------");
        logger.info("你牛逼啊啊-------7777777777788888888888hahahaahah-------------------------");
        logger.info("你牛逼啊啊-------7777777777788888888888hahahaahah-------------------------");
        logger.info("你牛逼啊啊-------7777777777788888888888hahahaahah-------------------------");
        long userId = Long.parseLong(request.getParameter("id"));
        User user =userServiceImpl.selectUser(userId);
        ObjectMapper mapper = new ObjectMapper();
        response.getWriter().write(mapper.writeValueAsString(user));
        response.getWriter().close();
    }


    @RequestMapping("/zeeze.do")
    public void insert(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("你好呀");
        User user1 = new User();
        user1.setRegTime(new Date());
        user1.setPassword("110110");
        userServiceImpl.insert(user1);
		System.out.println("你大爷威哥进来了");
    }

    public void hahah(){
        System.out.println("是否进来了");
    }

    public static void main(String[] args) {
        System.out.println("nihao");
    }
}
