package com.trello.trello.Exception;


//loi tu choi truy cap
public class AccessDeniedException extends RuntimeException{
    public AccessDeniedException(String message){
        super(message);
    }
}
