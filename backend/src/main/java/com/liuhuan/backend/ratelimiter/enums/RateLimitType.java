package com.liuhuan.backend.ratelimiter.enums;

/**
 * @author L_H
 * @since 2026-01-27 17:02:12
 */
public enum RateLimitType {

    /**
     * 接口级别限流
     */
    API,

    /**
     * 用户级别限流
     */
    USER,

    /**
     * IP级别限流
     */
    IP
}
