package com.lqx.entity.auth.request;


import com.lqx.model.request.RequestData;

/**
 * Created by admin on 2018/3/5.
 */
public class LoginRequest extends RequestData {

    String username;
    String password;
    String verifycode;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getVerifycode() {
        return verifycode;
    }

    public void setVerifycode(String verifycode) {
        this.verifycode = verifycode;
    }
}
