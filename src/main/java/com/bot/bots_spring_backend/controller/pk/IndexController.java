package com.bot.bots_spring_backend.controller.pk;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wuyesai
 * @className indexController
 * @description TODO
 * @date 2022/11/8 2:18
 */

@Controller
@RequestMapping("/pk/")
public class IndexController {

    @RequestMapping("index/")
    public String index() {
        return "pk/index.html";
    }
}

