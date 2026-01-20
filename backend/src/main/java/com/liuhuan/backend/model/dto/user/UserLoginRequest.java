package com.liuhuan.backend.model.dto.user;

import lombok.Data;

import java.io.Serializable;

/**
 * @author L_H
 * @since 2026-01-19 13:55:57
 */
@Data
public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = 3191241716373120793L;

    /**
     * 账号
     */
    private String userAccount;

    /**
     * 密码
     */
    private String userPassword;
}

