package com.example.login.model;

/**
 * @author future
 * @date 2019-05-29 23:58
 */
public class VO {

    private boolean success;
    private String url;

    public static VO ok(String url) {
        VO vo = new VO();
        vo.success = true;
        vo.url = url;
        return vo;
    }

    public static VO fail(String url) {
        VO vo = new VO();
        vo.success = false;
        vo.url = url;
        return vo;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
