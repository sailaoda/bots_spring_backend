package com.bot.bots_spring_backend.controller.pk;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

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
    public List<String> getBotInfo() {
        List<String> botInfo = new ArrayList<>();
        botInfo.add("wuyesai");
        botInfo.add("dfdfdfdf");
        botInfo.add("121212");
        return botInfo;
    }
}
