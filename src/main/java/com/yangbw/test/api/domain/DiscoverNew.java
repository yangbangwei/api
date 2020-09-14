package com.yangbw.test.api.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DiscoverNew {

    private Integer type;
    private String img;
    private String title;
    private String name;
    private String avatar;
    private String url;
    private List<Data> datas;

    public DiscoverNew(Integer type, String img, String title, String name, String avatar, String url) {
        this.type = type;
        this.img = img;
        this.title = title;
        this.name = name;
        this.avatar = avatar;
        this.url = url;
    }

    @lombok.Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Data {
        private String id;
        private String img;
        private String url;
    }
}
