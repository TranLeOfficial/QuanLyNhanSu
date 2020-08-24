package com.example.duan_quanlynhansu.GiaoDien;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.keri.R;

public class ManageActivity extends AppCompatActivity {
    //Khai Báo các biến
    Button btnTimekeeping, btnSalary, btnAddStaff, btnManagePro, btnManageAcc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage);
        setControl();
        setEvent();
    }

    //Hàm Xử lý các sự kiện
    private void setEvent() {
        //Xử lý Chấm Công
        btnTimekeeping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ManageActivity.this, DateActivity.class);
                startActivity(intent);
            }
        });

        //Xử lý Lương
        btnSalary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ManageActivity.this, SalaryActivity.class);
                startActivity(intent);
            }
        });

        //Xử lý Thêm Nhân Viên
        btnAddStaff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ManageActivity.this, AddStaffActivity.class);
                startActivity(intent);
            }
        });

        //Xử lý Quản lý Tài Khoản
        btnManageAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ManageActivity.this, ManageAccountActivity.class);
                startActivity(intent);
            }
        });

        //Xử lý Quản lý Dự Án
        btnManagePro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ManageActivity.this, ManageProjectActivity.class);
                startActivity(intent);
            }
        });
    }

    //Hàm Khai báo biến
    private void setControl() {
        btnTimekeeping = findViewById(R.id.btnTimekeeping);
        btnAddStaff = findViewById(R.id.btnAddStaff);
        btnManageAcc = findViewById(R.id.btnManageAcc);
        btnSalary = findViewById(R.id.btnSalary);
        btnManagePro = findViewById(R.id.btnManagePro);
    }
}