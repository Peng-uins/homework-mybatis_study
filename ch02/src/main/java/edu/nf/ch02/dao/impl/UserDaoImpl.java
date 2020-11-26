package edu.nf.ch02.dao.impl;

import edu.nf.ch02.dao.UserDao;
import edu.nf.ch02.entity.Users;
import edu.nf.ch02.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @author 0.0
 */
public class UserDaoImpl implements UserDao {

    /**
     * 查询数据
     * @param users
     * @return
     */
    @Override
    public List<Users> listUsers(Users users) {
        //获取Sqlsession对象操作数据库
        try (SqlSession sqlSession = MybatisUtil.getSqlSession(true)){
            //返回一个
            return sqlSession.getMapper(UserDao.class).listUsers(users);
        } catch (Exception e) {
            throw e;
        }
    }
}
