package com.liuhuan.backend.ratelimiter.config;

/**
 * @author L_H
 * @since 2026-01-31 13:11:50
 */
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 限流默认配置属性类
 * 读取 YAML 中配置的默认限流参数
 */
@Component
@ConfigurationProperties(prefix = "rate.limit.default")
@Data
public class RateLimitDefaultProperties {
    // 默认每秒/每分钟允许的请求数
    private int rate = 100;
    // 默认时间窗口（分钟）
    private int rateInterval = 1;
    // 默认提示信息
    private String message = "请求过于频繁，请稍后再试";
}