package com.yangbw.test.api.controller;

import com.yangbw.test.api.common.AjaxResult;
import com.yangbw.test.api.domain.*;
import org.apache.logging.log4j.util.Strings;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

/**
 * 用户管理Controller
 *
 * @author yangbw
 * @date 2020-06-18
 */
@RestController
@RequestMapping("api")
public class ApiController {

    private final HashMap<String, String> mUser = new HashMap<>();

    /**
     * 用户登录
     *
     * @param user 用户信息
     * @return 注册结果
     */
    @PostMapping("login")
    public AjaxResult login(User user) {
        if (Strings.isBlank(user.getUsername())) {
            return AjaxResult.error("用户名不能为空");
        }
        if (Strings.isBlank(user.getPassword())) {
            return AjaxResult.error("密码不能为空");
        }
        String password = mUser.get(user.getUsername());
        if (Strings.isBlank(password) || !user.getPassword().equals(password)) {
            return AjaxResult.error("用户未注册或者密码有误");
        }
        user.setToken(UUID.randomUUID().toString());
        return AjaxResult.success(user);
    }

    /**
     * 用户注册
     *
     * @param user 登录信息
     * @return 登录结果
     */
    @PostMapping("register")
    public AjaxResult register(User user) {
        if (Strings.isBlank(user.getUsername())) {
            return AjaxResult.error("用户名不能为空");
        }
        if (Strings.isBlank(user.getPassword())) {
            return AjaxResult.error("密码不能为空");
        }
        String password = mUser.get(user.getUsername());
        if (!Strings.isBlank(password)) {
            return AjaxResult.error("当前用户已注册");
        }
        mUser.put(user.getUsername(), user.getPassword());
        return AjaxResult.success("用户注册成功");
    }

    /**
     * 广告内容
     */
    @GetMapping("banners")
    public AjaxResult banners() {
        final String[] className = {
                "水果", "蔬菜", "肉禽蛋品", "海鲜水产", "粮油调味", "熟食卤味", "冰品面点", "牛奶面包",
                "酒水冲饮", "休闲零食", "方便菜", "日用品", "美妆护理", "母婴", "鲜花宠物", "进口商品", "全部分类"
        };
        final String[] classNameUrl = {
                "https://iconfont.alicdn.com/t/59263b0b-91d6-4e3d-ae6a-f297087082de.png",
                "https://iconfont.alicdn.com/t/9243eb5b-d9d0-4eea-857c-938051a26328.png",
                "https://iconfont.alicdn.com/t/c0775d95-8c29-4a1a-8b6a-7fefe764d6dd.png",
                "https://iconfont.alicdn.com/t/031698ce-9ab8-4ce7-bdb4-87d92eecb997.png",
                "https://iconfont.alicdn.com/t/e78b7621-c3bb-4d61-83b4-ac761f203c7a.png",
                "https://iconfont.alicdn.com/t/f05a8260-f9e7-4791-b523-c68b3779d3cd.png",
                "https://iconfont.alicdn.com/t/bcac50f1-89e8-4b51-accb-0e57e21aea31.png",
                "https://iconfont.alicdn.com/t/f8ef2bb7-2eb7-4d41-9a3b-97403e741c40.png",
                "https://iconfont.alicdn.com/t/a0fcb818-41fc-4bf3-8a73-1f4091b9c182.png",
                "https://iconfont.alicdn.com/t/5c15bf22-63f7-45e7-83c9-a8f7b89ec709.png",
                "https://iconfont.alicdn.com/t/0d0784f9-fbb0-44fc-bf6e-e87ac11b49e4.png",
                "https://iconfont.alicdn.com/t/b8988d1e-f4fb-415a-9482-7d4fffb2b94c.png",
                "https://iconfont.alicdn.com/t/f890c977-d7be-4b6e-ad60-611d25f46ade.png",
                "https://iconfont.alicdn.com/t/a0746618-4087-4dd5-a9e7-8df2b0578d47.png",
                "https://iconfont.alicdn.com/t/cfb7644c-c3e8-428b-b301-e1bfb0a504aa.png",
                "https://iconfont.alicdn.com/t/91a7aa88-d7bd-48ce-924d-d8306e579928.png",
                "https://iconfont.alicdn.com/t/62cfd2d4-6ba9-460b-a9dd-c0cf83946678.png"
        };

        List<Banner> bannerList = new ArrayList<>();
        //广告图片
        Banner banner = new Banner();
        banner.setType("1");
        List<Banner.Data> datas = new ArrayList<>();
        datas.add(new Banner.Data("1", "https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=3928105226,1241275741&fm=15&gp=0.jpg",
                "", "https://mbd.baidu.com/newspage/data/landingsuper?context=%7B%22nid%22%3A%22news_9796096798836914348%22%7D&n_type=0&p_from=1"));
        datas.add(new Banner.Data("2", "https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=2699939875,1965150605&fm=26&gp=0.jpg",
                "", "https://mbd.baidu.com/newspage/data/landingsuper?context=%7B%22nid%22%3A%22news_9044745205780295293%22%7D&n_type=0&p_from=1"));
        banner.setDatas(datas);
        bannerList.add(banner);
        //首页分类
        Banner banner1 = new Banner();
        banner1.setType("2");
        List<Banner.Data> datas1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            datas1.add(new Banner.Data(String.valueOf(i), classNameUrl[i], className[i], ""));
        }
        banner1.setDatas(datas1);
        bannerList.add(banner1);
        //分类栏
        Banner banner2 = new Banner();
        banner2.setType("3");
        List<Banner.Data> datas2 = new ArrayList<>();
        for (int i = 10; i < 17; i++) {
            datas2.add(new Banner.Data(String.valueOf(i), classNameUrl[i], className[i], ""));
        }
        banner2.setDatas(datas2);
        bannerList.add(banner2);
        //滚动条
        Banner banner3 = new Banner();
        banner3.setType("4");
        List<Banner.Data> datas3 = new ArrayList<>();
        datas3.add(new Banner.Data("1", "", "9月大促销，【中秋卡】发售中~", ""));
        datas3.add(new Banner.Data("2", "", "69减30红包出没，快来领取！", ""));
        banner3.setDatas(datas3);
        bannerList.add(banner3);

        //滚动条
        Banner banner4 = new Banner();
        banner4.setType("5");
        List<Banner.Data> datas4 = new ArrayList<>();
        datas4.add(new Banner.Data("1", "", "9月大促销，【中秋卡】发售中~", ""));
        banner4.setDatas(datas4);
        bannerList.add(banner4);

        return AjaxResult.success(bannerList);
    }

    /**
     * 首页详情
     */
    @GetMapping("homeDetails")
    public AjaxResult homeDetails(String id) {
        HomeDetail homeDetail = null;
        switch (id) {
            case "1":
                homeDetail = new HomeDetail("1", "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1597037571372&di=f485738e09fc6869633c55e35bb2c442&imgtype=0&src=http%3A%2F%2Fa2.att.hudong.com%2F36%2F48%2F19300001357258133412489354717.jpg",
                        "测试", "内容");
                break;
            case "2":
                homeDetail = new HomeDetail("2", "https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=2672137404,2311239074&fm=26&gp=0.jpg",
                        "测试", "内容");
                break;
            default:
                return AjaxResult.error("当前ID不存在");
        }
        return AjaxResult.success(homeDetail);
    }

    /**
     * 版本更新
     */
    @GetMapping("updateVersion")
    public AjaxResult updateVersion(Integer versionCode) {
        if (versionCode == 1) {
            return AjaxResult.success("当前已是最新版本");
        }
        return AjaxResult.success(new Verson(1, "www.baiud.com", false, "更新内容"));
    }

    /**
     * 获取用户信息
     */
    @PostMapping("userInfo")
    public AjaxResult userInfo() {
//        List<Banner.Data> bannerList = new ArrayList<>();
//        bannerList.add(new Banner.Data("1", "https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=2672137404,2311239074&fm=26&gp=0.jpg", "1", "https://www.baidu.com/index.php?tn=ylmf_4_pg&ch=7"));
        UserInfo userInfo = new UserInfo();
        userInfo.setName("杨大帅");
        userInfo.setHead("http://47.114.189.153:8002/static/img/profile.11585264.jpg");
        userInfo.setBlance("1.00");
        userInfo.setDiscount("1");
        userInfo.setPresent("1");
        return AjaxResult.success(userInfo);
    }

    /**
     * 我的页面广告
     */
    @PostMapping("userBanner")
    public AjaxResult userBanner() {
        List<Banner.Data> bannerList = new ArrayList<>();
        bannerList.add(new Banner.Data("1", "https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=2672137404,2311239074&fm=26&gp=0.jpg", "1", "https://www.baidu.com/index.php?tn=ylmf_4_pg&ch=7"));
        return AjaxResult.success(bannerList);
    }

    /**
     * 发现-热门
     */
    @PostMapping("discoverHot")
    public AjaxResult discoverHot(int pageNo) {
        List<DiscoverHot> bannerList = new ArrayList<>();
        bannerList.add(new DiscoverHot("1",
                "https://st-cn.meishij.net/r/85/43/8510835/s8510835_159952946230289.jpg",
                "拔丝地瓜苹果", "https://iconfont.alicdn.com/t/e332943a-3ed4-46ca-80fb-585bff2a7b9b.png",
                "杨大帅", "2020-09-09"));
        bannerList.add(new DiscoverHot("1",
                "https://st-cn.meishij.net/r/85/43/8510835/s8510835_159952946230289.jpg",
                "拔丝地瓜苹果", "https://iconfont.alicdn.com/t/e332943a-3ed4-46ca-80fb-585bff2a7b9b.png",
                "杨大帅", "2020-09-09"));
        return AjaxResult.success(bannerList);
    }
}
