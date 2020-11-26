package edu.nf.ch02.entity;

import lombok.Data;

/**
 * @author 0.0
 * 实体类，使用Data标识符来创建get、set方法，先导入lombak插件
 */
@Data
public class Users {
    private Integer uid;
    private String userName;
    private Integer age;
    private String tel;

    public Users() {
    }

    public Users(Integer uid, String userName, Integer age, String tel) {
        this.uid = uid;
        this.userName = userName;
        this.age = age;
        this.tel = tel;
    }
}
