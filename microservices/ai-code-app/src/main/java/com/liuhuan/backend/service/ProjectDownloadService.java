package com.liuhuan.backend.service;

import jakarta.servlet.http.HttpServletResponse;

/**
 * @author L_H
 * @since 2026-01-23 11:29:32
 */
public interface ProjectDownloadService {

    /**
     * 下载项目为压缩包
     *
     * @param projectPath
     * @param downloadFileName
     * @param response
     */
    void downloadProjectAsZip(String projectPath, String downloadFileName, HttpServletResponse response);
}
