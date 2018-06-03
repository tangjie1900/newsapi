package cn.cout.newsapi.service.Impl;

import cn.cout.newsapi.entity.NewsRequestEntity;
import cn.cout.newsapi.mapper.NewsMapper;
import cn.cout.newsapi.model.News;
import cn.cout.newsapi.service.NewsService;
import cn.cout.newsapi.utils.ReplaceUtils;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


@Service
@Transactional(rollbackOn = RuntimeException.class)
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsMapper newsMapper;

    private static final int PAGE_LIMIT = 10;

    @Override
    public void queryPageLists(NewsRequestEntity newsReqEntity) {
        int start = newsReqEntity.getPageCount() <= -1 ? 1 : newsReqEntity.getPageCount();
        int category = newsReqEntity.getCategory() <= -1 || newsReqEntity.getCategory() >= 14 ? 13 : newsReqEntity.getCategory();
        //如果category等于13 则是请求热门新闻

        try {
            PageHelper.startPage(start, PAGE_LIMIT);
            Page<News> newsLinkedLists = newsMapper.findNewsByPage();
            System.out.println(48);
        } catch (Exception ex) {
            System.out.println(ex.toString());
            return;
        }
    }

    @Override
    public HashMap<String, Object> searchNewsByInfos(String keyWords) {
        boolean flag = false;
        if (null == keyWords) {
            keyWords = "";
        }
        List<News> newsList = new ArrayList<News>();
        try {
            StringBuffer sb = new StringBuffer();
            sb.append("%");
            //trim
            sb.append(keyWords.trim());
            sb.append("%");
            String strKeyword = sb.toString();
            newsList = newsMapper.searchNewsByKeyWords(strKeyword);
            flag = true;
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }

        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        hashMap.put("flag", flag);
        hashMap.put("count", newsList.size());
        hashMap.put("data", newsList);
        return hashMap;
    }

    @Override
    public HashMap<String, Object> getAllPictureAndText() {
        return ReplaceUtils.getRepalcesAll();
    }



}
