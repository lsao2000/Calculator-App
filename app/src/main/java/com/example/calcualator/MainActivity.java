package com.example.calcualator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    TextView inputText, outputText;
    private String input, output, newOutput;
    private Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonMultiply, buttonAdd, buttonSubs, buttonDivision, buttonPoint, buttonPercent, buttonPower, buttonEqual, buttonClear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputText = (TextView) findViewById(R.id.input_text);
        outputText = (TextView) findViewById(R.id.output_text);
        button0    = (Button) findViewById(R.id.btn0);
        button1    = (Button) findViewById(R.id.btn1);
    }

}