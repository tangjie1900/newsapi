package cn.cout.newsapi.service.Impl;

import cn.cout.newsapi.entity.NewsRequestEntity;
import cn.cout.newsapi.entity.Openscreenimage;
import cn.cout.newsapi.mapper.NewsMapper;
import cn.cout.newsapi.model.News;
import cn.cout.newsapi.service.NewsService;
import cn.cout.newsapi.utils.ReplaceUtils;
import cn.cout.newsapi.utils.ResultMessage;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.*;


@Service
@Transactional(rollbackOn = RuntimeException.class)
public class NewsServiceImpl implements NewsService {

    private static Logger logger = Logger.getLogger(NewsServiceImpl.class);

    @Autowired
    private NewsMapper newsMapper;

    private static final int PAGE_LIMIT = 10;

    // int category,int startrow,int limitcount

    /**
     * 向下翻页
     */
    @Override
    public HashMap<String, Object> queryPageLists(NewsRequestEntity newsReqEntity) {
        boolean flag = false;
        String msg = ResultMessage.SERVER_OK;
        List<News> newsLists = new LinkedList<>();
        HashMap<String, Object> hashMap = new LinkedHashMap<String, Object>();

        int start = newsReqEntity.getPageCount();
        int category = newsReqEntity.getCategory();
        if (start >= 1 && category >= 0 && category <= 13) {
            //请求的是页数 我们用limit 要转化成条数
            int startrow = (start - 1) * PAGE_LIMIT;
            //如果category等于13 则是请求热门新闻
            try {
                newsLists = newsMapper.findNewsByPage(category, startrow, PAGE_LIMIT);
                flag = true;
            } catch (Exception ex) {
                msg = ResultMessage.SERVER_ERROR;
                logger.error(ex.toString());
            }
        } else {
            msg = ResultMessage.ARGS_ERROR;
            msg = String.format("%s pageCount:%s category:%s", msg, start, category);
            logger.error(msg);
        }
        hashMap.put("flag", flag);
        hashMap.put("msg", msg);
        hashMap.put("count", newsLists.size());
        hashMap.put("data", newsLists);
        return hashMap;
    }

    /**
     * title关键词搜索
     */
    @Override
    public HashMap<String, Object> searchNewsByInfos(String keyWords) {
        boolean flag = false;
        String msg = ResultMessage.SERVER_OK;
        HashMap<String, Object> hashMap = new HashMap<String, Object>();

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
            msg = ResultMessage.ARGS_ERROR;
            logger.error(ex.toString());
        }


        hashMap.put("flag", flag);
        hashMap.put("msg", msg);
        hashMap.put("count", newsList.size());
        hashMap.put("data", newsList);
        return hashMap;
    }


    /**
     * 获取所有要替换的文本以及数据
     */
    @Override
    public HashMap<String, Object> getAllPictureAndText() {
        return ReplaceUtils.getRepalcesAll();
    }

}
