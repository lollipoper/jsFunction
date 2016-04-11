package com.wenxc.afdc.function;

/**
 * 带参数无返回值的函数类
 */
public abstract class WithParamFunction extends ImplFunction {

    public WithParamFunction(String funtionName) {
        super(funtionName);
    }

    @Override
    public final void function() {

    }

    @Override
    public Object functionWithResult() {
        return null;
    }

    @Override
    public Object functionWithPramAndResult(Object... objects) {
        return null;
    }


}
