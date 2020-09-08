package com.yangbw.test.api.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户管理对象 acs_user
 *
 * @author yangbw
 * @date 2020-06-18
 */
@Data
public class User implements Serializable{

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    /**
     * 用户编号
     */
    private Long id;

    /**
     * 姓名
     */
    private String username;

    /**
     * 用户类型
     */
    private String password;

    /**
     * 用户token
     */
    private String token;
}
