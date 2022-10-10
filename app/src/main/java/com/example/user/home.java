package com.example.user;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.MediaController;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.VideoView;

import java.util.ArrayList;
import java.util.List;

public class home extends AppCompatActivity {
    private  RecyclerView recyview;
    private Button btndangxuat,btnprofile,btnlistview, cancel;
    private RadioGroup radioGroup;
    private RadioButton tim,like,phanno;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = findViewById(R.id.toolbar);
        radioGroup =findViewById(R.id.groupradio);
        tim= findViewById(R.id.tim);
        like =findViewById(R.id.like);
        btnlistview = findViewById(R.id.btndangxuat);

        setTitle("Trang Chủ");

        recyview =findViewById(R.id.baidang);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,1);
        recyview.setLayoutManager(gridLayoutManager);
        videoAdapter adapter = new videoAdapter(getlistvideo());
        recyview.setAdapter(adapter);
    }
    private List<video> getlistvideo() {
        List<video> list =new ArrayList<>();
        list.add(new video(R.drawable.mot,R.drawable.mot,"LongCa","Ngày mới tốt đẹp"));
        list.add(new video(R.drawable.hai,R.drawable.hai,"HoangLong","Một ngày perfect "));
        list.add(new video(R.drawable.ba,R.drawable.ba,"CongPhung","lưu giữ hạnh phúc"));
        list.add(new video(R.drawable.bon,R.drawable.bon,"QuanHai","Chào mọi người"));
        list.add(new video(R.drawable.nam,R.drawable.nam,"VanHau","Sống làm việc mình thích"));
        list.add(new video(R.drawable.mot,R.drawable.nam,"LongCa","thế giới quanh ta là bao điều thú vị"));
        list.add(new video(R.drawable.hai,R.drawable.bon,"HoangLong","ngay mới tươi đẹp "));
        list.add(new video(R.drawable.ba,R.drawable.ba,"CongPhung","lưu giữ hạnh phúc"));
        list.add(new video(R.drawable.bon,R.drawable.hai,"QuanHai","Chào mọi người"));
        list.add(new video(R.drawable.nam,R.drawable.mot,"VanHau","Sống làm việc mình thích"));
        return list;
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menutoolbar,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected( MenuItem item) {

        int id= item.getItemId();
        switch (id){
            case R.id.btnprofile:
                openprofile();
                break;
            case R.id.btnlistview:
                openthongbao();
                break;

            case R.id.btndangxuat:
                opensignin();
                break;
            case R.id.toolbarprofile:
                openprofile();
                break;
            case R.id.toolbarlistview:
                openthongbao();
                break;
            default:
                break;

        }
        return super.onOptionsItemSelected(item);
    }

    private void openthongbao() {
        Intent intent = new Intent(this ,thongbao.class);
        startActivity(intent);
    }

    public void openprofile(){
        Intent intent = new Intent(this ,profile.class);
        startActivity(intent);
    }
    public void opensignin(){
        Intent intent = new Intent(this ,MainActivity.class);
        startActivity(intent);
    }
}