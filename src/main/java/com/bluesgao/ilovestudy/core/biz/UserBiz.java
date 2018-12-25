package com.bluesgao.ilovestudy.core.biz;

import com.bluesgao.ilovestudy.core.entity.User;
import com.bluesgao.ilovestudy.core.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserBiz {
    @Autowired
    private UserService userService;

    public User getUser(Long id){
        return userService.getUser(id);
    }
}
