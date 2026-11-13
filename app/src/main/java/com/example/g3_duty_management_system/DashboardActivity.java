package com.example.g3_duty_management_system;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DashboardActivity extends AppCompatActivity {

    TextView accountprofile;
    TextView schedule;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        accountprofile = findViewById(R.id.accountprofile);

        accountprofile.setOnClickListener(v -> {
            Intent intent = new Intent(DashboardActivity.this, AccountProfile.class);
            startActivity(intent);
        });
        schedule = findViewById(R.id.schedule);

        schedule.setOnClickListener(v -> {
            Intent Intent = new Intent(DashboardActivity.this, ScheduleTracker.class);
            startActivity(Intent);
        });
    }
}