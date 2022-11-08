package com.bot.bots_spring_backend.controller.pk;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wuyesai
 * @className BotInfoController
 * @description TODO
 * @date 2022/11/8 8:23
 */
@RequestMapping("/pk/")
@RestController
public class BotInfoController {

    @RequestMapping("getbotinfo/")
    public String getBotInfo() {
        return "hhhh";
    }
}
