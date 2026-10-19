package com.example.g3_duty_management_system;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class TaskManagement extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_management);

        RadioGroup radioGroupDuties = findViewById(R.id.radioGroupDuties);
        Button btnConfirm = findViewById(R.id.btnConfirm);

        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = radioGroupDuties.getCheckedRadioButtonId();

                // Check which single task was chosen
                if (selectedId == R.id.radio1) {
                    Toast.makeText(TaskManagement.this, "Assigned: Sweep the floor", Toast.LENGTH_SHORT).show();
                } else if (selectedId == R.id.radio2) {
                    Toast.makeText(TaskManagement.this, "Assigned: Clean the whiteboard", Toast.LENGTH_SHORT).show();
                } else if (selectedId == R.id.radio3) {
                    Toast.makeText(TaskManagement.this, "Assigned: Mop the floor", Toast.LENGTH_SHORT).show();
                } else if (selectedId == R.id.radio4) {
                    Toast.makeText(TaskManagement.this, "Assigned: Arrange the room", Toast.LENGTH_SHORT).show();
                } else if (selectedId == R.id.radio5) {
                    Toast.makeText(TaskManagement.this, "Assigned: Throw the trash", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(TaskManagement.this, "Please select a duty first!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}