package com.liuhuan.backend.core.saver;


import com.liuhuan.backend.ai.model.HtmlCodeResult;
import com.liuhuan.backend.ai.model.MultiFileCodeResult;
import com.liuhuan.backend.ai.model.enums.CodeGenTypeEnum;
import com.liuhuan.backend.common.ErrorCode;
import com.liuhuan.backend.exception.BusinessException;

import java.io.File;

/**
 * @author L_H
 * @since 2026-01-20 15:28:09
 */
public class CodeFileSaverExecutor {

    private static final HtmlCodeFileSaverTemplate htmlCodeFileSaver = new HtmlCodeFileSaverTemplate();

    private static final MultiFileCodeFileSaverTemplate multiFileCodeFileSaver = new MultiFileCodeFileSaverTemplate();

    /**
     * 执行代码保存
     *
     * @param codeResult  代码结果对象
     * @param codeGenType 代码生成类型
     * @return 保存的目录
     */
    public static File executeSaver(Object codeResult, CodeGenTypeEnum codeGenType) {
        return switch (codeGenType) {
            case HTML -> htmlCodeFileSaver.saveCode((HtmlCodeResult) codeResult);
            case MULTI_FILE -> multiFileCodeFileSaver.saveCode((MultiFileCodeResult) codeResult);
            default -> throw new BusinessException(ErrorCode.SYSTEM_ERROR, "不支持的代码生成类型: " + codeGenType);
        };
    }
}

