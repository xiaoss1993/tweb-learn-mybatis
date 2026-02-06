package com.tweb.mybatis.test.dao;

import com.tweb.mybatis.test.po.User;

public interface IUserDao {

    User queryUserInfoById(Long uId);

}
