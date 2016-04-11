package com.wenxc.afdc.inte;

import com.wenxc.afdc.FunctionHelper;

/**
 * Activity 与 Fragment 的交互
 * AFDC（activity fragment data connection）
 */
public interface AFDC {
    /**
     * 得到函数管理类
     */
    FunctionHelper getFunctionHelper();

    /**
     * 设置是否允许交互
     */
    void setEnableAFDC(boolean enable);

    /**
     * 判断是否可以交互
     * @return
     */
    boolean isEnableAFDC();

    /**
     * 函数初始化，添加函数等操作在这里完成
     */
    void initFunction();


}
