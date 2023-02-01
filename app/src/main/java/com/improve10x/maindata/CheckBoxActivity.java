package com.improve10x.maindata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class CheckBoxActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);
        orderButton();
    }
        private void orderButton(){
        CheckBox checkBox1Txt = findViewById(R.id.checkbox1_txt);
        CheckBox checkBox2Txt = findViewById(R.id.checkbox2_txt);
        CheckBox checkBox3Txt = findViewById(R.id.checkbox3_txt);
        Button orderBtn = findViewById(R.id.order_btn);
        orderBtn.setOnClickListener(v -> {
            boolean pizzaCheckBox = checkBox1Txt.isChecked();
            boolean coffeCheckBox = checkBox2Txt.isChecked();
            boolean burgerCheckBox = checkBox3Txt.isChecked();
            String orderDetails = placeOrder(pizzaCheckBox,coffeCheckBox,burgerCheckBox);
            Toast.makeText(this, orderDetails, Toast.LENGTH_SHORT).show();
        });
        }
    private String placeOrder(boolean pizzaCheckBox, boolean coffeCheckBox, boolean burgerCheckBox) {int totalamount = 0;
        StringBuilder result=new StringBuilder();
        result.append("Selected Items:");
        if(pizzaCheckBox) {
            result.append("\tPizza 100Rs");
            totalamount += 100;
        }
        if (coffeCheckBox){
            result.append("\tCoffee 150Rs");
            totalamount +=150;
        }
        if (burgerCheckBox){
            result.append("\tBurger 200Rs");
            totalamount +=200;
        }
        result.append("\tTotal: "+totalamount+"Rs");
        return String.valueOf(result);
    }

}
