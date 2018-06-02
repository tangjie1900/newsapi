package cn.cout.newsapi.service;

import cn.cout.newsapi.entity.NewsRequestEntity;

public interface NewsService {
    void queryPageLists(NewsRequestEntity newsReqEntity);
}
