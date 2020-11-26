package edu.nf.ch04.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 0.0
 */
@Data
public class ClassInfo {

    private Integer cid;
    private String className;
    //关联学生(一对多)
    private List<Student> students   = new ArrayList<>();
}
