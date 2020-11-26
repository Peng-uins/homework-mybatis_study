package edu.nf.ch01.dao.impl;

import edu.nf.ch01.dao.UsersDao;
import edu.nf.ch01.entity.Users;
import edu.nf.ch01.util.UserUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @author 0.0
 * UsersDao的实现类
 */
public class UsersDaoImpl implements UsersDao {

    @Override
    public void save(Users users) {
        //获取一个SqlSession对象来操作数据库
        try(SqlSession sqlSession = UserUtil.getSqlSession(true)){
            //创建一个类对象来操作这个方法
            sqlSession.getMapper(UsersDao.class).save(users);
        }catch(RuntimeException e){
            throw e;
        }
    }

    @Override
    public void update(Users user) {
        try(SqlSession sqlSession = UserUtil.getSqlSession(true)){
            sqlSession.getMapper(UsersDao.class).update(user);
        }catch(RuntimeException e){
            throw e;
        }
    }

    @Override
    public void delete(int uid) {
        try(SqlSession sqlSession = UserUtil.getSqlSession(true)){
            sqlSession.getMapper(UsersDao.class).delete(uid);
        }catch(RuntimeException e){
            throw e;
        }
    }

    @Override
    public List<Users> listUser() {
        try(SqlSession sqlSession = UserUtil.getSqlSession(true)){
            return sqlSession.getMapper(UsersDao.class).listUser();
        }catch(RuntimeException e){
            throw e;
        }
    }
}
