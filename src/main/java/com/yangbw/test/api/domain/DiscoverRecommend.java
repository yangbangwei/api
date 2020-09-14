package com.yangbw.test.api.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DiscoverRecommend {
    private String id;
    private String img;
    private String title;
    private String avatar;
    private String name;
    private String like;
    private int width;
    private int height;

    public DiscoverRecommend(String id, String img, String title, String avatar, String name, String like) {
        this.id = id;
        this.img = img;
        this.title = title;
        this.avatar = avatar;
        this.name = name;
        this.like = like;
    }
}
