package com.bluesgao.ilovestudy.core.service;

import com.alibaba.fastjson.JSON;
import com.bluesgao.ilovestudy.core.entity.User;
import com.bluesgao.ilovestudy.core.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User getUser(Long id){
        log.info("getUser input:{}", id);
        User user = null;
        try {
            user =  userMapper.selectByPrimaryKey(id);
        } catch (Exception e) {
            log.error("getUser err:{}", e);
        }
        log.info("getUser output:{}", JSON.toJSONString(user));
        return user;
    }
}
