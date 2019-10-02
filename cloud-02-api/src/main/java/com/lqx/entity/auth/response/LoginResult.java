package com.lqx.entity.auth.response;


import com.lqx.model.response.ResponseResult;
import com.lqx.model.response.ResultCode;

public class LoginResult extends ResponseResult {
    public LoginResult(ResultCode resultCode, String token) {
        super(resultCode);
        this.token = token;
    }
    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
