package com.example.user;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;

public class thongbao extends AppCompatActivity {
    Button quayve;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thongbao);
        setTitle("Thông báo");
        quayve=findViewById(R.id.btnquayvehome);
        quayve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openhome();
            }

        });

        listView = findViewById(R.id.listview);
        ArrayList<listthongbao> arrayList;
        adapterthongbao adapter;
        arrayList = new ArrayList<>();
        arrayList.add(new listthongbao("Longca","đã thích video của bạn",R.drawable.mot,R.drawable.tru,R.drawable.bacham,"6 phút trước"));
        arrayList.add(new listthongbao("Longca","đã bình luận của bạn",R.drawable.mot,R.drawable.tru,R.drawable.bacham,"7 phút trước"));
        arrayList.add(new listthongbao("tantu"," đã fllow bạn",R.drawable.hai,R.drawable.tru,R.drawable.bacham,"10 phút trước"));
        arrayList.add(new listthongbao("congphung","đã đăng video mới",R.drawable.ba,R.drawable.tru,R.drawable.bacham,"1 tiếng trước"));
        arrayList.add(new listthongbao("quanghai","đã bình luận vieo của bạn",R.drawable.bon,R.drawable.tru,R.drawable.bacham,"1 ngày trước"));
        arrayList.add(new listthongbao("vanhau","đã yêu thích video của bạn ",R.drawable.nam,R.drawable.tru,R.drawable.bacham,"2 ngày trước"));

        arrayList.add(new listthongbao("longle"," đã fllow bạn",R.drawable.hai,R.drawable.tru,R.drawable.bacham," 2 ngày trước"));
        arrayList.add(new listthongbao("congphung","đã thích video bạn",R.drawable.ba,R.drawable.tru,R.drawable.bacham,"1 tuần trước"));
        arrayList.add(new listthongbao("quanghaiXem Chi Tiết","đã bình luận vieo của bạn",R.drawable.bon,R.drawable.tru,R.drawable.bacham,"1 tuần trước"));
        arrayList.add(new listthongbao("vanhau","đã yêu thích video của bạn ",R.drawable.nam,R.drawable.tru,R.drawable.bacham,"1 tháng trước" ));
        adapter = new adapterthongbao(thongbao.this,R.layout.layout_thongbao,arrayList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),"Hello ",Toast.LENGTH_SHORT).show();
            }
        });


    }
    public void openhome(){
        Intent intent = new Intent(this ,home.class);
        startActivity(intent);
    }
}