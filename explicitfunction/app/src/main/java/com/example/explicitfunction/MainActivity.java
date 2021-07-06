package com.example.explicitfunction;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.button);
        b1.setOnClickListener(this);

        //if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
        //
         //   ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.CALL_PHONE},123);
         //   return;
        }



    @Override
    public void onClick(View v) {
       // Intent it=new Intent(Intent.ACTION_CALL, Uri.parse("tel:8149766814"));
       // startActivity(it);
        Intent it=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.tectonicit.com"));
        startActivity(it);


    }
}



