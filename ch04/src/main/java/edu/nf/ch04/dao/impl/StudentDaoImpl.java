package edu.nf.ch04.dao.impl;

import edu.nf.ch04.dao.StuDao;
import edu.nf.ch04.entity.Student;
import edu.nf.ch04.util.MyUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @author 0.0
 */
public class StudentDaoImpl implements StuDao {

    @Override
    public List<Student> getStudentById() {
        try(SqlSession sqlSession = MyUtil.getSqlSession(true)){
            return sqlSession.getMapper(StuDao.class).getStudentById();
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public List<Student> getStudentById2(int id) {
        try(SqlSession sqlSession = MyUtil.getSqlSession(true)){
            return sqlSession.getMapper(StuDao.class).getStudentById2(id);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public int deleteStudent(int uid) {
        try(SqlSession sqlSession = MyUtil.getSqlSession(true)){
           return sqlSession.getMapper(StuDao.class).deleteStudent(uid);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public int deleteIdCard(int uid) {
        try(SqlSession sqlSession = MyUtil.getSqlSession(true)){
            return sqlSession.getMapper(StuDao.class).deleteIdCard(uid);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public int deleteStu_Sub(int uid) {
        try(SqlSession sqlSession = MyUtil.getSqlSession(true)){
            return sqlSession.getMapper(StuDao.class).deleteStu_Sub(uid);
        } catch (Exception e) {
            throw e;
        }
    }
}
