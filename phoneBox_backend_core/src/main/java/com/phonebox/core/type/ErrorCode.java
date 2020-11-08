package com.phonebox.core.type;

public enum ErrorCode {
    bad_req("错误的请求"),
    business_error("业务处理错误"),
    server_error("系统错误"),
    auth_fail("身份认证失败或超时，请重新登录"),
    no_permission("没有权限访问"),
    not_found("找不到你请求的资源"),
    forbidden("禁止访问或操作"),
    kick_off("你的账号在其他地方上线，请重新登入"),
    csv_data_error("Csv数据错误"),
    form_data_invalid("表单数据错误");

    ErrorCode(String value) {
    }
}