package com.uptodate.entity;

/**
 * Created by shahs on 2/24/2017.
 */
public class Response {
    private String message;
    private String uniqueId;

    public Response() {
    }

    public Response(String message) {
        this.message = message;
    }

    public Response(String message, String uniqueId) {
        this.message = message;
        this.uniqueId = uniqueId;
    }

    public String getMessage(){ return message; }
    public String getUniqueId(){ return uniqueId; }

    @Override
    public String toString() {
        return "Response{" +
                "message='" + message + '\'' +
                ", uniqueId='" + uniqueId + '\'' +
                '}';
    }
}
