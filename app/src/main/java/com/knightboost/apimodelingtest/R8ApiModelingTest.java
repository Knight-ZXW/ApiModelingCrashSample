package com.knightboost.apimodelingtest;

import android.annotation.SuppressLint;
import android.graphics.SurfaceTexture;

@SuppressLint({"NewApi", "LocalSuppress"})

public class R8ApiModelingTest {
    /**
     *
     */
    public static synchronized void badcase() {
        SurfaceTexture surfaceTexture = new SurfaceTexture(true);
        System.gc();
        ;
    }

}
