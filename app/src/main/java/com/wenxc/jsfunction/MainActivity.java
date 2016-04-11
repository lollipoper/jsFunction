package com.wenxc.jsfunction;

import android.os.Bundle;
import android.widget.Toast;

import com.wenxc.afdc.function.Function;
import com.wenxc.afdc.function.WithParamAndResultFunction;
import com.wenxc.afdc.function.WithParamFunction;
import com.wenxc.afdc.function.WithResultFunction;


public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setEnableAFDC(true);
        getSupportFragmentManager().beginTransaction().add(R.id.container, new MainFragment()).commit();
    }

    @Override
    public void initFunction() {
        super.initFunction();
        functionHelper.addFunction(new Function(MainFragment.FUNCTION) {
            @Override
            public void function() {
                Toast.makeText(MainActivity.this, "funtion without param and result", Toast.LENGTH_SHORT).show();
            }
        });
        functionHelper.addFunction(new WithParamAndResultFunction<Integer>(MainFragment.FUNCTION_WITH_PARAM_AND_RESULT) {
            @Override
            public Integer functionWithPramAndResult(Object... objects) {
                if (objects.length > 0) {
                    Object object = objects[0];
                    try {
                        return Integer.parseInt((String) object);
                    } catch (NumberFormatException e) {
                        return 0;
                    }
                }
                return 0;
            }
        });

        functionHelper.addFunction(new WithResultFunction<Integer>(MainFragment.FUNCTION_WITH_RESULT) {
            @Override
            public Integer functionWithResult() {
                return 5;
            }
        });

        functionHelper.addFunction(new WithParamFunction(MainFragment.FUNCTION_WITH_PARAM) {
            @Override
            public void functionWithPram(Object... objects) {
                Toast.makeText(MainActivity.this, "funtion with param and param is"+ objects, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
