package com.example.kouhei.omikuzi_test_app;


import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    String s;
    Uri uri;

    InputStream istream[] = new InputStream[4];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void getomikuji(View view) {
        TextView tv = (TextView) findViewById(R.id.display);
        ImageView im = (ImageView) findViewById(R.id.picture);
        Bitmap bitmap = null;

        try {
            istream[0] = getResources().getAssets().open("pic_01.jpg");
            istream[1] = getResources().getAssets().open("pic_02.jpg");
            istream[2] = getResources().getAssets().open("pic_03.jpg");
            istream[3] = getResources().getAssets().open("pic_04.jpg");



        } catch (IOException e) {
            Log.d("Assets", "Error");
        }


        Random randomGenerator = new Random();
        int i = randomGenerator.nextInt(4);

        switch (i) {
            case 0:
                s = ("大吉");
                bitmap = BitmapFactory.decodeStream(istream[0]);
                im.setImageBitmap(bitmap);

                break;
            case 1:
                s = ("小吉");
                bitmap = BitmapFactory.decodeStream(istream[1]);
                im.setImageBitmap(bitmap);

                break;
            case 2:
                s = ("中吉");
                bitmap = BitmapFactory.decodeStream(istream[2]);
                im.setImageBitmap(bitmap);

                break;
            case 3:
                s = ("吉");
                bitmap = BitmapFactory.decodeStream(istream[3]);
                im.setImageBitmap(bitmap);

                break;

        }



    }
}
