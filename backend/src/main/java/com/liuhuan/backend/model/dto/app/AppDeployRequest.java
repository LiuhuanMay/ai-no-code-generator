package com.liuhuan.backend.model.dto.app;

import lombok.Data;

import java.io.Serializable;

/**
 * @author L_H
 * @since 2026-01-21 11:25:54
 */
@Data
public class AppDeployRequest implements Serializable {

    /**
     * 应用 id
     */
    private Long appId;

    private static final long serialVersionUID = 1L;
}
