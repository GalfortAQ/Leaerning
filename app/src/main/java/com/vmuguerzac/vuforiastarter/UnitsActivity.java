package com.vmuguerzac.vuforiastarter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class UnitsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_units);
    }

    public void goTo(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.btn_unit1:
                intent = new Intent(this, Unit1_Activity.class);
                startActivity(intent);
                break;
            case R.id.btn_unit2:
                intent = new Intent(this, Unit2_Activity.class);
                startActivity(intent);
                break;
        }
    }
}