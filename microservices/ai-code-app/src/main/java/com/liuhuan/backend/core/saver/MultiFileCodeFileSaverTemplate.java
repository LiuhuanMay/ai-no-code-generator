package com.liuhuan.backend.core.saver;

import com.liuhuan.backend.ai.model.MultiFileCodeResult;
import com.liuhuan.backend.model.enums.CodeGenTypeEnum;

/**
 * @author L_H
 * @since 2026-01-20 15:23:40
 */
/**
 * 多文件代码保存器
 *
 * @author yupi
 */
public class MultiFileCodeFileSaverTemplate extends CodeFileSaverTemplate<MultiFileCodeResult> {


    @Override
    protected String getCodeGenType() {
        return CodeGenTypeEnum.MULTI_FILE.getValue();
    }

    @Override
    protected void saveFiles(MultiFileCodeResult result, String baseDirPath) {
        // 保存 HTML 文件
        writeToFile(baseDirPath, "index.html", result.getHtmlCode());
        // 保存 CSS 文件
        writeToFile(baseDirPath, "style.css", result.getCssCode());
        // 保存 JavaScript 文件
        writeToFile(baseDirPath, "script.js", result.getJsCode());
    }
}

