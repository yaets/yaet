package com.yaet.blog.pojo;

import java.io.Serializable;

public class Article implements Serializable {

    private static final long serialVersionUID = 187510490137326821L;

    private String articleId;

    private String articleTitle;

    private String articleCreateDate;

    private String articleCreateTime;

    private String articleUpdateDate;

    private String articleUpdateTime;

    private String articleTags;

    private String articleCommentCount;

    private String articleViewCount;

    private String articleComments;

    private String articlePutTop;

    private String articleAuthorEmail;

    private String articleCommentable;

    private String articleViewPwd;

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getArticleCreateDate() {
        return articleCreateDate;
    }

    public void setArticleCreateDate(String articleCreateDate) {
        this.articleCreateDate = articleCreateDate;
    }

    public String getArticleCreateTime() {
        return articleCreateTime;
    }

    public void setArticleCreateTime(String articleCreateTime) {
        this.articleCreateTime = articleCreateTime;
    }

    public String getArticleUpdateDate() {
        return articleUpdateDate;
    }

    public void setArticleUpdateDate(String articleUpdateDate) {
        this.articleUpdateDate = articleUpdateDate;
    }

    public String getArticleUpdateTime() {
        return articleUpdateTime;
    }

    public void setArticleUpdateTime(String articleUpdateTime) {
        this.articleUpdateTime = articleUpdateTime;
    }

    public String getArticleTags() {
        return articleTags;
    }

    public void setArticleTags(String articleTags) {
        this.articleTags = articleTags;
    }

    public String getArticleCommentCount() {
        return articleCommentCount;
    }

    public void setArticleCommentCount(String articleCommentCount) {
        this.articleCommentCount = articleCommentCount;
    }

    public String getArticleViewCount() {
        return articleViewCount;
    }

    public void setArticleViewCount(String articleViewCount) {
        this.articleViewCount = articleViewCount;
    }

    public String getArticleComments() {
        return articleComments;
    }

    public void setArticleComments(String articleComments) {
        this.articleComments = articleComments;
    }

    public String getArticlePutTop() {
        return articlePutTop;
    }

    public void setArticlePutTop(String articlePutTop) {
        this.articlePutTop = articlePutTop;
    }

    public String getArticleAuthorEmail() {
        return articleAuthorEmail;
    }

    public void setArticleAuthorEmail(String articleAuthorEmail) {
        this.articleAuthorEmail = articleAuthorEmail;
    }

    public String getArticleCommentable() {
        return articleCommentable;
    }

    public void setArticleCommentable(String articleCommentable) {
        this.articleCommentable = articleCommentable;
    }

    public String getArticleViewPwd() {
        return articleViewPwd;
    }

    public void setArticleViewPwd(String articleViewPwd) {
        this.articleViewPwd = articleViewPwd;
    }

    @Override
    public String toString() {
        return "Article{" +
                "articleId='" + articleId + '\'' +
                ", articleTitle='" + articleTitle + '\'' +
                ", articleCreateDate='" + articleCreateDate + '\'' +
                ", articleCreateTime='" + articleCreateTime + '\'' +
                ", articleUpdateDate='" + articleUpdateDate + '\'' +
                ", articleUpdateTime='" + articleUpdateTime + '\'' +
                ", articleTags='" + articleTags + '\'' +
                ", articleCommentCount='" + articleCommentCount + '\'' +
                ", articleViewCount='" + articleViewCount + '\'' +
                ", articleComments='" + articleComments + '\'' +
                ", articlePutTop='" + articlePutTop + '\'' +
                ", articleAuthorEmail='" + articleAuthorEmail + '\'' +
                ", articleCommentable='" + articleCommentable + '\'' +
                ", articleViewPwd='" + articleViewPwd + '\'' +
                '}';
    }
}
