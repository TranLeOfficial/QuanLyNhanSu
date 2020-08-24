package com.example.duan_quanlynhansu.GiaoDien;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.keri.R;

public class ManageProjectActivity extends AppCompatActivity {
    //Khai Báo các biến
    Button btnProjectView, btnCreateProject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manageproject);
        setControl();
        setEvent();
    }

    //Hàm Xử lý các sự kiện
    private void setEvent() {
        //Xử lý Tạo Tài Khoản
        btnCreateProject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ManageProjectActivity.this, ProjectActivity.class);
                startActivity(intent);
            }
        });
    }

    //Hàm Khai báo biến
    private void setControl() {
        btnProjectView = findViewById(R.id.btnProjectView);
        btnCreateProject = findViewById(R.id.btnCreateProject);
    }
}