package com.improve10x.maindata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class DatePickerActivity extends AppCompatActivity {
    TextView currentTxt;
    DatePicker pickerDp;
    Button changeDateBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_picker);
        currentTxt = findViewById(R.id.current_txt);
        pickerDp = findViewById(R.id.date_picker_dp);
        changeDateBtn = findViewById(R.id.change_date_btn);
        displayCurrentDate();
        displayChangeDate();
    }

    private void displayChangeDate() {
        String selectedDate = getSelectedDate();
        currentTxt.setText("CurrentDate :" + selectedDate);

    }

    private void displayCurrentDate() {
      changeDateBtn.setOnClickListener(v -> {
          String selectedDate = getSelectedDate();
          currentTxt .setText("ChangeDate :" + selectedDate);

      });
    }
    public String getSelectedDate(){
        int day = pickerDp .getDayOfMonth();
        int month = pickerDp.getMonth()+1;
        int year = pickerDp.getYear();
        String selectedDate = createDate(day,month,year);
        return selectedDate;
    }

    public String createDate(int day,int month,int year){
        return day + "/" + month + " / " + year;

    }
}




