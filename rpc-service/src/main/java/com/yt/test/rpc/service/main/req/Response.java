package com.yt.test.rpc.service.main.req;

import java.io.Serializable;

/**
 * Created by YT on 2019/1/3.
 */
public class Response implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 请求Id
     */
    private String requestId;
    /**
     * 异常
      */
    private Throwable error;
    /**
     * 响应
      */
    private Object result;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public Throwable getError() {
        return error;
    }

    public void setError(Throwable error) {
        this.error = error;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
