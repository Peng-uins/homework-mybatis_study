package edu.nf.ch04.dao;

import edu.nf.ch04.entity.Student;

import java.util.List;

/**
 * @author 0.0
 */
public interface StuDao {

    List<Student> getStudentById();


    /**
     * 根据id查询学生学习
     * @param id------------------------
     * @return
     */
    List<Student> getStudentById2(int id);

    /**
     * 删除数据库
     * @param uid
     */
    int deleteStudent(int uid);

    int deleteIdCard(int uid);

    int deleteStu_Sub(int uid);
}
