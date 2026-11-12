package com.example.g3_duty_management_system;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class TaskManagement extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_management);

        RadioGroup radioGroup = findViewById(R.id.radioGroupDuties);
        Button btnConfirm = findViewById(R.id.btnConfirm);

        btnConfirm.setOnClickListener(v -> {

            int selectedId = radioGroup.getCheckedRadioButtonId();

            if (selectedId == -1) {

                Toast.makeText(this,
                        "Please select a duty!",
                        Toast.LENGTH_SHORT).show();

            } else {

                RadioButton selectedRadio =
                        findViewById(selectedId);

                String selectedDuty =
                        selectedRadio.getText().toString();

                Toast.makeText(this,
                        "Your duty: " + selectedDuty,
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}