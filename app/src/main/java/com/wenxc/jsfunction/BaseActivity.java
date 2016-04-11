package com.wenxc.jsfunction;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.wenxc.afdc.FunctionHelper;
import com.wenxc.afdc.inte.AFDC;

/**
 * Created by wenxc on 2016/4/8.
 */
public class BaseActivity extends AppCompatActivity implements AFDC {

    protected FunctionHelper functionHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initFunction();
    }

    @Override
    public FunctionHelper getFunctionHelper() {
        return functionHelper;
    }

    @Override
    public void setEnableAFDC(boolean enable) {
        functionHelper.setEnableAFCallback(enable);
    }

    @Override
    public boolean isEnableAFDC() {
        return functionHelper.isEnableAFDC();
    }

    @Override
    public void initFunction() {
        functionHelper = new FunctionHelper(false);
    }
}
