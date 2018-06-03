package cn.cout.newsapi.service.Impl;

import cn.cout.newsapi.entity.NewsdetailRequestEntity;
import cn.cout.newsapi.mapper.NewsdetailMapper;
import cn.cout.newsapi.model.Newsdetail;
import cn.cout.newsapi.service.NewsdetailService;
import cn.cout.newsapi.utils.DateUtils;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class NewsdetailServiceImpl implements NewsdetailService {

    @Autowired
    private NewsdetailMapper newsdetailMapper;

    @Override
    public void findbyPage() {
        for (int i = 0; i < 5; i++) {
            PageHelper.startPage(i, 10);
            Page<Newsdetail> newsdetailPage = newsdetailMapper.findNewsdetailPage();
            System.out.println(55555);
        }
    }

    @Override
    public HashMap<String, Object> findNewsContent(NewsdetailRequestEntity ndReqEntity) {
        List<Newsdetail> newsdetail = new ArrayList<Newsdetail>();
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        boolean flag = false;

        try {
            String groupid = ndReqEntity.getGroupid();
            newsdetail = newsdetailMapper.findNewsContent(groupid);
            flag = true;
        } catch (Exception ex) {
        }

        hashMap.put("flag", flag);
        hashMap.put("data", newsdetail);
        hashMap.put("count", newsdetail.size());
        return hashMap;
    }
}

/*
*   hashMap.put("id", newsdetail.getId());
            hashMap.put("groupid", newsdetail.getGroupid());
            hashMap.put("title", newsdetail.getTitle());
            hashMap.put("content", newsdetail.getContent());
            hashMap.put("newssource", newsdetail.getNewssource());
            //处理时间
            Long timeL = newsdetail.getPublishtime() < 0 ? 1 : newsdetail.getPublishtime();
            hashMap.put("publishtime", DateUtils.getLong2DateTimeFormat(timeL, "yyyy-MM-dd HH:mm:ss"));
            hashMap.put("sourceimage", newsdetail.getSourceimage());
* */
