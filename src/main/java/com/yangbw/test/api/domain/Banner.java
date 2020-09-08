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
public class Banner {
    private String type;
    private List<Data> datas;

    @lombok.Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Data{
        private String id;
        private String img;
        private String title;
        private String url;
    }
}
