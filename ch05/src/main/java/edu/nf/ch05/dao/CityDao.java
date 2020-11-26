package edu.nf.ch05.dao;

import com.sun.glass.ui.Size;
import edu.nf.ch05.entity.City;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 0.0
 */
public interface CityDao {

    /**
     *
     * @param pageNum 从第几条开始查
     * @param pageSize 最多查多少条
     * @return
     */
    List<City> listCtiy(@Param("pageNum") Integer pageNum, @Param("pageSize")Integer pageSize);

    List<City> listCtiy2(@Param("pageNum") Integer pageNum, @Param("pageSize")Integer pageSize,String name,String name2);
}
