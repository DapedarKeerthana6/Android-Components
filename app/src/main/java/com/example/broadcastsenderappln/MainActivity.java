package com.example.broadcastsenderappln;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn1,btn2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.button1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAct2();
            }
        });

        btn2 = findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAct3();
            }
        });
    }

    public void onBroadcastSendBtnClicked(View v){

        Intent intent =new Intent();
        intent.setAction("com.example.myBroadCastMessage");
        intent.setFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
        sendBroadcast(intent);
    }

    public void openAct2(){
        Intent intent = new Intent(this,FirstBtnActivity.class);
        startActivity(intent);
    }


    public void openAct3(){
        Intent intent = new Intent(this,ServiceActivity.class);
        startActivity(intent);
    }

}