package com.wenxc.afdc;

import android.util.Log;

import com.wenxc.afdc.exception.FunctionException;
import com.wenxc.afdc.exception.FunctionNotFoundException;
import com.wenxc.afdc.function.ImplFunction;
import com.wenxc.afdc.inte.IFunction;

import java.util.HashMap;
import java.util.Map;

/**
 * 函数类的管理，每个带有fragment的activity都有一个实例，以便依附其上的fragment调用函数
 */
public class FunctionHelper {

    private boolean enableAFDC = false;

    public FunctionHelper(boolean enableAFDC) {
        Log.i(TAG, "FunctionHelper isConstroct");
        this.enableAFDC = enableAFDC;
    }

    private final static String TAG = FunctionHelper.class.getSimpleName();
    private Map<String, IFunction> functions;

    public void addFunction(ImplFunction function) {
        Log.i(TAG, "FunctionHelper addFunction()"+function);
        if (function ==null) return;
        if (functions == null) functions = new HashMap<>();
        if (functions.containsKey(function.getFuntionName())) return;
        functions.put(function.getFuntionName(), function);
    }

    public void invoke(String funcName) throws FunctionException {
        Log.i(TAG, "FunctionHelper invoke()"+funcName);
        if (!isEnableAFDC()){ Log.i(TAG, "the enableAFCallback is false, if you want to use invoke, please set enableAFCallback as true");return;}
        if (funcName == null) return;
        if (functions != null) {
            IFunction IFunction = functions.get(funcName);
            if (IFunction == null)
                throw new FunctionNotFoundException("IFunction:" + funcName + "is not exist in functions map, has you add this IFunction in your activity");
            IFunction.function();
        } else {
            throw new FunctionException("functions doesn't exist in activitys, has you init function before invoke");
        }
    }

    public void invokeWithPrams(String funcName, Object... objects) throws FunctionException {
        Log.i(TAG, "FunctionHelper invoke()"+funcName);
        if (!isEnableAFDC()){ Log.i(TAG, "the enableAFCallback is false, if you want to use invoke, please set enableAFCallback as true");return;}
        if (funcName == null) return;
        if (functions != null) {
            IFunction IFunction = functions.get(funcName);
            if (IFunction == null)
                throw new FunctionNotFoundException("IFunction:" + funcName + "is not exist in functions map, has you add this IFunction in your activity");
            IFunction.functionWithPram(objects);
        } else {
            throw new FunctionException("functions doesn't exist in activitys, has you init function before invoke");
        }
    }


    public <T> T invokeWithResult(String funcName) throws FunctionException {
        Log.i(TAG, "FunctionHelper invoke()"+funcName);
        if (!isEnableAFDC()){ Log.i(TAG, "the enableAFCallback is false, if you want to use invoke, please set enableAFCallback as true"); return null;}
        if (funcName == null) return null;
        if (functions != null) {
            IFunction IFunction = functions.get(funcName);
            if (IFunction == null)
                throw new FunctionNotFoundException("IFunction:" + funcName + "is not exist in functions map, has you add this IFunction in your activity");
            return (T) IFunction.functionWithResult();
        } else {
            throw new FunctionException("functions doesn't exist in activitys, has you init function before invoke");
        }

    }

    public <T> T invokeWithPramAndResult(String funcName, Object... objects) throws FunctionException {
        Log.i(TAG, "FunctionHelper invoke()"+funcName);
        if (!isEnableAFDC()){ Log.i(TAG, "the enableAFCallback is false, if you want to use invoke, please set enableAFCallback as true"); return null;}
        if (funcName == null) return null;
        if (functions != null) {
            IFunction IFunction = functions.get(funcName);
            if (IFunction == null) {
                throw new FunctionNotFoundException("IFunction:" + funcName + "is not exist in functions map, has you add this IFunction in your activity");
            }
            return (T) IFunction.functionWithPramAndResult(objects);
        } else {
            throw new FunctionException("functions doesn't exist in activitys, has you init function before invoke");
        }
    }

    public boolean isEnableAFDC() {
        return enableAFDC;
    }

    public void setEnableAFCallback(boolean enableAFCallback) {
        this.enableAFDC = enableAFCallback;
    }
}
