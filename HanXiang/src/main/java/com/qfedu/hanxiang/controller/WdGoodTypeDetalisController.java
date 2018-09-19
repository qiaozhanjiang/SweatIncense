package com.qfedu.hanxiang.controller;

import com.qfedu.hanxiang.pojo.WdGoodSize;
import com.qfedu.hanxiang.pojo.WdGoodTypeDetali;
import com.qfedu.hanxiang.service.WdGoodSizeService;
import com.qfedu.hanxiang.service.WdGoodTypeDetailService;
import com.qfedu.hanxiang.vo.RList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class WdGoodTypeDetalisController {

    @Autowired
    private WdGoodTypeDetailService wdGoodTypeDetailService;

    @Autowired
    private WdGoodSizeService wdGoodSizeService;


    @RequestMapping("/goodtypedetail.do")
    @ResponseBody
    public RList<WdGoodTypeDetali> detaliRList(int id) {
        List<WdGoodTypeDetali> wdGoodTypeDetalis = wdGoodTypeDetailService.queryAll(id);
        if (wdGoodTypeDetalis != null) {
            RList<WdGoodTypeDetali> rList = new RList(0, "成功", wdGoodTypeDetalis);
            return rList;
        } else {
            return RList.error();
        }
    }

    @RequestMapping("/goodtypesize.do")
    @ResponseBody
    public RList<WdGoodSize> sizeRList(int id) {
        List<WdGoodSize> wdGoodSizes = wdGoodSizeService.queryAll(id);
        if (wdGoodSizes != null) {
            RList<WdGoodSize> rList = new RList<>(0, "成功", wdGoodSizes);
            return rList;
        } else {
            return RList.error();
        }
    }

}
