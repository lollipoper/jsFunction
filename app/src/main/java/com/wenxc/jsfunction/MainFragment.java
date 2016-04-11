package com.wenxc.jsfunction;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.wenxc.afdc.exception.FunctionException;

/**
 * Created by wenxc on 2016/4/8.
 */
public class MainFragment extends BaseFragment {
    public final static String FUNCTION = "function";

    public final static String FUNCTION_WITH_PARAM_AND_RESULT = "function_with_param_and_result";

    public final static String FUNCTION_WITH_RESULT = "function_with_result";

    public final static String FUNCTION_WITH_PARAM = "function_with_param";




    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.main_fragment, container,false);
        inflate.findViewById(R.id.function).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    mFunctionHelper.invoke(FUNCTION);
                } catch (FunctionException e) {
                    e.printStackTrace();
                }
            }
        });
        inflate.findViewById(R.id.function_with_param_and_result).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int result = mFunctionHelper.invokeWithPramAndResult(FUNCTION_WITH_PARAM_AND_RESULT, "55");
                    Toast.makeText(getActivity(), ""+result, Toast.LENGTH_SHORT).show();
                } catch (FunctionException e) {
                    e.printStackTrace();
                }
            }
        });

        inflate.findViewById(R.id.function_with_result).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int result = mFunctionHelper.invokeWithResult(FUNCTION_WITH_RESULT);
                    Toast.makeText(getActivity(), ""+result, Toast.LENGTH_SHORT).show();
                } catch (FunctionException e) {
                    e.printStackTrace();
                }
            }
        });

        inflate.findViewById(R.id.function_with_param).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    mFunctionHelper.invokeWithPrams(FUNCTION_WITH_PARAM);
                } catch (FunctionException e) {
                    e.printStackTrace();
                }
            }
        });
        return inflate;
    }
}
