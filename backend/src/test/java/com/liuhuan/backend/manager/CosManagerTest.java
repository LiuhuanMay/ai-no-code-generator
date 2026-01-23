package com.liuhuan.backend.manager;

import com.qcloud.cos.model.PutObjectResult;
import jakarta.annotation.Resource;
import lombok.Locked;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author L_H
 * @since 2026-01-23 10:22:48
 */
@SpringBootTest
class CosManagerTest {

    @Resource
    private CosManager cosManager;


    @Test
    void putObject() {
        PutObjectResult test = cosManager.putObject("test.png", "F:\\WorkSpace\\ai-no-code-generator\\backend\\tmp\\screenshots\\9d047539\\17785_compressed.jpg");
    }
}