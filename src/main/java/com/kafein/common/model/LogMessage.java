package com.kafein.common.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LogMessage {
    private String eventId;
    private String payload;
    private long timestamp;
}

