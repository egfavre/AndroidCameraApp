package com.egfavre.cameraapp;

import android.hardware.Camera;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.SurfaceView;

public class MainActivity extends AppCompatActivity {

    SurfaceView surfaceView;
    Camera camera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        camera= Camera.open();
        surfaceView = (SurfaceView) findViewById(R.id.surfaceView);
    }
}
