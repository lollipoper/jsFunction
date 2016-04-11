package com.wenxc.jsfunction;

import android.content.Context;
import android.support.v4.app.Fragment;

import com.wenxc.afdc.exception.FunctionException;
import com.wenxc.afdc.inte.AFDC;
import com.wenxc.afdc.FunctionHelper;

/**
 * Created by wenxc on 2016/4/8.
 */
public class BaseFragment extends Fragment {

    protected FunctionHelper mFunctionHelper;
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof AFDC){
            mFunctionHelper = ((AFDC) context).getFunctionHelper();
            if (mFunctionHelper==null) {
                try {
                    throw new FunctionException("The function heleper is not found, be sure the attach activity is implements AFDC");
                } catch (FunctionException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
