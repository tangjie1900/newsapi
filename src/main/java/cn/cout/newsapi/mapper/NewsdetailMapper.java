package cn.cout.newsapi.mapper;

import cn.cout.newsapi.model.Newsdetail;
import com.github.pagehelper.Page;

public interface NewsdetailMapper {
    Page<Newsdetail> findNewsdetailPage();

    Newsdetail findNewsContent(String groupid);
}
