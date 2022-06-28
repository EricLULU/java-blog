package cn.eric.blog.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 控制层
 * 主要实现：
 *     1.文章的添加
 *     2.查看文章
 *     3.修改
 *     4.获取文章列表：
 *         4.1 文章标题
 *         4.2 作者
 *         4.3 修改时间
 */
@RestController("/")
public class BlogCOntroller {
    Logger logger = LoggerFactory.getLogger(BlogCOntroller.class);
    @GetMapping("get")
    public String getTest(){
        logger.info("hehe");
        return "hello,world";
    }
}
