package cn.cout.newsapi.controller;

import cn.cout.newsapi.entity.NewsdetailRequestEntity;
import cn.cout.newsapi.model.Newsdetail;
import cn.cout.newsapi.service.NewsdetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class NewsdetailController {

    @Autowired
    private NewsdetailService newsdetailService;

    // http://localhost:8026/getNewsContent?groupid=6560287812984242702
    @RequestMapping("/getNewsContent")
    @ResponseBody
    public ResponseEntity getNewsDetail(@ModelAttribute NewsdetailRequestEntity newsdetailReqEntity) {
        HashMap hashMap = newsdetailService.findNewsContent(newsdetailReqEntity);
        return new ResponseEntity<>(hashMap, HttpStatus.OK);
    }


}
