package com.gdyakj.bdtg;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.gdyakj.bdtg.dao")
public class BdtgApplication {

    public static void main(String[] args) {
        SpringApplication.run(BdtgApplication.class, args);
    }

}
