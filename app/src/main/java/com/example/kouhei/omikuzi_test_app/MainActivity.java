package com.example.kouhei.omikuzi_test_app;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    String s;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void getomikuji(View view) {
    TextView tv = (TextView) findViewById(R.id.display);
    Random randomGenerator = new Random();
        int i = randomGenerator.nextInt(4);

        switch(i){
            case 0:
                s = ("吉");

                break;
            case 1:
                s = ("凶");

                break;
            case 2:
                s = ("大凶");

                break;

            case 3:
                s = ("バーカｗｗｗｗｗｗ");
        }

        tv.setText(s);

    }
}
