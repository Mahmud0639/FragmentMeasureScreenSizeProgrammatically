package com.manuni.fragmentmeasurescreensizeprogrammatically;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView resultTxt;
    private Button measureBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultTxt = findViewById(R.id.measureScreenTxt);
        measureBtn = findViewById(R.id.measureBtn);

        measureBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ScreenMeasure screenMeasure = new ScreenMeasure(MainActivity.this);
                resultTxt.setText(String.format("Width is %s , Height is %s ",screenMeasure.getDpWidth(),screenMeasure.getDpHeight()));
            }
        });
    }
}