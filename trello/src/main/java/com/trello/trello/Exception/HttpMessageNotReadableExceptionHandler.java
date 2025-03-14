package com.trello.trello.Exception;
//bat loi khi request body ko the doc duoc
public class HttpMessageNotReadableExceptionHandler extends RuntimeException{
    public HttpMessageNotReadableExceptionHandler(String message){
        super(message);
    }
}
