package com.wenxc.afdc.function;

/**
 * 无参无返回值函数类
 */
public abstract class Function extends ImplFunction {

    public Function(String funtionName) {
        super(funtionName);
    }

    @Override
    public final void functionWithPram(Object... objects) {

    }

    @Override
    public final Object functionWithResult() {
        return null;
    }

    @Override
    public final Object functionWithPramAndResult(Object... objects) {
        return null;
    }
}
