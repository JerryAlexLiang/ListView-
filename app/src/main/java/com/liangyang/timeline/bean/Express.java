package com.liangyang.timeline.bean;

/**
 * 创建日期：2017/1/17 on 10:14
 * 作者:杨亮 liangyang
 * 描述:javaBean
 */
public class Express {

    private String content;
    private String time;

    public Express(String content, String time) {
        this.content = content;
        this.time = time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
