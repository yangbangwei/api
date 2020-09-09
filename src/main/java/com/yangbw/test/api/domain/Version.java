package com.yangbw.test.api.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户管理对象 acs_user
 *
 * @author yangbw
 * @date 2020-06-18
 */
@Data
@AllArgsConstructor
public class Version {
    private String version;
    private String url;
    private Boolean isHas;
    private String content;
}
