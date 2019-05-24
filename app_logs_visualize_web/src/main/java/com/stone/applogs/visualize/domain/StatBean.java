package com.stone.applogs.visualize.domain;

/**
 * @author stone
 * @date 2019/5/24 09:35
 * description
 */
public class StatBean {
    //统计日期
    private String date ;
    //统计数量
    private long count ;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

}
