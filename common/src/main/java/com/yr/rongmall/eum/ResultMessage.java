package com.yr.rongmall.eum;


/**
 * @author yerong
 */
public enum ResultMessage {
    /**
     * 请求成功
     */
    DEF_SUCCESS("请求成功"),
    /**
     * 请求失败
     */
    DEF_ERROR("请求失败"),
    /**
     * 没有匹配数据
     */
    NO_DATA("没有匹配数据"),
    /**
     * 访问地址不存在
     */
    NO_URL("访问地址不存在"),
    /**
     * 请求方式不被支持
     */
    METHOD_NOT_ALLOWED("请求方式不被支持"),
    /**
     * 参数异常
     */
    PARAM_ERROR("参数异常"),
    /**
     * 服务器异常
     */
    SERVER_ERROR("服务器异常"),
    /**
     * 空指针异常
     */
    NULL_POINTER_EXCEPTION("空指针异常");

    private String message;

    ResultMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
