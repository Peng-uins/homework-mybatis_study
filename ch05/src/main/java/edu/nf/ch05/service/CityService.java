package edu.nf.ch05.service;

import com.github.pagehelper.PageInfo;
import edu.nf.ch05.dao.CityDao;
import edu.nf.ch05.dao.impl.CityDaoImpl;
import edu.nf.ch05.entity.City;

import java.util.List;

/**
 * @author 0.0
 */
public class CityService{

    public PageInfo<City>listCity(Integer pageNum,Integer pageSize){
        //创建实体类对象
        CityDao dao = new CityDaoImpl();
        //查询分页记录并保存到集合中
        List<City> list =  dao.listCtiy(pageNum,pageSize);
        //将list集合封装到PageInfo对象中并返回
        PageInfo<City> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    public PageInfo<City>listCity2(Integer pageNum,Integer pageSize,String name,String name2){
        //创建实体类对象
        CityDao dao = new CityDaoImpl();
        //查询分页记录并保存到集合中
        List<City> list =  dao.listCtiy2(pageNum,pageSize,name,name2);
        //将list集合封装到PageInfo对象中并返回
        PageInfo<City> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
}
