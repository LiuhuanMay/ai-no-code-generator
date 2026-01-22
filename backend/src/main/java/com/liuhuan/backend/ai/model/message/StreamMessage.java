package com.liuhuan.backend.ai.model.message;

/**
 * @author L_H
 * @since 2026-01-22 13:39:41
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 流式消息响应基类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StreamMessage {
    private String type;
}
