package com.leanderli.dao;

import com.leanderli.bean.Users;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/6/2.
 */
public interface IUsersDao {
    int deleteByPrimaryKey(Integer uId);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(Integer uId);
    List<Users> selectAll();
    int selectByUsersInfo(String usersName, String usersPwd);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);
}
