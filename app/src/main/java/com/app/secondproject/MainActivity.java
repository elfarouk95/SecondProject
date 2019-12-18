package com.app.secondproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText Fnumber;
    EditText sgin;
    EditText SecondNumber;
    Button btn;
    TextView Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Fnumber = findViewById(R.id.Fnumber);
        sgin = findViewById(R.id.sgin);
        SecondNumber = findViewById(R.id.SecondNumber);
        btn = findViewById(R.id.btn);
        btn.setOnClickListener(this);
        Result = findViewById(R.id.Result);

    }

    @Override
    public void onClick(View v) {
        String Fn = Fnumber.getText().toString();
        String Sn = SecondNumber.getText().toString();
        String S = sgin.getText().toString();

        double f = Double.parseDouble(Fn);
        double s = Double.parseDouble(Sn);
        double rsu = 0;

        if (S.equals("*")) {
            rsu = f * s;
        } else if (S.equals("+")) {
            rsu = f + s;
        } else if (S.equals("-")) {
            rsu = f - s;
        } else {
            rsu = f / s;
        }

        Result.setText(String.valueOf(rsu));

    }
}
