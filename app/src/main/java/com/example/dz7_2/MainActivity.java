package com.example.dz7_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private TextView textView ;
private Integer firsts,second;
private Boolean isOperationClik;
private Integer result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text);
    }

    public void onNumberClic(View view) {
        switch (view.getId()) {
            case R.id.btn_une:

                if (textView.getText().toString().equals("0") || isOperationClik) {
                    textView.setText("1");
                } else {
                    textView.append("1");
                }

                break;
            case R.id.btn_two:
                if (textView.getText().toString().equals("0") || isOperationClik) {
                    textView.setText("2");
                } else {
                    textView.append("2");
                }

                break;
            case R.id.btn_three:

                if (textView.getText().toString().equals("0") || isOperationClik) {
                    textView.setText("3");
                } else {
                    textView.append("3");
                }
                break;
            case R.id.btn_four:
                if (textView.getText().toString().equals("0")|| isOperationClik) {
                    textView.setText("4");
                } else {
                    textView.append("4");
                }
                break;
            case R.id.btn_five:
                if (textView.getText().toString().equals("0") || isOperationClik) {
                    textView.setText("5");
                } else {
                    textView.append("5");
                }
                break;
            case R.id.btn_six:
                if (textView.getText().toString().equals("0") || isOperationClik) {
                    textView.setText("6");
                } else {
                    textView.append("6");
                    break;
                }

            case R.id.btn_seven:
                if (textView.getText().toString().equals("0") || isOperationClik) {
                    textView.setText("7");
                } else {
                    textView.append("7");
                }
                break;
            case R.id.btn_eight:
                if (textView.getText().toString().equals("0") || isOperationClik) {
                    textView.setText("8");
                } else {
                    textView.append("8");
                }
                break;

            case R.id.btn_nine:
                if (textView.getText().toString().equals("0") || isOperationClik) {
                    textView.setText("9");

                } else {
                    textView.append("9");

                }
                break;
        }

        isOperationClik = false;

    }
    public void isOperationClik(View view) {
        switch (view.getId()){
            case R.id.btn_plus:
firsts = Integer.valueOf(textView.getText().toString());
break;
            case R.id.btn_egually:
                second  = Integer.valueOf(textView.getText().toString());
                result = firsts+ second ;
                textView.setText(result.toString());

               break;

        }
        isOperationClik = true;
    }
}