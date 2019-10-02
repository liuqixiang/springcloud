package com.lqx.entity.auth.response;


import com.lqx.model.response.ResponseResult;
import com.lqx.model.response.ResultCode;

/**
 * Created by mrt on 2018/5/21.
 */
public class JwtResult extends ResponseResult {
    public JwtResult(ResultCode resultCode, String jwt) {
        super(resultCode);
        this.jwt = jwt;
    }
    private String jwt;

    public String getJwt() {
        return jwt;
    }

    public void setJwt(String jwt) {
        this.jwt = jwt;
    }
}
