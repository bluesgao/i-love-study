package com.bluesgao.ilovestudy.api;

import com.bluesgao.ilovestudy.api.vo.UserVo;
import com.bluesgao.ilovestudy.core.entity.User;
import com.bluesgao.ilovestudy.core.biz.UserBiz;
import org.springframework.beans.BeanUtils;
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
    public UserVo getUserInfo(@PathVariable("id") Long id) {
        User user = userBiz.getUser(id);
        UserVo userVo = new UserVo();
        BeanUtils.copyProperties(user, userVo);
        return userVo;
    }

}
