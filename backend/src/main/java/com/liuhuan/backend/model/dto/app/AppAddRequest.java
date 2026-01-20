package com.liuhuan.backend.model.dto.app;

import lombok.Data;

import java.io.Serializable;

/**
 * @author L_H
 * @since 2026-01-20 17:12:51
 */
@Data
public class AppAddRequest implements Serializable {

    /**
     * 应用初始化的 prompt
     */
    private String initPrompt;

    private static final long serialVersionUID = 1L;
}