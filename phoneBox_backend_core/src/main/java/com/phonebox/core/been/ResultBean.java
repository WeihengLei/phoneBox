package com.phonebox.core.been;

import com.phonebox.core.type.ErrorCode;
import lombok.Data;
import java.io.Serializable;

@Data
public class ResultBean<T>implements Serializable {

    private static final long serialVersionUID = -6630715152506789390L;

    private ErrorCode code;

    private String message;

    private boolean success;

    private T data;

}