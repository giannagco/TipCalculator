package com.example.gianna.tipcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tipAmountTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tipAmountTextView = (TextView)findViewById(R.id.tipAmount);
        final EditText tipEnter = (EditText)findViewById(R.id.tipEnter);
        final EditText tipPercent = (EditText)findViewById(R.id.tipPercent);
        Button calculateButton = (Button)findViewById(R.id.calculateButton);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strTotal = tipEnter.getText().toString();
                String strPercent = tipPercent.getText().toString();

                Double total = Double.parseDouble(strTotal);
                Double percent = Double.parseDouble(strPercent);

                Double tipAmount = total * (percent / 100);
                tipAmountTextView.setText("Tip Amount: " + Double.toString(tipAmount));
            }
        });
    }
}
