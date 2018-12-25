package com.bluesgao.ilovestudy.api;

import com.bluesgao.ilovestudy.base.entity.User;
import com.bluesgao.ilovestudy.biz.UserBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userapi")
public class UserApi {
    @Autowired
    private UserBiz userBiz;

    @RequestMapping("/{id}")
    public User getUserInfo(@PathVariable("id") Long id) {
        return userBiz.getUser(id);
    }

}
