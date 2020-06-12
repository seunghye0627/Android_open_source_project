package com.example.thethrillathand;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SOSActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sos);

    }
    public void onYesClicked(View v){
         Toast.makeText(getApplicationContext(), "신고 접수", Toast.LENGTH_LONG).show();
        finish();
    }
    public void onNoClicked(View v) {
        finish();
    }


}
