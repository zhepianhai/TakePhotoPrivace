package com.zph.takephotoprivace.util;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;

/**
 * Created by ${lcarry} on 2017/4/25.
 * 吐司工具类
 */
public class ToastUtil {

    public static void showToast(Context context, String str) {
        if (TextUtils.isEmpty(str)){
            str="";
        }
        Toast.makeText(context, str, Toast.LENGTH_SHORT).show();
    }

    public static void showToast(Context context, int stringRes) {
        Toast.makeText(context, stringRes, Toast.LENGTH_SHORT).show();
    }
}
