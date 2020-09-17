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
public class Coupon {
    private String derate;
    private String price;
    private String title;
    private String deadline;
}
