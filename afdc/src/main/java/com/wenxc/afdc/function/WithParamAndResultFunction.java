package com.wenxc.afdc.function;

/**
 * 带参数及有返回值的函数类
 */
public abstract class WithParamAndResultFunction<T> extends ImplFunction<T> {
    public WithParamAndResultFunction(String funtionName) {
        super(funtionName);
    }

    @Override
    public final void function() {

    }

    @Override
    public final void functionWithPram(Object... objects) {

    }

    @Override
    public final T functionWithResult() {
        return null;
    }
}
