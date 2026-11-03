package com.example.g3_duty_management_system;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class AccountProfile extends AppCompatActivity {

    Button backbutton, logoutbutton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_profile);

        // Back button
        backbutton = findViewById(R.id.backbutton);

        backbutton.setOnClickListener(v -> {
            Intent intent = new Intent(AccountProfile.this, DashboardActivity.class);
            startActivity(intent);
            finish();
        });

        // Logout button
        logoutbutton1 = findViewById(R.id.logoutbutton1);

        logoutbutton1.setOnClickListener(v -> {
            Intent intent = new Intent(AccountProfile.this, LoginActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
            finish();
        });
    }
}