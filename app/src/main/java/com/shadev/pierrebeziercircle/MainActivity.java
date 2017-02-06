package com.shadev.pierrebeziercircle;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private android.widget.Button btnstart;
    private MagicCircle circle3;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        circle3 = (MagicCircle) findViewById(R.id.circle3);
        this.btnstart = (Button) findViewById(R.id.btn_start);
        btnstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                circle3.startAnimation();
            }
        });
        img = (ImageView) findViewById(R.id.img);
//      img.setImageDrawable(getResources().getDrawable(R.drawable.ic_google));

//        Drawable drawable = getResources().getDrawable(R.drawable.
//                vectordrawable);
//        Log.d("@@@@", drawable.toString());
//        img.setImageDrawable(drawable);
//        if (drawable instanceof Animatable) {
//            ((Animatable) drawable).start();
//            Log.d("@@@@", "Start");
//        }
    }
}
