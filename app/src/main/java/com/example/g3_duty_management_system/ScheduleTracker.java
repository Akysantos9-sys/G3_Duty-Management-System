package com.example.g3_duty_management_system;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class ScheduleTracker extends AppCompatActivity {

    ImageView profile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule_tracker);
        profile = findViewById(R.id.imageView);

        profile.setOnClickListener(v -> {
            Intent intent = new Intent(ScheduleTracker.this, AccountProfile.class);
            startActivity(intent);
        });
    }
}