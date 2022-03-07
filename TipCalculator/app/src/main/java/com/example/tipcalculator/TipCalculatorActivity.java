package com.example.tipcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class TipCalculatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void computeTip(View view) {

        EditText amount = (EditText) findViewById(R.id.checkAmountValue);
        EditText size = (EditText) findViewById(R.id.partySizeValue);

        String check1 = amount.getText().toString();
        String check2 = size.getText().toString();
        boolean intCheck = true;
        boolean intCheck2 = true;

        if(check1.isEmpty() || check2.isEmpty())
        {
            Toast.makeText(getApplicationContext(), "Empty or Incorrect Value(s)!", Toast.LENGTH_SHORT).show();

            EditText tv15 = (EditText) findViewById(R.id.fifteenPercentTipValue);
            tv15.setText("");

            EditText tvt15 = (EditText) findViewById(R.id.fifteenPercentTotalValue);
            tvt15.setText("");

            EditText tv20 = (EditText) findViewById(R.id.twentyPercentTipValue);
            tv20.setText("");

            EditText tvt20 = (EditText) findViewById(R.id.twentyPercentTotalValue);
            tvt20.setText("");

            EditText textView2 = (EditText) findViewById(R.id.twentyfivePercentTipValue);
            textView2.setText("");

            EditText tvt25 = (EditText) findViewById(R.id.twentyfivePercentTotalValue);
            tvt25.setText("");
        }
        else
        {
            int i = 0;
            while (i < check1.length()) {
                char c = check1.charAt(i);
                if (c >= '0' && c <= '9') {
                    i++;
                } else {
                    intCheck = false;
                    break;
                }
            }

            int j = 0;
            while (j < check2.length()) {
                char c = check2.charAt(j);
                if (c >= '0' && c <= '9') {
                    j++;
                } else {
                    intCheck = false;
                    break;
                }
            }

            if (intCheck == false || intCheck2 == false) {
                Toast.makeText(getApplicationContext(), "Empty or Incorrect Value(s)!", Toast.LENGTH_SHORT).show();

                EditText tv15 = (EditText) findViewById(R.id.fifteenPercentTipValue);
                tv15.setText("");

                EditText tvt15 = (EditText) findViewById(R.id.fifteenPercentTotalValue);
                tvt15.setText("");

                EditText tv20 = (EditText) findViewById(R.id.twentyPercentTipValue);
                tv20.setText("");

                EditText tvt20 = (EditText) findViewById(R.id.twentyPercentTotalValue);
                tvt20.setText("");

                EditText textView2 = (EditText) findViewById(R.id.twentyfivePercentTipValue);
                textView2.setText("");

                EditText tvt25 = (EditText) findViewById(R.id.twentyfivePercentTotalValue);
                tvt25.setText("");
            } else {

                int checkAmount = Integer.parseInt(check1);
                int partySize = Integer.parseInt(check2);

                int tip15, tip20, tip25, totalTip15, totalTip20, totalTip25;

                totalTip15 = (checkAmount * 15) / 100;
                totalTip20 = (checkAmount * 20) / 100;
                totalTip25 = (checkAmount * 25) / 100;

                tip15 = totalTip15 / partySize;
                tip20 = totalTip20 / partySize;
                tip25 = totalTip25 / partySize;

                EditText tv15 = (EditText) findViewById(R.id.fifteenPercentTipValue);
                tv15.setText(Integer.toString(tip15));

                EditText tvt15 = (EditText) findViewById(R.id.fifteenPercentTotalValue);
                tvt15.setText(Integer.toString(totalTip15));

                EditText tv20 = (EditText) findViewById(R.id.twentyPercentTipValue);
                tv20.setText(Integer.toString(tip20));

                EditText tvt20 = (EditText) findViewById(R.id.twentyPercentTotalValue);
                tvt20.setText(Integer.toString(totalTip20));

                EditText textView2 = (EditText) findViewById(R.id.twentyfivePercentTipValue);
                textView2.setText(Integer.toString(tip25));

                EditText tvt25 = (EditText) findViewById(R.id.twentyfivePercentTotalValue);
                tvt25.setText(Integer.toString(totalTip25));
            }
        }
    }
}


