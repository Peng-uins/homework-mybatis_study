package edu.nf.ch04.entity;

import java.util.ArrayList;
import java.util.List;

public class Studentz {

    private Integer stuId;
    private String stuName;
    private Integer stuAge;
    //关联班级信息(多对一的关联)
    private String classInfo;
    //关联身份证(一对一)
    private String idCard;
    //关联课程(多对多)
    private String subject;

    public Studentz() {
    }

    public Studentz(Integer stuId,String stuName, Integer stuAge, String classInfo, String idCard) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.stuAge = stuAge;
        this.classInfo = classInfo;
        this.idCard = idCard;
    }
}
