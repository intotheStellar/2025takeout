package com.sky.task;

import com.sky.mapper.ShoppingCartMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Slf4j

public class MyTask {

//    @Scheduled(cron="0/5 * * * * ?")
//    public void execute() {
//        log.info("定时任务执行:{}",new Date());
//    }
}
