package cn.eric.blog.model;

import java.sql.Timestamp;

public class Article {
    /** 文章最后更新内容 */
    Timestamp timestamp;
    /** 文章标题 */
    String title;
    /** 作者 */
    String author;
    /** 文章内容 */
    String content;
}
