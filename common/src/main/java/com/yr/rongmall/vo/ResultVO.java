package com.yr.rongmall.vo;

import com.yr.rongmall.eum.ResultMessage;

import java.io.Serializable;

/**
 * @author yerong
 * @date 2022/1/14 14:35
 */
public class ResultVO<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 请求成功
     */
    public static final Integer CODE = 200;

    /**
     * 返回结果编码
     */
    private Integer code;
    /**
     * 结果消息
     */
    private String msg;
    /**
     * 返回结果
     */
    private T result;
    /**
     * 请求时的当前系统时间戳
     */
    private Long timestamp;

    public ResultVO() {
        this.timestamp = System.currentTimeMillis();
    }

    public ResultVO(Integer code) {
        this.timestamp = System.currentTimeMillis();
        this.code = code;
    }

    public ResultVO(Integer code, String msg) {
        this.timestamp = System.currentTimeMillis();
        this.code = code;
        this.msg = msg;
    }

    public ResultVO(Integer code, T result) {
        this.timestamp = System.currentTimeMillis();
        this.code = code;
        this.result = result;
    }

    public ResultVO(Integer code, T result, String msg) {
        this.timestamp = System.currentTimeMillis();
        this.code = code;
        this.result = result;
        this.msg = msg;
    }

    public ResultVO(T result) {
        this.result = result;
    }

    public ResultVO<T> ok(String msg) {
        return new ResultVO<T>(CODE, msg);
    }

    public ResultVO<T> ok(T result) {
        return new ResultVO<T>(CODE, result, ResultMessage.DEF_SUCCESS.getMessage());
    }

    public ResultVO<T> ok(T result, String msg) {
        return new ResultVO<T>(CODE, result, msg);
    }

    public ResultVO<T> ok() {
        return new ResultVO<T>(CODE,ResultMessage.DEF_SUCCESS.getMessage());
    }

    public ResultVO<T> error() {
        return error(500, "未知异常，请联系管理员");
    }

    public ResultVO<T> callBackError(String msg) {
        return error(-500, msg + "请求错误，执行回调");
    }

    public ResultVO<T> error(String msg) {
        return error(500, msg);
    }

    public ResultVO<T> error(Integer code, String msg) {
        return new ResultVO<T>(code, msg);
    }

    public ResultVO<T> error(T result) {
        return new ResultVO<T>(CODE, result, ResultMessage.DEF_ERROR.getMessage());
    }

    public ResultVO<T> error(Integer code, T result, String msg) {
        return new ResultVO<T>(code, result, msg);
    }

    public Integer getCode() {
        return this.code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getResult() {
        return this.result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "ResultVO{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", result=" + result +
                ", timestamp=" + timestamp +
                '}';
    }
}
