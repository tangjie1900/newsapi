package cn.cout.newsapi.controller;

import cn.cout.newsapi.entity.NewsRequestEntity;
import cn.cout.newsapi.entity.Openscreenimage;
import cn.cout.newsapi.entity.ResultVo;
import cn.cout.newsapi.service.NewsService;
import cn.cout.newsapi.utils.ResultUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class NewsController {

    @Autowired
    private NewsService newsService;

    /**
     * 获取新闻分类的10条数据
     * <p>
     * http://localhost:8026/getNewsList?category=1&pageCount=2
     */
    @RequestMapping("/getNewsList")
    @ResponseBody
    public ResultVo getNewsList(@ModelAttribute NewsRequestEntity newsReqEntity) {
        HashMap<String, Object> hashMap = newsService.queryPageLists(newsReqEntity);
        ResultVo resultVo = ResultUtils.getSuccessResult(hashMap);
        return resultVo;
    }

    /**
     * 搜索新闻
     * <p>
     * http://localhost:8026/searchnews?keyWords=有的
     */
    @RequestMapping("/searchnews")
    @ResponseBody
    public ResultVo searchNews(String keyWords) {
        HashMap<String, Object> hashMap = newsService.searchNewsByInfos(keyWords);
        ResultVo resultVo = ResultUtils.getSuccessResult(hashMap);
        return resultVo;
    }


    @RequestMapping("/getAllPicAndTexts")
    @ResponseBody
    public ResultVo getAllPicAndTexts() {
        HashMap<String, Object> hashMap = newsService.getAllPictureAndText();
        ResultVo resultVo = ResultUtils.getSuccessResult(hashMap);
        return resultVo;
    }

}
