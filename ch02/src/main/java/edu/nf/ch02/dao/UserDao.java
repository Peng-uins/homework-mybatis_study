package edu.nf.ch02.dao;

import edu.nf.ch02.entity.Users;

import java.util.List;

/**
 * @author 0.0
 */
public interface UserDao {

    /**
     * 查询数据
     * @param users
     * @return
     */
    List<Users> listUsers(Users users);
}
