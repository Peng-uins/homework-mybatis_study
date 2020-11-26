package edu.nf.ch05.dao.impl;

import edu.nf.ch05.dao.CityDao;
import edu.nf.ch05.entity.City;
import edu.nf.ch05.util.CityUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @author 0.0
 */
public class CityDaoImpl implements CityDao {
    @Override
    public List<City> listCtiy(Integer pageNum, Integer pageSize) {
        try(SqlSession sqlSession = CityUtil.getSqlSession(true)){
            return sqlSession.getMapper(CityDao.class).listCtiy(pageNum,pageSize);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public List<City> listCtiy2(Integer pageNum, Integer pageSize, String name, String name2) {
        try(SqlSession sqlSession = CityUtil.getSqlSession(true)){
            return sqlSession.getMapper(CityDao.class).listCtiy2(pageNum,pageSize,name,name2);
        } catch (Exception e) {
            throw e;
        }
    }
}
