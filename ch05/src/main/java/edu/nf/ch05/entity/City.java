package edu.nf.ch05.entity;

import lombok.Data;

/**
 * Data自动设置get和set方法
 * @author 0.0
 */
@Data
public class City {
    private Integer id;
    private String name;
    private String code;
    private String province;
}
