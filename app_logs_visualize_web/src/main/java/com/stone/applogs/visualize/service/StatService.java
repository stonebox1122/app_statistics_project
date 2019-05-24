package com.stone.applogs.visualize.service;

import com.stone.applogs.visualize.domain.StatBean;

import java.util.List;

/**
 * @author stone
 * @date 2019/5/24 09:38
 * description
 */
public interface StatService {
    List<StatBean> findThisWeekNewUsers(String appid);
}
