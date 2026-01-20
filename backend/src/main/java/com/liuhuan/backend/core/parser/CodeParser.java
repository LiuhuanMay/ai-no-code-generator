package com.liuhuan.backend.core.parser;

/**
 * @author L_H
 * @since 2026-01-20 10:37:05
 */
public interface CodeParser<T> {

    /**
     * 解析代码内容
     *
     * @param codeContent 原始代码内容
     * @return 解析后的结果对象
     */
    T parseCode(String codeContent);
}

