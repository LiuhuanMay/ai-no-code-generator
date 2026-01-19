package com.liuhuan.backend.ai.model;

import jdk.jfr.Description;
import lombok.Data;

/**
 * @author L_H
 * @since 2026-01-19 15:33:36
 */
@Description("生成 HTML 代码文件的结果")
@Data
public class HtmlCodeResult {

    @Description("HTML代码")
    private String htmlCode;

    @Description("生成代码的描述")
    private String description;
}

