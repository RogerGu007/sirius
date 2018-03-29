package com.sirius.entity;

import com.google.gson.Gson;

public class ResponseGson {

    private String retCode;
    private String retMsg;

    public String getRetCode() {
        return retCode;
    }

    public void setRetCode(String retCode) {
        this.retCode = retCode;
    }

    public String getRetMsg() {
        return retMsg;
    }

    public void setRetMsg(String retMsg) {
        this.retMsg = retMsg;
    }

    public static String render(String retCode, String retMsg) {
        ResponseGson response = new ResponseGson();
        response.setRetCode(retCode);
        response.setRetMsg(retMsg);
        return new Gson().toJson(response);
    }
}
