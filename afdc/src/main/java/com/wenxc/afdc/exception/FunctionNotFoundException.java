package com.wenxc.afdc.exception;

import com.wenxc.afdc.exception.FunctionException;

/**
 * Created by wenxc on 2016/4/8.
 */
public class FunctionNotFoundException extends FunctionException {
    public FunctionNotFoundException(String detailMessage) {
        super(detailMessage);
    }
}
