package com.example.duan_quanlynhansu.GiaoDien;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.keri.R;

public class AddStaffActivity extends AppCompatActivity {
    //Khai Báo các biến
    Button btnAddStaffW, btnUpdateStaffW, btnCreateAccW;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addstaff);
        setControl();
        setEvent();
    }

    //Hàm Xử lý các sự kiện
    private void setEvent() {
        //Xử lý Tạo Tài Khoản
        btnCreateAccW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AddStaffActivity.this, AccountActivity.class);
                startActivity(intent);
            }
        });
    }

    //Hàm Khai báo biến
    private void setControl() {
        btnAddStaffW = findViewById(R.id.btnAddStaffW);
        btnUpdateStaffW = findViewById(R.id.btnUpdateStaffW);
        btnCreateAccW = findViewById(R.id.btnCreateAccW);
    }
}