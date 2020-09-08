package com.yangbw.test.api.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 用户管理对象 acs_user
 *
 * @author yangbw
 * @date 2020-06-18
 */
@Data
@AllArgsConstructor
public class HomeDetail {
    private String id;
    private String img;
    private String title;
    private String content;
}
