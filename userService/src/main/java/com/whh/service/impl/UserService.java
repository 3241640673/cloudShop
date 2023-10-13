package com.whh.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.whh.dao.UserDao;
import com.whh.pojo.User;
import com.whh.service.Inter.IUserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService extends ServiceImpl<UserDao, User> implements IUserService{
    public List<User> fingIf(String sub, String sex){
        return  lambdaQuery().like(sub != null, User::getUserName, sub)
                .eq(sex != null, User::getUserSex, sex).list();
    }


}
