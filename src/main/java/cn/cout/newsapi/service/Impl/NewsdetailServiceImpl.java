package cn.cout.newsapi.service.Impl;

import cn.cout.newsapi.entity.NewsdetailRequestEntity;
import cn.cout.newsapi.mapper.NewsdetailMapper;
import cn.cout.newsapi.model.Newsdetail;
import cn.cout.newsapi.service.NewsdetailService;
import cn.cout.newsapi.utils.DateUtils;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class NewsdetailServiceImpl implements NewsdetailService {

	@Autowired
	private NewsdetailMapper newsdetailMapper;

	@Override
	public void findbyPage() {
		for (int i = 0; i < 5; i++) {
			PageHelper.startPage(i, 10);
			Page<Newsdetail> newsdetailPage = newsdetailMapper.findNewsdetailPage();
			System.out.println(55555);
		}
	}

	@Override
	public HashMap<String, Object> findNewsContent(NewsdetailRequestEntity ndReqEntity) {
		String groupid = ndReqEntity.getGroupid();
		Newsdetail newsdetail = newsdetailMapper.findNewsContent(groupid);
		HashMap<String, Object> hashMap = new HashMap<String, Object>();
		hashMap.put("id", newsdetail.getId());
		hashMap.put("groupid", newsdetail.getGroupid());
		hashMap.put("title", newsdetail.getTitle());
		hashMap.put("content", newsdetail.getContent());
		hashMap.put("newssource", newsdetail.getNewssource());
		//处理时间
		Long timeL = newsdetail.getPublishtime() < 0 ? 1 : newsdetail.getPublishtime();
		hashMap.put("publishtime", DateUtils.getLong2DateTimeFormat(timeL, "yyyy-MM-dd HH:mm:ss"));
		hashMap.put("sourceimage", newsdetail.getSourceimage());
		return hashMap;
	}
}
