package cn.cout.newsapi.entity;

import org.springframework.beans.factory.annotation.Value;

public class Openscreenimage {

    @Value("${openscreenimage.url}")
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
