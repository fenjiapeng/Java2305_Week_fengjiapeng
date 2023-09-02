package com.qfedu.fengjiapeng.pojo;

/**
 * @author fjp
 * @version 1.0
 * @description: TODO
 * @date 2023/9/2 10:33
 */
public class ActionResult {
    private int  statusCode;//响应状态码
    private String msg;//响应的短消息
    private Object data;//响应携带的数据

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
