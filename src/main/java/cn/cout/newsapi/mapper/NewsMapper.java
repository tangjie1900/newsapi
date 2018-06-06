package cn.cout.newsapi.mapper;

import cn.cout.newsapi.model.News;
import org.apache.ibatis.annotations.Param;
import java.util.List;


public interface NewsMapper {

    List<News> findNewsByPage(@Param("category") int category, @Param("startrow") int startrow, @Param("limitcount") int limitcount);

    List<News> searchNewsByKeyWords(String keyWords);

}
