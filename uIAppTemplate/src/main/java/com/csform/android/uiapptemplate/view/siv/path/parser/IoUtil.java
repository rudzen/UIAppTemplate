package com.csform.android.uiapptemplate.view.siv.path.parser;

import java.io.InputStream;

public class IoUtil {
    public static void closeQuitely(InputStream is) {
        if(is != null) {
            try {
                is.close();
            } catch (Throwable ignored) {
                //ignored
            }
        }
    }
}
