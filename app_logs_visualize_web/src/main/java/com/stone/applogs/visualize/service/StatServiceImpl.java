package com.stone.applogs.visualize.service;

import com.stone.applogs.visualize.dao.StatMapper;
import com.stone.applogs.visualize.domain.StatBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author stone
 * @date 2019/5/24 09:39
 * description
 */
@Service("statService")
public class StatServiceImpl implements StatService {

    @Autowired
    StatMapper statMapper;

    @Override
    public List<StatBean> findThisWeekNewUsers(String sdk34734) {
        return statMapper.findThisWeekNewUsers(sdk34734);
    }
}

