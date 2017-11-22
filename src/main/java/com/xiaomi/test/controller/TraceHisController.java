package com.xiaomi.test.controller;

import com.xiaomi.test.sharding.entity.ATracehis;
import com.xiaomi.test.sharding.service.ATraceHisService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author huxiangwei
 * @version v1.0
 * @Package com.xiaomi.test.controller
 * @Description:
 * @date 2017/11/22 10:28
 */
@Controller
public class TraceHisController {

    @Resource
    private ATraceHisService service;

    @RequestMapping("/index")
    public @ResponseBody String Hello() {
        return "hello";
    }

    @RequestMapping(value = "/traceHis", method={RequestMethod.GET})
    public @ResponseBody ATracehis traceHis() {
        return service.selectByKey(6174L);
    }
}
