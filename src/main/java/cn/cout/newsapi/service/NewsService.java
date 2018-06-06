package cn.cout.newsapi.service;

import cn.cout.newsapi.entity.NewsRequestEntity;

import java.util.HashMap;

public interface NewsService {
    HashMap<String, Object> queryPageLists(NewsRequestEntity newsReqEntity);

    HashMap<String, Object> searchNewsByInfos(String keyWords);

    HashMap<String, Object> getAllPictureAndText();


}
