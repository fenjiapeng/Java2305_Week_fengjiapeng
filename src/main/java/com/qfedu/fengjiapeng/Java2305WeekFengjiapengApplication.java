package com.qfedu.fengjiapeng;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.qfedu.fengjiapeng.dao")
public class Java2305WeekFengjiapengApplication {

    public static void main(String[] args) {
        SpringApplication.run(Java2305WeekFengjiapengApplication.class, args);
    }

}
