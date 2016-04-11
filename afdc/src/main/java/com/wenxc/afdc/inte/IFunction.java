package com.wenxc.afdc.inte;

/**
 * 方法接口
 */
public interface IFunction<T> {
    /**
     * 无参无返回值函数
     */
    void function();

    /**
     * 带参无返回值函数
     */
    void functionWithPram(Object... objects);

    /**
     * 无参有返回值函数
     */
    T functionWithResult();

    /**
     * 带参数有返回值函数
     */
    T functionWithPramAndResult(Object... objects);

}
