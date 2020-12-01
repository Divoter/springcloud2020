package com.divoter.springcloud.payment.result;

/**
 * com.divoter.springcloud.payment.result
 *
 * @author divoter
 * @date 2020/12/1 19:54
 */

public enum ResultContant {

    SUCCESS(200,"success")
    , ERROR(400,"error")


    ;
    private int code;
    private String msg;

    ResultContant(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}
