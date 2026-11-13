
package com.example.g3_duty_management_system;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityLogger extends AppCompatActivity {

    Button btnViewActivities;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitylogger);

        // Connect XML button
        btnViewActivities = findViewById(R.id.btnViewActivities);

        // Button function
        btnViewActivities.setOnClickListener(v -> {

            Toast.makeText(
                    ActivityLogger.this,
                    "Activity Log Successfully Opened!",
                    Toast.LENGTH_LONG
            ).show();

        });
    }
}
