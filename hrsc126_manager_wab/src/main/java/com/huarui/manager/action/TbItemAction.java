package com.huarui.manager.action;

import com.huarui.manager.entity.TbItem;
import com.huarui.manager.service.TbItemServicr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Administrator on 2025/10/23 0023.
 */
@Controller
public class TbItemAction {
    @Autowired
    private TbItemServicr servicr;

    @RequestMapping("/item/test")
    @ResponseBody
    public List<TbItem> testfindall(int page, int size){
        return servicr.testfindall(page,size);
    }
}
