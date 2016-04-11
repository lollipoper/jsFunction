package com.wenxc.afdc.function;

/**
 * 有返回值的函数类
 */
public abstract class WithResultFunction<T> extends ImplFunction<T> {
    public WithResultFunction(String funtionName) {
        super(funtionName);
    }

    @Override
    public final void function() {

    }

    @Override
    public final void functionWithPram(Object... objects) {

    }

    @Override
    public  final T functionWithPramAndResult(Object... objects) {
        return null;
    }
}
