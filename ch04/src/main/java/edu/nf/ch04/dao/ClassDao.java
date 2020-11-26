package edu.nf.ch04.dao;

import edu.nf.ch04.entity.ClassInfo;

/**
 * @author 0.0
 */
public interface ClassDao {

    /**
     * 根据id查询班级信息
     * @param id
     * @return
     */
    ClassInfo getClassById(int id);
}
