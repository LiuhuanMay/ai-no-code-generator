package com.liuhuan.backend.model.dto.app;

import lombok.Data;

import java.io.Serializable;

/**
 * @author L_H
 * @since 2026-01-20 17:13:44
 */
@Data
public class AppUpdateRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    /**
     * 应用名称
     */
    private String appName;

    private static final long serialVersionUID = 1L;
}