package com.reminder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SplashActivity  extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstantState){
        super.onCreate(savedInstantState);

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
