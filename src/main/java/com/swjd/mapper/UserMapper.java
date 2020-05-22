package com.swjd.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.swjd.bean.User;

public interface UserMapper extends BaseMapper<User> {
    //根据账号和密码查询对象
    public abstract User findUserByUNameAndPwd(User user);
}
