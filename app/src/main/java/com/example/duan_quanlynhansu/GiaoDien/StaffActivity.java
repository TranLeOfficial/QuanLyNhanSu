package com.example.duan_quanlynhansu.GiaoDien;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import com.example.keri.R;

public class StaffActivity extends AppCompatActivity {
    //Khai Báo các biến
    Button btnTimekeepingW, btnCalendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staff);
        setControl();
        setEvent();
    }

    //Hàm Xử lý các sự kiện
    private void setEvent() {
        //Xử lý Xem Chấm Công
        btnTimekeepingW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StaffActivity.this, DateActivity.class);
                startActivity(intent);
            }
        });
    }

    //Hàm Khai báo biến
    private void setControl() {
        btnTimekeepingW = findViewById(R.id.btnTimekeepingV);
        btnCalendar = findViewById(R.id.btnCalendar);
    }
}