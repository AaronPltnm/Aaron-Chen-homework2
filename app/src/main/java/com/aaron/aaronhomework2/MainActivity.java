package com.aaron.aaronhomework2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity{
private static ImageView imgview;
    private static Button buttonsbm;
    private int current_image;
    int[] images= {R.drawable.qrcode, R.drawable.apcs};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     buttonclick();
    }
            public void buttonclick()
        {
            imgview=(ImageView)findViewById(R.id.imageView);
            buttonsbm=(Button)findViewById(R.id.button);
            buttonsbm.setOnClickListener(
                    new View.OnClickListener(){
                        @Override
                        public void onClick(View view){
                            current_image++;
                            current_image=current_image % images.length;
                            imgview.setImageResource(images[current_image]);
                        }
                    }
            );
        }
}
