package com.yangbw.test.api.controller;

import com.yangbw.test.api.common.AjaxResult;
import com.yangbw.test.api.domain.*;
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
public class DiscoverController {

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
     * 点赞操作
     *
     * @param id 热门ID
     * @return 操作结果
     */
    @PostMapping("discoverRecommendLike")
    public AjaxResult discoverRecommendLike(String id) {
        return AjaxResult.success();
    }

}
