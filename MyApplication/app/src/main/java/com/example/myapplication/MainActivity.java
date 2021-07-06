

package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button b1, b2;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.btn_1);
        b2 = findViewById(R.id.btn_2);
        tv = findViewById(R.id.txt_msg);


        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {

      switch  (view.getId()){
          case R.id.btn_1:
              //first button
              tv.setText("first button clicked");
              break;
          case R.id.btn_2:
              //second button
              tv.setText("second button clicked");

              break;



      }
    }
}




