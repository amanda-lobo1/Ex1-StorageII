package com.dh.meli.asperolas.exception;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
public class ExceptionDetails {
    private String message;
    private String title;
    private int status;
    private LocalDateTime timeStamp;
}
