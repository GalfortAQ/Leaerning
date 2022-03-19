package com.vmuguerzac.vuforiastarter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class Unit1_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_unit1);
    }

    public void goTo(View view) {

        Intent intent;
        switch (view.getId()) {
            case R.id.btn_camera:
                intent = new Intent(this, ImageTargets.class);
                startActivity(intent);
                break;
            case R.id.btn_newWords:
            case R.id.btn_questionnaire:
                break;
        }
    }
}