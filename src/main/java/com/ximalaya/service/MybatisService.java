package com.ximalaya.service;

import com.ximalaya.model.User;
import com.ximalaya.search.common.nlp.tools.repeat.ContentRepeat;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import com.ximalaya.search.common.nlp.*;

/*
* Created by qinzhikui on 20180915
*/

@Service
public class MybatisService{

    public boolean addUser(String userName,String userAge,String address){
        User user=new User();
        user.setName(userName);
        int age=-1;
        if(StringUtils.isEmpty(userAge)){
            age=Integer.valueOf(userAge);
        }
        user.setAge(age);
        user.setAddress(address);

        ContentRepeat contentRepeat=new ContentRepeat();
        double score=contentRepeat.repeatScore("哈哈哈");
        return true;
    }
}