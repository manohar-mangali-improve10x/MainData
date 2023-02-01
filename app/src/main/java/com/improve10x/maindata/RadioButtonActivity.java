package com.improve10x.maindata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);
        showRadioButton();
    }
    private void showRadioButton() {
        Button showSelectBtn = findViewById(R.id.show_select_btn);
        showSelectBtn.setOnClickListener(v -> {
            RadioGroup genderRg = findViewById(R.id.gender_rg);
            int selectedId = genderRg.getCheckedRadioButtonId();
            RadioButton selectedRb = findViewById(selectedId);
            String gender = selectedRb.getText().toString();

            RadioGroup nationalityRg = findViewById(R.id.nationality_rg);
            int selectedId1 = nationalityRg.getCheckedRadioButtonId();
            RadioButton selectedRb1 = findViewById(selectedId1);
            String nationality = selectedRb1.getText().toString();
            Toast.makeText(this, gender + nationality, Toast.LENGTH_SHORT).show();
        });
    }
}
