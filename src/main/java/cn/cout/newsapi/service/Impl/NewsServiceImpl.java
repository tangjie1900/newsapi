package cn.cout.newsapi.service.Impl;

import cn.cout.newsapi.entity.NewsRequestEntity;
import cn.cout.newsapi.mapper.NewsMapper;
import cn.cout.newsapi.model.NewsModel;
import cn.cout.newsapi.service.NewsService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
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
        try {
            PageHelper.startPage(start, PAGE_LIMIT);
            Page<NewsModel> newsLinkedLists = newsMapper.findNewsByPage(category);
            System.out.println(48);
        } catch (Exception ex) {
            System.out.println(ex.toString());
            return;
        }
    }

    public  void queryNewsdetailLists()
    {

    }


}
