package cn.cout.newsapi.mapper;

import cn.cout.newsapi.model.NewsModel;
import com.github.pagehelper.Page;


public interface NewsMapper {
    Page<NewsModel> findNewsByPage(int category);
}
