package com.example.user;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class xemchitiec extends AppCompatActivity {
        private ImageView logo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xemchitiec);
        Intent intent = getIntent();
        listthongbao view = (listthongbao) intent.getSerializableExtra("Xem Chi Tiết");
        logo =findViewById(R.id.logo);
        logo.setImageResource(view.getHinh());

    }
}