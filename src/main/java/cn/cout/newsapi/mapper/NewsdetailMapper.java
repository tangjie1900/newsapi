package cn.cout.newsapi.mapper;

import cn.cout.newsapi.model.Newsdetail;
import com.github.pagehelper.Page;

import java.util.List;

public interface NewsdetailMapper {
    Page<Newsdetail> findNewsdetailPage();

    List<Newsdetail> findNewsContent(String groupid);
}
