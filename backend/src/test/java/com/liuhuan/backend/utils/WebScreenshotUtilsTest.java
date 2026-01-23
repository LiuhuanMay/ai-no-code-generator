package com.liuhuan.backend.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author L_H
 * @since 2026-01-23 09:50:55
 */
class WebScreenshotUtilsTest {

    @Test
    void saveWebPageScreenshot() {
        WebScreenshotUtils.saveWebPageScreenshot("https://www.doubao.com/chat/36403190662943234");
    }
}