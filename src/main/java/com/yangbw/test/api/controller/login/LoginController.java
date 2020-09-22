package com.yangbw.test.api.controller.login;

import com.yangbw.test.api.common.AjaxResult;
import org.apache.logging.log4j.util.Strings;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * 登录相关类
 *
 * @author yangbw
 * @date 2020-09-18
 */
@RestController
@RequestMapping("api")
public class LoginController {

    /**
     * 正确的验证码
     */
    private static final String CORRECT = "0000";

    /**
     * 用户登录
     *
     * @param phone 手机号
     * @return 登录结果
     */
    @PostMapping("loginByPhone")
    public AjaxResult loginByPhone(String phone) {
        if (Strings.isBlank(phone)) {
            return AjaxResult.error("手机号不能为空");
        }
        return AjaxResult.success(getUser());
    }

    /**
     * 获取测试的用户信息
     *
     * @return 用户信息
     */
    private User getUser() {
        User user = new User();
        user.setId(1L);
        user.setUsername("杨大帅");
        user.setAvatar("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1600408434047&di=20d25db1c945ce21fad48b3c122d0b76&imgtype=0&src=http%3A%2F%2Fb-ssl.duitang.com%2Fuploads%2Fitem%2F201808%2F02%2F20180802232238_cyvsj.thumb.700_0.png");
        user.setToken(UUID.randomUUID().toString());
        user.setPhone("188****2177");
        user.setWechat("杨大帅");
        return user;
    }

    /**
     * 发送验证码
     *
     * @param phone 手机号
     * @return 登录结果
     */
    @PostMapping("sendCode")
    public AjaxResult sendCode(String phone) {
        return AjaxResult.success();
    }

    /**
     * 短信验证码登录
     *
     * @param phone 手机号
     * @param code  验证码
     * @return 登录结果
     */
    @PostMapping("login")
    public AjaxResult login(String phone, String code) {
        if (Strings.isBlank(phone)) {
            return AjaxResult.error("手机号不能为空");
        }
        if (Strings.isBlank(code)) {
            return AjaxResult.error("验证码不能为空");
        }
        if (!CORRECT.equals(code)) {
            return AjaxResult.error("验证码有误，请重试输入");
        }
        return AjaxResult.success(getUser());
    }

    /**
     * 验证码
     *
     * @param code 验证码
     * @return 登录结果
     */
    @PostMapping("verifyCode")
    public AjaxResult verifyCode(String code) {
        if (Strings.isBlank(code)) {
            return AjaxResult.error("验证码不能为空");
        }
        if (!CORRECT.equals(code)) {
            return AjaxResult.error("验证码有误，请重试输入");
        }
        return AjaxResult.success("发送成功");
    }
}
