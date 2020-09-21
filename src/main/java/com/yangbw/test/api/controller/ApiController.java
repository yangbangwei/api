package com.yangbw.test.api.controller;

import com.yangbw.test.api.common.AjaxResult;
import com.yangbw.test.api.domain.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * 用户管理Controller
 *
 * @author yangbw
 * @date 2020-06-18
 */
@RestController
@RequestMapping("api")
public class ApiController {

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
        return AjaxResult.success(new Version("v1.0.0", "www.baiud.com", false, "更新内容"));
    }

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
     * 发现-热门
     */
    @PostMapping("discoverHot")
    public AjaxResult discoverHot(int pageNo) {
        if (pageNo == 3) {
            return AjaxResult.success();
        }
        final String[] imgs = {
                "https://i8.meishichina.com/attachment/recipe/2020/09/09/2020090915996290753643751365842.JPG?x-oss-process=style/p800",
                "https://i8.meishichina.com/attachment/recipe/2020/09/09/20200909159962963196032810935645.JPG?x-oss-process=style/p800",
                "https://i8.meishichina.com/attachment/recipe/2020/09/09/2020090915996277345394677796837.jpg?x-oss-process=style/p800",
                "https://i8.meishichina.com/attachment/recipe/2020/09/09/20200909159962686295116810886247.jpg?x-oss-process=style/p800",
                "https://i8.meishichina.com/attachment/recipe/2020/08/17/2020081715976695859577908010238.JPG?x-oss-process=style/p800",
                "https://i8.meishichina.com/attachment/recipe/2020/09/09/2020090915996193657277476038933.jpg?x-oss-process=style/p800",
                "https://i8.meishichina.com/attachment/recipe/2020/09/09/202009091599618389950741426927.jpg?x-oss-process=style/p800",
                "https://i8.meishichina.com/attachment/recipe/2020/09/09/20200909159960915842173310427913.jpg?x-oss-process=style/p800",
                "https://i8.meishichina.com/attachment/recipe/2020/08/10/20200810159701760076629711116030.jpg?x-oss-process=style/p800",
                "https://i8.meishichina.com/attachment/recipe/2020/09/09/202009091599606688412889404188.JPG?x-oss-process=style/p800"
        };
        final String[] titles = {
                "红糖燕麦饼干",
                "番茄虾仁意面",
                "笋干烧肉",
                "番茄鱼丸竹荪汤 ",
                "水煮肉片",
                "火腿鸡蛋沙拉",
                "电饼铛烤红薯",
                "油焖大虾",
                "黑椒柠檬鸡翅",
                "鸡蛋洋葱炒蝴蝶面"
        };
        final String[] avatars = {
                "https://iconfont.alicdn.com/t/ed46f318-c674-4320-8db4-12f37f4b5476.png",
                "https://iconfont.alicdn.com/t/fdb08ef7-0dbb-46bc-a570-3a50d06f1b40.png",
                "https://iconfont.alicdn.com/t/bcc0bec0-ab90-4680-b21a-485d616ab087.png",
                "https://iconfont.alicdn.com/t/57fcb663-3a3f-4fb6-a75d-ba0baabf1972.png",
                "https://iconfont.alicdn.com/t/ee5cb879-d937-47cf-96ca-347b3f27cff6.png",
                "https://iconfont.alicdn.com/t/4066e6b2-404e-4ab8-ae05-0a95cb806d3a.png",
                "https://iconfont.alicdn.com/t/001bb462-a3ff-4c12-af15-14fa0800049f.png",
                "https://iconfont.alicdn.com/t/1effb3f3-36dd-4665-9e4d-9b290f3bcef8.png",
                "https://iconfont.alicdn.com/t/bdde4f07-08cf-44ff-bb47-2749a9c96b45.png",
                "https://iconfont.alicdn.com/t/9bc98116-f991-46dc-b69d-9c7727c4253c.png"
        };
        final String[] names = {
                "圆小π",
                "莎莎_CwOw",
                "宸·羽",
                "寻梦一ZbDu",
                "_蒍鉨变乖々",
                "线线3896",
                "不愿下楼的猫",
                "l5277",
                "举个栗子喵",
                "花鱼儿"
        };
        List<DiscoverHot> bannerList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            bannerList.add(new DiscoverHot(String.valueOf(i), imgs[i], titles[i], avatars[i],
                    names[i], "2020-09-09"));
        }
        return AjaxResult.success(bannerList);
    }

    /**
     * 发现-热门
     */
    @PostMapping("discoverNew")
    public AjaxResult discoverNew(int pageNo) {
        if (pageNo == 3) {
            return AjaxResult.success();
        }
        List<DiscoverNew> bannerList = new ArrayList<>();
        if (pageNo == 1) {
            DiscoverNew discoverNew = new DiscoverNew();
            discoverNew.setType(0);
            List<DiscoverNew.Data> datas = new ArrayList<>();
            datas.add(new DiscoverNew.Data("1", "1", "1"));
            datas.add(new DiscoverNew.Data("1", "1", "1"));
            discoverNew.setDatas(datas);
            bannerList.add(discoverNew);
        }

        final String[] imgs = {
                "https://i8.meishichina.com/attachment/recipe/2020/09/09/2020090915996290753643751365842.JPG?x-oss-process=style/p800",
                "https://i8.meishichina.com/attachment/recipe/2020/09/09/20200909159962963196032810935645.JPG?x-oss-process=style/p800",
                "https://i8.meishichina.com/attachment/recipe/2020/09/09/2020090915996277345394677796837.jpg?x-oss-process=style/p800",
                "https://i8.meishichina.com/attachment/recipe/2020/09/09/20200909159962686295116810886247.jpg?x-oss-process=style/p800",
                "https://i8.meishichina.com/attachment/recipe/2020/08/17/2020081715976695859577908010238.JPG?x-oss-process=style/p800",
                "https://i8.meishichina.com/attachment/recipe/2020/09/09/2020090915996193657277476038933.jpg?x-oss-process=style/p800",
                "https://i8.meishichina.com/attachment/recipe/2020/09/09/202009091599618389950741426927.jpg?x-oss-process=style/p800",
                "https://i8.meishichina.com/attachment/recipe/2020/09/09/20200909159960915842173310427913.jpg?x-oss-process=style/p800",
                "https://i8.meishichina.com/attachment/recipe/2020/08/10/20200810159701760076629711116030.jpg?x-oss-process=style/p800",
                "https://i8.meishichina.com/attachment/recipe/2020/09/09/202009091599606688412889404188.JPG?x-oss-process=style/p800"
        };
        final String[] titles = {
                "红糖燕麦饼干",
                "番茄虾仁意面",
                "笋干烧肉",
                "番茄鱼丸竹荪汤 ",
                "水煮肉片",
                "火腿鸡蛋沙拉",
                "电饼铛烤红薯",
                "油焖大虾",
                "黑椒柠檬鸡翅",
                "鸡蛋洋葱炒蝴蝶面"
        };
        final String[] avatars = {
                "https://iconfont.alicdn.com/t/ed46f318-c674-4320-8db4-12f37f4b5476.png",
                "https://iconfont.alicdn.com/t/fdb08ef7-0dbb-46bc-a570-3a50d06f1b40.png",
                "https://iconfont.alicdn.com/t/bcc0bec0-ab90-4680-b21a-485d616ab087.png",
                "https://iconfont.alicdn.com/t/57fcb663-3a3f-4fb6-a75d-ba0baabf1972.png",
                "https://iconfont.alicdn.com/t/ee5cb879-d937-47cf-96ca-347b3f27cff6.png",
                "https://iconfont.alicdn.com/t/4066e6b2-404e-4ab8-ae05-0a95cb806d3a.png",
                "https://iconfont.alicdn.com/t/001bb462-a3ff-4c12-af15-14fa0800049f.png",
                "https://iconfont.alicdn.com/t/1effb3f3-36dd-4665-9e4d-9b290f3bcef8.png",
                "https://iconfont.alicdn.com/t/bdde4f07-08cf-44ff-bb47-2749a9c96b45.png",
                "https://iconfont.alicdn.com/t/9bc98116-f991-46dc-b69d-9c7727c4253c.png"
        };
        final String[] names = {
                "圆小π",
                "莎莎_CwOw",
                "宸·羽",
                "寻梦一ZbDu",
                "_蒍鉨变乖々",
                "线线3896",
                "不愿下楼的猫",
                "l5277",
                "举个栗子喵",
                "花鱼儿"
        };

        for (int i = 0; i < 10; i++) {
            bannerList.add(new DiscoverNew(1, imgs[i], titles[i],
                    names[i], avatars[i], ""));
        }
        return AjaxResult.success(bannerList);
    }

    /**
     * 发现-热门
     */
    @PostMapping("discoverRecommend")
    public AjaxResult discoverRecommend(int pageNo) {
        if (pageNo == 3) {
            return AjaxResult.success();
        }

        final String[] imgs = {
                "https://i8.meishichina.com/attachment/recipe/2020/09/09/2020090915996290753643751365842.JPG?x-oss-process=style/p800",
                "https://i8.meishichina.com/attachment/recipe/2020/09/09/20200909159962963196032810935645.JPG?x-oss-process=style/p800",
                "https://i8.meishichina.com/attachment/recipe/2020/09/09/2020090915996277345394677796837.jpg?x-oss-process=style/p800",
                "https://i8.meishichina.com/attachment/recipe/2020/09/09/20200909159962686295116810886247.jpg?x-oss-process=style/p800",
                "https://i8.meishichina.com/attachment/recipe/2020/08/17/2020081715976695859577908010238.JPG?x-oss-process=style/p800",
                "https://i8.meishichina.com/attachment/recipe/2020/09/09/2020090915996193657277476038933.jpg?x-oss-process=style/p800",
                "https://i8.meishichina.com/attachment/recipe/2020/09/09/202009091599618389950741426927.jpg?x-oss-process=style/p800",
                "https://i8.meishichina.com/attachment/recipe/2020/09/09/20200909159960915842173310427913.jpg?x-oss-process=style/p800",
                "https://i8.meishichina.com/attachment/recipe/2020/08/10/20200810159701760076629711116030.jpg?x-oss-process=style/p800",
                "https://i8.meishichina.com/attachment/recipe/2020/09/09/202009091599606688412889404188.JPG?x-oss-process=style/p800"
        };
        final String[] titles = {
                "红糖燕麦饼干",
                "番茄虾仁意面",
                "笋干烧肉",
                "番茄鱼丸竹荪汤 ",
                "水煮肉片",
                "火腿鸡蛋沙拉",
                "电饼铛烤红薯",
                "油焖大虾",
                "黑椒柠檬鸡翅",
                "鸡蛋洋葱炒蝴蝶面"
        };
        final String[] avatars = {
                "https://iconfont.alicdn.com/t/ed46f318-c674-4320-8db4-12f37f4b5476.png",
                "https://iconfont.alicdn.com/t/fdb08ef7-0dbb-46bc-a570-3a50d06f1b40.png",
                "https://iconfont.alicdn.com/t/bcc0bec0-ab90-4680-b21a-485d616ab087.png",
                "https://iconfont.alicdn.com/t/57fcb663-3a3f-4fb6-a75d-ba0baabf1972.png",
                "https://iconfont.alicdn.com/t/ee5cb879-d937-47cf-96ca-347b3f27cff6.png",
                "https://iconfont.alicdn.com/t/4066e6b2-404e-4ab8-ae05-0a95cb806d3a.png",
                "https://iconfont.alicdn.com/t/001bb462-a3ff-4c12-af15-14fa0800049f.png",
                "https://iconfont.alicdn.com/t/1effb3f3-36dd-4665-9e4d-9b290f3bcef8.png",
                "https://iconfont.alicdn.com/t/bdde4f07-08cf-44ff-bb47-2749a9c96b45.png",
                "https://iconfont.alicdn.com/t/9bc98116-f991-46dc-b69d-9c7727c4253c.png"
        };
        final String[] names = {
                "圆小π",
                "莎莎_CwOw",
                "宸·羽",
                "寻梦一ZbDu",
                "_蒍鉨变乖々",
                "线线3896",
                "不愿下楼的猫",
                "l5277",
                "举个栗子喵",
                "花鱼儿"
        };
        final Integer[] width = {
                1423, 3657, 2115, 2924, 1280, 1920, 3264, 596, 3278, 795
        };
        final Integer[] height = {
                2529, 2309, 3762, 1080, 2000, 1080, 1836, 842, 2461, 795
        };
        List<DiscoverRecommend> bannerList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            final DiscoverRecommend discoverRecommend = new DiscoverRecommend(String.valueOf(i), imgs[i], titles[i], avatars[i],
                    names[i], String.valueOf(i));
            discoverRecommend.setWidth(width[i]);
            discoverRecommend.setHeight(height[i]);
            bannerList.add(discoverRecommend);
        }
        return AjaxResult.success(bannerList);
    }

    /**
     * 菜单
     */
    @PostMapping("menuList")
    public AjaxResult menuList(int pageNo) {
        List<MenuData> datas = new ArrayList<>();
        MenuData menuData = new MenuData();
        menuData.setId("1");
        menuData.setAttention("411");
        menuData.setLike("111");
        menuData.setName("早点搭配");
        menuData.setAvatar("https://iconfont.alicdn.com/t/ed46f318-c674-4320-8db4-12f37f4b5476.png");
        menuData.setContent("并不是每天的早餐都是「吐司炒蛋」， 偶尔的「清粥小菜」让日子看起来也很恬淡。");
        menuData.setType("1");
        menuData.setPicUrls(Arrays.asList("http://img.kaiyanapp.com/0-0c160bdf2f1da9833b929e7e4e57b682.jpeg",
                "http://img.kaiyanapp.com/2-0c160bdf2f1da9833b929e7e4e57b682.jpeg",
                "http://img.kaiyanapp.com/1-0c160bdf2f1da9833b929e7e4e57b682.jpeg"));
        datas.add(menuData);

        menuData = new MenuData();
        menuData.setId("2");
        menuData.setAttention("112");
        menuData.setLike("110");
        menuData.setName("左宗棠鸡的做法");
        menuData.setAvatar("https://iconfont.alicdn.com/t/fdb08ef7-0dbb-46bc-a570-3a50d06f1b40.png");
        menuData.setContent("1、鸡腿肉280g切丁，姜片5g，蒜末5g，小米椒适量切段，甜椒20g切块\n" +
                "2、倒入鸡腿肉，蛋黄，盐2g，玉米淀粉25g，搅拌均匀\n" +
                "3、放入糖15g，白醋15g，生抽8g，淀粉5g，辣椒油10g搅拌\n" +
                "4、倒入油200ml，大火烧至七成熟，放入鸡肉，大火炸至表面金黄\n" +
                "5、另起锅倒入食用油5ml，倒入姜片，蒜末，小米椒，大火爆香\n" +
                "6、倒入鸡肉，翻炒均匀，倒入调料 翻炒均匀，倒入甜椒");
        menuData.setType("2");
        menuData.setVideoUrl("https://vdse.bdstatic.com//4ce0a6eeb24802f7f9f4cff911357c5c?authorization=bce-auth-v1%2F40f207e648424f47b2e3dfbb1014b1a5%2F2017-05-11T09%3A02%3A31Z%2F-1%2F%2F5b89ecc8eaa02a42be55690e4417293c4dc719f17e7bfb3610a16292cad44020");
        datas.add(menuData);

        menuData = new MenuData();
        menuData.setId("2");
        menuData.setAttention("161");
        menuData.setLike("121");
        menuData.setName("紫薯山药糕的做法");
        menuData.setAvatar("https://iconfont.alicdn.com/t/bcc0bec0-ab90-4680-b21a-485d616ab087.png");
        menuData.setContent("1、紫薯200克切段，山药150克切段\n" +
                "2、起锅隔水蒸熟，剥皮\n" +
                "3、倒入紫薯，加糖粉10克，捣成泥\n" +
                "4、倒入山药，糖粉10克，捣成泥\n" +
                "5、取山药泥和紫薯泥各25克团成团，取模具按压成型");
        menuData.setType("2");
        menuData.setVideoUrl("https://vdse.bdstatic.com//f13a391bcf73de64c2e965eddae17fc8?authorization=bce-auth-v1%2F40f207e648424f47b2e3dfbb1014b1a5%2F2017-05-11T09%3A02%3A31Z%2F-1%2F%2F05e5f8a459a1c44cf5507778e239fe62d4d63104a5aa5dfdc4b9efbafad673f1");
        datas.add(menuData);

        menuData = new MenuData();
        menuData.setId("2");
        menuData.setAttention("211");
        menuData.setLike("223");
        menuData.setName("猪皮冻的做法");
        menuData.setAvatar("https://iconfont.alicdn.com/t/ee5cb879-d937-47cf-96ca-347b3f27cff6.png");
        menuData.setContent("1、猪皮280克切段，蒜末姜片各5克，香菜7克，小葱一根切段\n" +
                "2、倒入猪皮开水下锅，焯水去腥去血沫\n" +
                "3、清水1升大火煮沸，倒入猪皮，盐2克，生抽15克，老抽5克，倒入姜片，葱段，桂皮一块，八角一个，香叶片，料酒5克，大火煮沸转小火煮5分钟\n" +
                "4、猪皮倒入模具，加入汤汁，冰箱冷冻成型\n" +
                "5、做调料，醋20克，生抽10克，倒入蒜末，香菜，搅拌均匀\n" +
                "6、猪皮冻切片");
        menuData.setType("2");
        menuData.setVideoUrl("https://vdse.bdstatic.com//d48576bd9e61d03d947236dd54e25b84?authorization=bce-auth-v1%2F40f207e648424f47b2e3dfbb1014b1a5%2F2017-05-11T09%3A02%3A31Z%2F-1%2F%2F75f155855b6bf749ab6a60a3ace6555a3a28bfc104884ef72a909afa7f3cbcc4");
        datas.add(menuData);

        menuData = new MenuData();
        menuData.setId("2");
        menuData.setAttention("12");
        menuData.setLike("69");
        menuData.setName("蒸肉丸做法");
        menuData.setAvatar("https://iconfont.alicdn.com/t/001bb462-a3ff-4c12-af15-14fa0800049f.png");
        menuData.setContent("1、香菇30克切末，五花肉150克\n" +
                "2、倒入香菇末，蚝油10克，盐2克，淀粉20克，搅拌均匀\n" +
                "3、馅料揉成丸子，清水500毫升，放上丸子隔水，大火蒸20分钟");
        menuData.setType("2");
        menuData.setVideoUrl("https://vdse.bdstatic.com//d73088a8eb9e9aa0f73a94e946459bbb?authorization=bce-auth-v1%2F40f207e648424f47b2e3dfbb1014b1a5%2F2017-05-11T09%3A02%3A31Z%2F-1%2F%2Fb564affa73db9906e8f7a8fde2814a5512708192fd267f814192eecd349a27ef");
        datas.add(menuData);

        return AjaxResult.success(datas);
    }

    /**
     * 获取用户信息
     */
    @GetMapping("couponList")
    public AjaxResult couponList() {
        List<Coupon> datas = new ArrayList<>();
        Coupon coupon = new Coupon();
        coupon.setDerate("6");
        coupon.setPrice("69");
        coupon.setTitle("4周年神券（厦门通用）");
        coupon.setDeadline("今日有效");
        datas.add(coupon);

        coupon = new Coupon();
        coupon.setDerate("10");
        coupon.setPrice("99");
        coupon.setTitle("4周年神券（厦门通用9月18到9月18日）");
        coupon.setDeadline("9月18~9月18日");
        datas.add(coupon);

        coupon = new Coupon();
        coupon.setDerate("10");
        coupon.setPrice("99");
        coupon.setTitle("4周年神券（厦门通用9月18到9月18日）");
        coupon.setDeadline("9月18~9月18日");
        datas.add(coupon);

        coupon = new Coupon();
        coupon.setDerate("20");
        coupon.setPrice("99");
        coupon.setTitle("4周年神券（厦门通用9月18到9月18日）");
        coupon.setDeadline("9月18~9月18日");
        datas.add(coupon);

        return AjaxResult.success(datas);
    }
}
