package com.liuhuan.backend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author L_H
 * @since 2026-02-04 13:34:54
 */

@SpringBootApplication
@MapperScan("com.liuhuan.backend.mapper")
public class AICodeUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(AICodeUserApplication.class, args);
    }
}
