package com.baidu.paddle.fastdeploy.app.examples.fsanet;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.baidu.paddle.fastdeploy.app.examples.R;

public class FSANetWelcomeActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.LOLLIPOP) {
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
            );
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }
        setContentView(R.layout.fsanet_welcome);
    }

    public void startActivity(View view) {
        Intent intent = new Intent(FSANetWelcomeActivity.this, FSANetMainActivity.class);
        startActivity(intent);
    }
}
