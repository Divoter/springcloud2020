package com.divoter.springcloud.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * com.divoter.springcloud.payment.result
 *
 * @author divoter
 * @date 2020/12/1 19:33
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Result<T> implements Serializable {

    private int code;

    private String msg;

    private T data;

    public static Result result(ResultContant resultContant){
        return new Result()
                .setCode(resultContant.getCode())
                .setMsg(resultContant.getMsg());
    }

    public static <T>Result<T> result(ResultContant resultContant,T data){
        return new Result<T>()
                .setCode(resultContant.getCode())
                .setMsg(resultContant.getMsg())
                .setData(data);
    }

    public static <T>Result<T> result(int code ,String msg,T data){
        return new Result<T>()
                .setCode(code)
                .setMsg(msg)
                .setData(data);
    }

    public static Result success(){
        return new Result()
                .setCode(ResultContant.SUCCESS.getCode())
                .setMsg(ResultContant.SUCCESS.getMsg())
                .setData(null);
    }

    public static <T>Result<T> success(T data){
        return new Result<T>()
                .setCode(ResultContant.SUCCESS.getCode())
                .setMsg(ResultContant.SUCCESS.getMsg())
                .setData(data);
    }

    public static Result fail(){
        return new Result<>()
                .setCode(ResultContant.ERROR.getCode())
                .setMsg(ResultContant.SUCCESS.getMsg())
                .setData(null);
    }

    public static <T>Result<T> fail(T data){
        return new Result<T>()
                .setCode(ResultContant.ERROR.getCode())
                .setMsg(ResultContant.SUCCESS.getMsg())
                .setData(data);
    }

}
