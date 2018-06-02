package cn.cout.newsapi;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@org.mybatis.spring.annotation.MapperScan(basePackages = "cn.cout.newsapi.mapper")
public class NewsapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(NewsapiApplication.class, args);
    }
}
