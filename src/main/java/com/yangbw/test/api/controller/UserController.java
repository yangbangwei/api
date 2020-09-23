package com.yangbw.test.api.controller;

import com.yangbw.test.api.common.AjaxResult;
import com.yangbw.test.api.domain.Banner;
import com.yangbw.test.api.domain.UserInfo;
import org.apache.logging.log4j.util.Strings;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * 登录相关类
 *
 * @author yangbw
 * @date 2020-09-18
 */
@RestController
@RequestMapping("api")
public class UserController {

    private static final String EXP_NAME = "杨大帅";

    /**
     * 获取用户信息
     */
    @PostMapping("userInfo")
    public AjaxResult userInfo() {
        UserInfo userInfo = new UserInfo();
        userInfo.setName("杨大帅");
        userInfo.setHead("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1600408434047&di=20d25db1c945ce21fad48b3c122d0b76&imgtype=0&src=http%3A%2F%2Fb-ssl.duitang.com%2Fuploads%2Fitem%2F201808%2F02%2F20180802232238_cyvsj.thumb.700_0.png");
        userInfo.setBalance("1.00");
        userInfo.setDiscount("1");
        userInfo.setPresent("1");
        List<Banner.Data> bannerList = new ArrayList<>();
        bannerList.add(new Banner.Data("1", "https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=2672137404,2311239074&fm=26&gp=0.jpg", "1", "https://www.baidu.com/index.php?tn=ylmf_4_pg&ch=7"));
        userInfo.setBanners(bannerList);
        return AjaxResult.success(userInfo);
    }

    /**
     * 修改用户名
     */
    @PostMapping("changeName")
    public AjaxResult changeName(String name) {
        if (Strings.isBlank(name)) {
            return AjaxResult.error("用户名不能为空");
        }
        if (EXP_NAME.equals(name)) {
            return AjaxResult.error("用户名重复，请修改");
        }
        return AjaxResult.success("更新成功");
    }

    /**
     * 修改用户名
     */
    @PostMapping("changePhone")
    public AjaxResult changePhone(String phone,String code) {
        return AjaxResult.success();
    }
}
