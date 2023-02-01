package com.improve10x.maindata;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class TimePickerActivity extends AppCompatActivity {
TextView currentTimeTxt;
TimePicker timeTp;
Button changeTimeBtn;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_picker);
        currentTimeTxt = findViewById(R.id.current_time_txt);
        timeTp = findViewById(R.id.time_tp);
        changeTimeBtn = findViewById(R.id.change_time_btn);
        showChangeTime();
        showCurrentTime();
    }

    private void showCurrentTime() {
        changeTimeBtn.setOnClickListener(v -> {
            String selectTime = getSelectTime();
            currentTimeTxt.setText("ChangeTime :" + selectTime);
        });
    }

    private void showChangeTime() {
        String selectTime =  getSelectTime();
        currentTimeTxt.setText("CurrentTime : " + selectTime);

    }
    public String getSelectTime(){
        int hour = timeTp.getCurrentHour();
        int minutes = timeTp.getCurrentMinute();
        String selectTime = createTime(hour,minutes);
        return selectTime;
    }
    public String createTime (int hour,int minutes){
        return hour + " /" + minutes;
    }
}