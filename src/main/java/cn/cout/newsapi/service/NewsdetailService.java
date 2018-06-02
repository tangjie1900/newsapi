package cn.cout.newsapi.service;

import cn.cout.newsapi.entity.NewsdetailRequestEntity;

import java.util.HashMap;

public interface NewsdetailService {
    void findbyPage();

    HashMap<String, Object> findNewsContent(NewsdetailRequestEntity newsdetailReqEntity);


}
