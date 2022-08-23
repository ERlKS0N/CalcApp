package com.example.mycalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void findSum(View view) {
        EditText number1ET = findViewById(R.id.numb1ET);
        EditText number2ET = findViewById(R.id.numb2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        int num1 = Integer.parseInt(number1ET.getText().toString());
        int num2 = Integer.parseInt(number2ET.getText().toString());
        int sum = num1 + num2;

        numberSumTV.setText("" + sum);
    }
    public void findDiff(View view) {
        EditText number1ET = findViewById(R.id.numb1ET);
        EditText number2ET = findViewById(R.id.numb2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        int num1 = Integer.parseInt(number1ET.getText().toString());
        int num2 = Integer.parseInt(number2ET.getText().toString());
        int sum = num1 - num2;

        numberSumTV.setText("" + sum);
    }
    public void findProduct(View view) {
        EditText number1ET = findViewById(R.id.numb1ET);
        EditText number2ET = findViewById(R.id.numb2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        int num1 = Integer.parseInt(number1ET.getText().toString());
        int num2 = Integer.parseInt(number2ET.getText().toString());
        int sum = num1 * num2;

        numberSumTV.setText("" + sum);
    }
    public void findDivison(View view) {
        EditText number1ET = findViewById(R.id.numb1ET);
        EditText number2ET = findViewById(R.id.numb2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);

        int num1 = Integer.parseInt(number1ET.getText().toString());
        int num2 = Integer.parseInt(number2ET.getText().toString());
        int sum = num1 / num2;

        numberSumTV.setText("" + sum);
    }


}