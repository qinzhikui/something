package com.ximalaya.controller;

import com.ximalaya.service.MybatisService;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * Created by qinzhikui on 20180915
 */

@Controller
public class SpringController{

    @Autowired
    MybatisService mybatisService;

    @RequestMapping("/addUser")
    public String addUser(HttpServletRequest httpServletRequest){
        String userName=httpServletRequest.getParameter("name");
        String userAge=httpServletRequest.getParameter("age");
        String address=httpServletRequest.getParameter("address");

        boolean isSuccess=mybatisService.addUser(userName,userAge,address);
        String result=null;
        if(isSuccess){
            result="Add User Success！";
        }else{
            result="Add User fail!";
        }

        return result;
    }
}