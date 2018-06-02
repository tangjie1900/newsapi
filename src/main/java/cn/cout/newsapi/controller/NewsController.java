package cn.cout.newsapi.controller;

import cn.cout.newsapi.entity.NewsRequestEntity;
import cn.cout.newsapi.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewsController {

    @Autowired
    private NewsService newsService;

    //http://localhost:8026/getNewsList?category=1&pageCount
    @RequestMapping("/getNewsList")
    public void getNewsList(@ModelAttribute NewsRequestEntity newsReqEntity) {
        newsService.queryPageLists(newsReqEntity);
    }

    @RequestMapping("/getNewsDetail")
    public void getNewsDetail() {

    }

}
