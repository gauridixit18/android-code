package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {
    Button b1;
    CheckBox c1,c2,c3;
    Boolean b;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.btn_ok);
        c1=findViewById(R.id.checkbox_1);
        c2=findViewById(R.id.checkBox2);
        c3=findViewById(R.id.checkBox3);
        b1.setOnClickListener(this);
        c1.setOnCheckedChangeListener(this);

    }

    @Override
    public void onClick(View v) {
        String s1="";
        if(c1.isChecked()){
            s1="c";

        }
        if(c2.isChecked()){
            s1="cpp";


        }
        if(c3.isChecked()){
            s1="java";

        }
        Toast.makeText(this, ""+s1, Toast.LENGTH_LONG).show();


    }

    {
        
        }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        boolean b = false;
        if(b==true){
            
            
            Toast.makeText(this, "c is selected", Toast.LENGTH_SHORT).show();
            
        }else{
            Toast.makeText(this, "c is deselected", Toast.LENGTH_SHORT).show();
        }
        
    }
}

    
        
        
    
