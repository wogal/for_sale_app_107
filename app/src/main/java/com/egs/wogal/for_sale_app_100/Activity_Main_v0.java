package com.egs.wogal.for_sale_app_100;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Activity_Main_v0 extends AppCompatActivity implements View.OnClickListener {

    Button mBtn_startselling_vn;


    // start sreen
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen_v0);
        mBtn_startselling_vn = (Button) findViewById(R.id.butt_lets_start_selling_v0);
        mBtn_startselling_vn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.butt_lets_start_selling_v0: {
                Intent intent = new Intent(this,activity_options_screen.class);
                startActivity(intent);
            }
        }
    }
}
