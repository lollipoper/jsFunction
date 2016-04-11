package com.wenxc.afdc.function;


import com.wenxc.afdc.inte.IFunction;

/**
 * 抽象函数类创建，主要用于函数名的传入
 * @param <T>
 */

public abstract class ImplFunction<T> implements IFunction<T> {
    private String funtionName;

    public ImplFunction(String funtionName) {
        this.funtionName = funtionName;
    }

    public String getFuntionName() {
        return funtionName;
    }

}
