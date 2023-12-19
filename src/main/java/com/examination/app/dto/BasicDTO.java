package com.examination.app.dto;

public class BasicDTO<T> {

    // Flag indicating the success status of the operation.
    private boolean isSuccess;

    private String message;

    // Data associated with the response.
    private T data;

    public BasicDTO() {
		super();
	}
    
    public BasicDTO(T data) {
        this.data = data;
        isSuccess = true;
        message = "Login Successfully";
    }

    public BasicDTO(boolean isSuccess, String message, T data) {
        this.isSuccess = isSuccess;
        this.message = message;
        this.data = data;
    }
    
    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
