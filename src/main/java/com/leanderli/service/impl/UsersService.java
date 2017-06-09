package com.leanderli.service.impl;

import com.leanderli.bean.Users;
import com.leanderli.dao.IUsersDao;
import com.leanderli.service.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/6/2.
 */
@Service("usersService")
public class UsersService implements IUsersService {
    @Resource(name = "usersDao")
    public IUsersDao usersDao;
    @Override
    public List<Users> listAll() {
       return usersDao.selectAll();
    }

    @Override
    public int selectByUsersInfo(String usersName, String usersPwd) {
        return usersDao.selectByUsersInfo(usersName, usersPwd);
    }

    @Override
    public int addUsers(Users users) {
        return usersDao.insert(users);
    }
}
