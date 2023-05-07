package com.guy.class23b_ands_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;

import java.io.ByteArrayOutputStream;

public class MainActivity extends AppCompatActivity {

    private AppCompatImageView image1;
    private AppCompatImageView image2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image1 = findViewById(R.id.image1);
        image2 = findViewById(R.id.image2);

        Benchmark benchmark = new Benchmark();

        benchmark.newRecord("Bitmap from res");
        Bitmap bitmap1 = getBitmapFromImageRes(R.drawable.panda2);
        benchmark.done();

        benchmark.newRecord("Bitmap into image view");
        image1.setImageBitmap(bitmap1);
        benchmark.done();

        benchmark.newRecord("Bitmap to Base64 String");
        String base64 = getBase64FromBitmap(bitmap1);
        benchmark.done();

        String encrypted = encryptString(base64);


        Log.d("pttt", benchmark.getLog());
    }


    private Bitmap getBitmapFromImageRes(int res) {
        return BitmapFactory.decodeResource(getResources(), res);
    }

    private String getBase64FromBitmap(Bitmap bitmap) {
        ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteStream);
        byte[] byteArray = byteStream.toByteArray();
        String baseString = Base64.encodeToString(byteArray,Base64.DEFAULT);
        return baseString;
    }

    private String decryptString(String str) {
        // TODO: 14/11/2022 Decryption function
        return str;
    }

    private String encryptString(String str) {
        // TODO: 14/11/2022 Encryption Function
        return str;
    }
}