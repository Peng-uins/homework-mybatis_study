package edu.nf.ch01.dao;

import edu.nf.ch01.entity.Users;

import java.util.List;

/**
 * @author 0.0
 */
public interface UsersDao {

    /**
     * 添加数据
     * @param users
     */
    void save(Users users);

    /**
     * 修改数据
     * @param user
     */
    void update(Users user);

    /**
     * 删除数据
     * @param uid
     */
    void delete(int uid);

    /**
     * 查询数据
     * @return
     */
    List<Users> listUser();

}
