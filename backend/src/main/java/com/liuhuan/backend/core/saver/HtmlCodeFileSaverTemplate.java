package com.liuhuan.backend.core.saver;

import com.liuhuan.backend.ai.model.HtmlCodeResult;
import com.liuhuan.backend.ai.model.enums.CodeGenTypeEnum;

/**
 * @author L_H
 * @since 2026-01-20 15:16:56
 */
public class HtmlCodeFileSaverTemplate extends CodeFileSaverTemplate<HtmlCodeResult> {
    @Override
    protected String getCodeGenType() {
        return CodeGenTypeEnum.HTML.getValue();
    }

    @Override
    protected void saveFiles(HtmlCodeResult result, String baseDirPath) {
        //保存HTML文件
        writeToFile(baseDirPath, "index.html", result.getHtmlCode());
    }
}


