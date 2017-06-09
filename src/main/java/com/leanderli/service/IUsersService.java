package com.leanderli.service;

import com.leanderli.bean.Users;

import java.util.List;

/**
 * Created by Administrator on 2017/6/2.
 */
public interface IUsersService {

    List<Users> listAll();
    int selectByUsersInfo(String usersName, String usersPwd);

    int addUsers(Users users);
}
