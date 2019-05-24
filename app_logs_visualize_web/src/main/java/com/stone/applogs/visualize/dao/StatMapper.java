package com.stone.applogs.visualize.dao;

import com.stone.applogs.visualize.domain.StatBean;

import java.util.List;

/**
 * @author stone
 * @date 2019/5/24 09:30
 * description
 */
public interface StatMapper<T> {
    List<StatBean> findThisWeekNewUsers(String appid);
}
