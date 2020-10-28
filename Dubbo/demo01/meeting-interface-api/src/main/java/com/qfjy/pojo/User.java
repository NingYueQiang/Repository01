package com.qfjy.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author shkstart
 * @create 2020-10-20 11:11
 */
@Data
public class User implements Serializable {
    private String id;
    private String name;
    private String tel;
}
