package edu.nf.ch04.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 0.0
 */
@Data
public class Student {

    private Integer stuId;
    private String stuName;
    private Integer stuAge;
    //关联班级信息(多对一的关联)
    private ClassInfo classInfo;
    //关联身份证(一对一)
    private IdCard idCard;
    //关联课程(多对多)
    private List<Subject> subjects = new ArrayList<>();
}
