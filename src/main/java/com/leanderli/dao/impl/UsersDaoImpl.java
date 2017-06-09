package com.leanderli.dao.impl;

import com.leanderli.bean.Users;
import com.leanderli.dao.IUsersDao;
import org.apache.ibatis.session.ResultHandler;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2017/6/2.
 */
@Repository("usersDao")
public class UsersDaoImpl implements IUsersDao {

    @Resource
    private SqlSessionTemplate sqlSessionTemplate;

    @Override
    public int deleteByPrimaryKey(Integer uId) {
        return 0;
    }

    @Override
    public int insert(Users record) {
        return sqlSessionTemplate.insert("UsersMapper.insert", record);
    }

    @Override
    public int insertSelective(Users record) {
        return 0;
    }

    @Override
    public Users selectByPrimaryKey(Integer uId) {
        return null;
    }

    @Override
    public List<Users> selectAll() {
        return sqlSessionTemplate.selectList("UsersMapper.selectAll");
    }

    @Override
    public int selectByUsersInfo(String usersName, String usersPwd) {
        HashMap<String, Object> params = new HashMap<>();
        params.put("usersName", usersName);
        params.put("usersPwd", usersPwd);
        return sqlSessionTemplate.selectOne("UsersMapper.selectByUsersInfo", params);
    }

    @Override
    public int updateByPrimaryKeySelective(Users record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Users record) {
        return 0;
    }
}
