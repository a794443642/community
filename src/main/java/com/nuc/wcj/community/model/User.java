package com.nuc.wcj.community.model;

public class User {
    private Integer id;
    private String account_id;
    private String name;
    private String token;
    private long gmt_creat;
    private long gmt_modified;
    private String avtar_url;

    public String getAvtar_url() {
        return avtar_url;
    }

    public void setAvtar_url(String avtar_url) {
        this.avtar_url = avtar_url;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount_id() {
        return account_id;
    }

    public void setAccount_id(String account_id) {
        this.account_id = account_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public long getGmt_creat() {
        return gmt_creat;
    }

    public void setGmt_creat(long gmt_creat) {
        this.gmt_creat = gmt_creat;
    }

    public long getGmt_modified() {
        return gmt_modified;
    }

    public void setGmt_modified(long gmt_modified) {
        this.gmt_modified = gmt_modified;
    }
}

