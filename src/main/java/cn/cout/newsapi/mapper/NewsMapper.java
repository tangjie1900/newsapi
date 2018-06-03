package cn.cout.newsapi.mapper;

import cn.cout.newsapi.model.News;
import com.github.pagehelper.Page;

import java.util.List;


public interface NewsMapper {
	Page<News> findNewsByPage();

	List<News> searchNewsByKeyWords(String keyWords);

//	Page<News> findNewsByPage(int category);
}
