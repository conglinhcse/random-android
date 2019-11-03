

package com.hpcc.randomapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtStartNumber , edtEndNumber;
    TextView tvRandomNumber;
    Button btnGenarate;

    Integer start=0, end=0, random=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize component of this frame
        edtStartNumber = (EditText)findViewById(R.id.edtStartNumber);
        edtEndNumber = (EditText)findViewById(R.id.edtEndNumber);
        tvRandomNumber = (TextView)findViewById(R.id.tvRandomNumber);
        btnGenarate = (Button)findViewById(R.id.btnGenerate);

    }

    @SuppressLint("SetTextI18n")
    public void btnGenerateClick(View v) {
        start = Integer.parseInt(edtStartNumber.getText().toString());
        end = Integer.parseInt(edtEndNumber.getText().toString());

        random = (int)((Math.random() * ((end - start) + 1)) + start);

        tvRandomNumber.setText(random.toString());
    }
}
