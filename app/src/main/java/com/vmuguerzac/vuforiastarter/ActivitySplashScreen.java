package com.vmuguerzac.vuforiastarter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import android.view.ViewGroup.LayoutParams;

public class ActivitySplashScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        long SPLASH_MILLIS = 450;
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        RelativeLayout layout = (RelativeLayout) View.inflate(this, R.layout.splash_screen, null);
        addContentView(layout, new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable()
        {

            @Override
            public void run()
            {
                Intent intent = new Intent(ActivitySplashScreen.this,
                        ActivityLauncher.class);
                startActivity(intent);
            }

        }, SPLASH_MILLIS);
    }
}