package com.nuc.wcj.community.dto;

import com.nuc.wcj.community.model.User;

public class QuestionDto {
    private long id;
    private String title;
    private String description;
    private long gmt_create;
    private long gmt_modified;
    private long creator;
    private long comment_cout;
    private long reader_count;
    private long like_count;
    private String tags;
    private User user;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getGmt_create() {
        return gmt_create;
    }

    public void setGmt_create(long gmt_create) {
        this.gmt_create = gmt_create;
    }

    public long getGmt_modified() {
        return gmt_modified;
    }

    public void setGmt_modified(long gmt_modified) {
        this.gmt_modified = gmt_modified;
    }

    public long getCreator() {
        return creator;
    }

    public void setCreator(long creator) {
        this.creator = creator;
    }

    public long getCommentCout() {
        return comment_cout;
    }

    public void setCommentCout(long commentCout) {
        this.comment_cout = commentCout;
    }

    public long getReaderCount() {
        return reader_count;
    }

    public void setReaderCount(long readerCount) {
        this.reader_count = readerCount;
    }

    public long getLikeCount() {
        return like_count;
    }

    public void setLikeCount(long likeCount) {
        this.like_count = likeCount;
    }

    public String getTag() {
        return tags;
    }

    public void setTag(String tag) {
        this.tags = tag;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "QuestionDto{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", gmt_create=" + gmt_create +
                ", gmt_modified=" + gmt_modified +
                ", creator=" + creator +
                ", commentCout=" + comment_cout +
                ", readerCount=" + reader_count +
                ", likeCount=" + like_count +
                ", tag='" + tags + '\'' +
                ", user=" + user +
                '}';
    }
}
