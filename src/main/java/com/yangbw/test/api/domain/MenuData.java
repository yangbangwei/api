package com.yangbw.test.api.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 用户管理对象 acs_user
 *
 * @author yangbw
 * @date 2020-06-18
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MenuData {
    private String id;

    private String avatar;
    private String name;
    private String content;
    private String like;
    private String attention;

    private String type;
    private String videoUrl;
    private List<String> picUrls;
}
