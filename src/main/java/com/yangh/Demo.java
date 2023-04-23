package com.yangh;

import org.apache.commons.lang3.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.concurrent.ScheduledFuture;

/**
 * @author "杨航_2211"
 * @Descript {
 * 介绍：
 * }
 * @Project SpringCloud-Alibaba
 * @date 2023/04/13 上午 10:06
 */
@RestController
public class Demo {
    @Autowired
    private ThreadPoolTaskScheduler taskScheduler;
    @GetMapping("/jianqian")
    public String demo() {
        Date date = DateUtils.addSeconds(new Date(), 30);
        ScheduledFuture<?> schedule = taskScheduler.schedule(() -> {
            System.out.println("执行定时任务-测试构建9");
        }, date);
        return "{222:222}";
    }
}
