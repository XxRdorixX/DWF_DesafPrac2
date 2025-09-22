package com.livingletters.bookapi.exception;

import java.time.LocalDateTime;

/*
  Uniform structure for JSON error responses.
*/
public class ErrorResponse {
    private int status;
    private String error;
    private String message;
    private String field; // optional: affected field
    private LocalDateTime timestamp;

    public ErrorResponse() { }

    public ErrorResponse(int status, String error, String message, String field) {
        this.status = status;
        this.error = error;
        this.message = message;
        this.field = field;
        this.timestamp = LocalDateTime.now();
    }

    // getters & setters

    public int getStatus() { return status; }
    public void setStatus(int status) { this.status = status; }
    public String getError() { return error; }
    public void setError(String error) { this.error = error; }
    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
    public String getField() { return field; }
    public void setField(String field) { this.field = field; }
    public LocalDateTime getTimestamp() { return timestamp; }
    public void setTimestamp(LocalDateTime timestamp) { this.timestamp = timestamp; }
}
