package com.liuhuan.backend.model.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author L_H
 * @since 2026-01-19 13:50:55
 */
@Data
public class UserRegisterRequest implements Serializable {

    private static final long serialVersionUID = 3191241716373120793L;

    /**
     * 账号
     */
    private String userAccount;

    /**
     * 密码
     */
    private String userPassword;

    /**
     * 确认密码
     */
    private String checkPassword;
}

