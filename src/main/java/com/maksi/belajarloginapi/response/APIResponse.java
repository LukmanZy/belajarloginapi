package com.maksi.belajarloginapi.response;

import org.springframework.http.HttpStatus;

public class APIResponse {

    private Integer status;
    private Object massage;
    private Object error;

    public APIResponse(Object massage, Object error) {
        this.massage = massage;
        this.error = error;
    }

    public APIResponse() {
        this.status = HttpStatus.OK.value();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Object getMassage() {
        return massage;
    }

    public void setMassage(Object massage) {
        this.massage = massage;
    }

    public Object getError() {
        return error;
    }

    public void setError(Object error) {
        this.error = error;
    }
}
