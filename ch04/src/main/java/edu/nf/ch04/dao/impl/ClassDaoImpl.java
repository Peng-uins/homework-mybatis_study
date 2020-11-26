package edu.nf.ch04.dao.impl;

import edu.nf.ch04.dao.ClassDao;
import edu.nf.ch04.entity.ClassInfo;
import edu.nf.ch04.util.MyUtil;
import org.apache.ibatis.session.SqlSession;

/**
 * @author 0.0
 */
public class ClassDaoImpl implements ClassDao {
    @Override
    public ClassInfo getClassById(int id) {
        try (SqlSession sqlSession = MyUtil.getSqlSession(true)){
            return sqlSession.getMapper(ClassDao.class).getClassById(id);
        } catch (Exception e) {
            throw e;
        }
    }
}
