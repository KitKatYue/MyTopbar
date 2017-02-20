package com.example.mytopbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Topbar topbar = (Topbar) findViewById(R.id.topbar);
        topbar.setOnTopbarClickListener(new Topbar.topbarClickListener() {
            @Override
            public void leftClick() {
                Toast.makeText(MainActivity.this, "IMOOC LEFT", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void rightClick() {
                Toast.makeText(MainActivity.this, "IMOOC RIGHT", Toast.LENGTH_SHORT).show();
            }
        });
        topbar.setLeftIsVisable(false);
    }
}
