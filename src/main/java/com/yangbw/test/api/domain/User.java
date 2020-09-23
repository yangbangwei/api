package com.yangbw.test.api.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户管理对象 acs_user
 *
 * @author yangbw
 * @date 2020-06-18
 */
@Data
@NoArgsConstructor
public class User {
    /**
     * 用户编号
     */
    private Long id;

    /**
     * 姓名
     */
    private String username;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 微信号
     */
    private String wechat;

    /**
     * 用户token
     */
    private String token;
}
