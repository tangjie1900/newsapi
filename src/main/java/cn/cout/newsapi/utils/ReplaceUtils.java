package cn.cout.newsapi.utils;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class ReplaceUtils {
    public static HashMap<String, Object> getRepalcesAll() {
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        //已结束
        hashMap.put("yjs", "https://jyjf-public.oss-cn-hangzhou.aliyuncs.com/common/6ddf71147639ffcd06bf3a5358bcad71%403x.png");
        //农业银行
        hashMap.put("nybank", "https://jyjf-public.oss-cn-hangzhou.aliyuncs.com/common/ABC%E5%86%9C%E4%B8%9A%E9%93%B6%E8%A1%8C%403x.png");
        //中国银行
        hashMap.put("zgbank", "https://jyjf-public.oss-cn-hangzhou.aliyuncs.com/common/Bank_Of_China%403x.png");
        //交通银行
        hashMap.put("jtbank", "https://jyjf-public.oss-cn-hangzhou.aliyuncs.com/common/Bank_Of_Communications%403x.png");
        //中信银行
        hashMap.put("zxbank", "https://jyjf-public.oss-cn-hangzhou.aliyuncs.com/common/China_Citic_Back%403x.png");
        //中国工商银行
        hashMap.put("zggsbank", "https://jyjf-public.oss-cn-hangzhou.aliyuncs.com/common/ICBC%403x.png");
        //常见问题
        hashMap.put("cjwt", "https://jyjf-public.oss-cn-hangzhou.aliyuncs.com/common/cjwt-pic%403x.png");
        //产品简介
        hashMap.put("cpjj", "https://jyjf-public.oss-cn-hangzhou.aliyuncs.com/common/cpjj-pic%403x.png");
        //管理团队
        hashMap.put("gltd", "https://jyjf-public.oss-cn-hangzhou.aliyuncs.com/common/gltd-pic%403x.png");
        //公司介绍
        hashMap.put("gsjs", "https://jyjf-public.oss-cn-hangzhou.aliyuncs.com/common/gsjs-pic%403x.png");
        //满标奖
        hashMap.put("mbj", "https://jyjf-public.oss-cn-hangzhou.aliyuncs.com/common/mbj-icon%403x.png");
        //平台资质
        hashMap.put("ptzz", "https://jyjf-public.oss-cn-hangzhou.aliyuncs.com/common/ptzz-pic%403x.png");
        //平台公告
        hashMap.put("ptgg", "https://jyjf-public.oss-cn-hangzhou.aliyuncs.com/common/pygg-pic%403x.png");
        //首标奖
        hashMap.put("sbj", "https://jyjf-public.oss-cn-hangzhou.aliyuncs.com/common/sbj-icon%20copy%403x.png");
        //已还款
        hashMap.put("img_yhk", "https://jyjf-public.oss-cn-hangzhou.aliyuncs.com/common/yihuank-icon%403x.png");
        //上海银行
        hashMap.put("shbank", "https://jyjf-public.oss-cn-hangzhou.aliyuncs.com/common/%E4%B8%8A%E6%B5%B7%E9%93%B6%E8%A1%8C%281%29%403x.png");
        //中国邮政储蓄
        hashMap.put("zgyzbank", "https://jyjf-public.oss-cn-hangzhou.aliyuncs.com/common/%E4%B8%AD%E5%9B%BD%E9%82%AE%E6%94%BF%E5%82%A8%E8%93%84%403x.png");
        //光大银行
        hashMap.put("gdbank", "https://jyjf-public.oss-cn-hangzhou.aliyuncs.com/common/%E5%85%89%E5%A4%A7%E9%93%B6%E8%A1%8C%403x.png");
        //兴业银行
        hashMap.put("xybank", "https://jyjf-public.oss-cn-hangzhou.aliyuncs.com/common/%E5%85%B4%E4%B8%9A%E9%93%B6%E8%A1%8C%403x.png");
        //北京银行
        hashMap.put("bjbank", "https://jyjf-public.oss-cn-hangzhou.aliyuncs.com/common/%E5%8C%97%E4%BA%AC%E9%93%B6%E8%A1%8C%403x.png");
        //华夏银行
        hashMap.put("hxbank", "https://jyjf-public.oss-cn-hangzhou.aliyuncs.com/common/%E5%8D%8E%E5%A4%8F%E9%93%B6%E8%A1%8C%403x.png");
        //平安银行
        hashMap.put("pabank", "https://jyjf-public.oss-cn-hangzhou.aliyuncs.com/common/%E5%B9%B3%E5%AE%89%E9%93%B6%E8%A1%8C%403x.png");
        //广发银行
        hashMap.put("gfbank", "https://jyjf-public.oss-cn-hangzhou.aliyuncs.com/common/%E5%B9%BF%E5%8F%91%403x.png");
        //建设银行
        hashMap.put("jsbank", "https://jyjf-public.oss-cn-hangzhou.aliyuncs.com/common/%E5%BB%BA%E8%AE%BE%E9%93%B6%E8%A1%8C%403x.png");
        //招商银行
        hashMap.put("zsbank", "https://jyjf-public.oss-cn-hangzhou.aliyuncs.com/common/%E6%8B%9B%E5%95%86%403x.png");
        //民生银行
        hashMap.put("msbank", "https://jyjf-public.oss-cn-hangzhou.aliyuncs.com/common/%E6%B0%91%E7%94%9F%E9%93%B6%E8%A1%8C%403x.png");
        //浦发银行
        hashMap.put("pfbank", "https://jyjf-public.oss-cn-hangzhou.aliyuncs.com/common/%E6%B5%A6%E5%8F%91%403x.png");
        //投资期限
        hashMap.put("qxtz", "投资期限");
        //起购
        hashMap.put("qg", "起购");
        //期望年化收益率
        hashMap.put("qwnhsyl", "期望年化收益率");
        //计息方式
        hashMap.put("jxfs", "计息方式");
        //还款时间
        hashMap.put("hksj", "还款时间");
        //还款方式
        hashMap.put("hkfs", "还款方式");
        //投资记录
        hashMap.put("txt_tzjl", "投资记录");
        //投资总额
        hashMap.put("txt_tzze", "投资总额");
        //收益期限
        hashMap.put("syqx", "收益期限");
        //起投金额
        hashMap.put("qtje", "起投金额");
        //购买金额
        hashMap.put("gmje", "购买金额");
        //剩余可投
        hashMap.put("sykt", "剩余可投");
        //账户余额
        hashMap.put("zhye", "账户余额");
        //充值
        hashMap.put("cz", "充值");
        //提现
        hashMap.put("tx", "提现");
        //投资记录
        hashMap.put("tzjl", "投资记录");
        //
        hashMap.put("hkjh", "回款计划");
        //
        hashMap.put("zjmx", "资金明细");
        //
        hashMap.put("wdhb", "我的红包");
        //
        hashMap.put("jxq", "加息券");
        //
        hashMap.put("gfqq", "官方qq群:713293510");
        //
        hashMap.put("kfrx", "客服热线: 400-6896-880");
        //
        hashMap.put("vipwx", "vip专属客服微信: jinyoujf");
        //
        hashMap.put("czjl", "充值记录");
        //
        hashMap.put("txjl", "提现记录");
        //
        hashMap.put("ktxje", "可提现金额");
        //
        hashMap.put("txje", "提现金额");
        //
        hashMap.put("sxf", "手续费");
        //
        hashMap.put("sjdz", "实际到账");
        //
        hashMap.put("mftxbbk", "免费提现不包括充值15天内未投资金额");
        //
        hashMap.put("txgz", "提现规则");
        //
        hashMap.put("dhk", "待回款");
        //
        hashMap.put("yhk", "已回款");
        //
        hashMap.put("jx", "加息");
        //
        hashMap.put("yhkgl", "银行卡管理");
        //
        hashMap.put("tzze", "投资总额");
        //
        hashMap.put("lztz", "立即投资");
        //
        hashMap.put("jymm", "交易密码");
        //
        hashMap.put("wy", "万元");
        //
        hashMap.put("zcyl", "注册有礼");
        //
        hashMap.put("xtfl", "续投福利");
        //
        hashMap.put("ytdz", "约投定制");
        //
        hashMap.put("aqbz", "安全保障");
        //
        hashMap.put("txtCPJJ", "产品简介");
        //
        hashMap.put("txtGLTD", "管理团队");
        //
        hashMap.put("txtPTZZ", "平台资质");
        //
        hashMap.put("txtPTGG", "平台公告");
        //
        hashMap.put("txtMTBD", "媒体报道");
        //
        hashMap.put("txtCJWT", "常见问题");

        return hashMap;

    }
}
