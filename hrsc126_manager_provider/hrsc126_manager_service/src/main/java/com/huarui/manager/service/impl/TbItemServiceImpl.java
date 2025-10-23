package com.huarui.manager.service.impl;

import com.alibaba.dubbo.container.page.PageHandler;
import com.github.pagehelper.PageHelper;
import com.huarui.manager.entity.TbItem;
import com.huarui.manager.entity.TbItemExample;
import com.huarui.manager.mapper.TbItemMapper;
import com.huarui.manager.service.TbItemServicr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2025/10/23 0023.
 */
@Service
public class TbItemServiceImpl implements TbItemServicr {
    @Autowired
    private TbItemMapper mapper;
    @Override
    public List<TbItem> testfindall(int page, int size) {
        PageHelper.startPage(page,size);
        TbItemExample ec=new TbItemExample();
        List<TbItem> list=mapper.selectByExample(ec);
        return list;
    }
}
