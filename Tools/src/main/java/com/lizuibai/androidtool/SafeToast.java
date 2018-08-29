package com.lizuibai.androidtool;

import android.os.Looper;
import android.widget.Toast;

public class SafeToast {

    public static void shortToast(final String msg) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            Toast.makeText(U.CONTEXT, msg, Toast.LENGTH_SHORT).show();
        } else {
            TaskMgr.runOnUIThread(new Runnable() {
                @Override
                public void run() {
                    Toast.makeText(U.CONTEXT, msg, Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

    public static void shortToast(final int strId) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            Toast.makeText(U.CONTEXT, strId, Toast.LENGTH_SHORT).show();
        } else {
            TaskMgr.runOnUIThread(new Runnable() {
                @Override
                public void run() {
                    Toast.makeText(U.CONTEXT, strId, Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

    public static void longToast(final String msg) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            Toast.makeText(U.CONTEXT, msg, Toast.LENGTH_LONG).show();
        } else {
            TaskMgr.runOnUIThread(new Runnable() {
                @Override
                public void run() {
                    Toast.makeText(U.CONTEXT, msg, Toast.LENGTH_LONG).show();
                }
            });
        }
    }

    public static void longToast(final int strId) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            Toast.makeText(U.CONTEXT, strId, Toast.LENGTH_LONG).show();
        } else {
            TaskMgr.runOnUIThread(new Runnable() {
                @Override
                public void run() {
                    Toast.makeText(U.CONTEXT, strId, Toast.LENGTH_LONG).show();
                }
            });
        }
    }
}
