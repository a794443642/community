package com.nuc.wcj.community.model;

public class Quesetion {

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


  public long getGmtcreate() {
    return gmt_create;
  }

  public void setGmtcreate(long gmt_create) {
    this.gmt_create = gmt_create;
  }


  public long getGmtmodified() {
    return gmt_modified;
  }

  public void setGmtmodified(long gmt_modified) {
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

}
