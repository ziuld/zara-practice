package com.zara.demo.exception;

/**
 * Entry points for the management RuntimeException
 *
 * @author LD
 */public class NotFoundException extends RuntimeException {

    public NotFoundException(String message){
        super(message);
    }
}
