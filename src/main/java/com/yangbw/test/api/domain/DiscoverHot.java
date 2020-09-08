package com.yangbw.test.api.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class DiscoverHot {
    private String id;
    private String img;
    private String title;
    private String avatar;
    private String name;
    private String date;
}
