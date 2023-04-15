package com.zara.demo.exception;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
/**
 * Entry points for the management of prices
 * @author LD
 */
@Getter
@Setter
public class ApiError {
    private HttpStatus status;
    private String message;
    private LocalDateTime timestamp;
    private String path;


    public ApiError(HttpStatus status, String message, String path) {
        this.status = status;
        this.message = message;
        this.timestamp = LocalDateTime.now();
        this.path = path;
    }
}
