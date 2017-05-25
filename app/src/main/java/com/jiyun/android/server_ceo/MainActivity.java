package com.jiyun.android.server_ceo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b_menu = (Button)findViewById(R.id.menu);
        Button b_pay = (Button)findViewById(R.id.pay);
        b_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_menu = new Intent(MainActivity.this,MenuActivity.class);
                startActivity(intent_menu);
            }
        });
        b_pay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_pay = new Intent(MainActivity.this,PayActivity.class);
                startActivity(intent_pay);
            }
        });

    }


}
