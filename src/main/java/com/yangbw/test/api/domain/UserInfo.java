package com.yangbw.test.api.domain;

import lombok.Data;

import java.util.List;

@Data
public class UserInfo {
    private String name;
    private String head;
    private String present;
    private String discount;
    private String balance;
    private String token;
    private List<Banner.Data> banners;
}
