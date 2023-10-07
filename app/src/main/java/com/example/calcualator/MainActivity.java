package com.example.calcualator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
public class MainActivity extends AppCompatActivity {
    TextView inputText, outputText;
    private String input, output, newOutput;
    private Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonMultiply, buttonAdd, buttonSubs, buttonDivision, buttonPoint, buttonPercent, buttonPower, buttonEqual, buttonClear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputText      = (TextView) findViewById(R.id.input_text);
        outputText     = (TextView) findViewById(R.id.output_text);
        buttonMultiply = (Button) findViewById(R.id.multiplication_btn);
        buttonDivision = (Button) findViewById(R.id.division_btn);
        buttonPercent  = (Button) findViewById(R.id.percentage_btn);
        button0        = (Button) findViewById(R.id.btn0);
        button1        = (Button) findViewById(R.id.btn1);
        button2        = (Button) findViewById(R.id.btn2);
        button3        = (Button) findViewById(R.id.btn3);
        button4        = (Button) findViewById(R.id.btn4);
        button5        = (Button) findViewById(R.id.btn5);
        button6        = (Button) findViewById(R.id.btn6);
        button7        = (Button) findViewById(R.id.btn7);
        button8        = (Button) findViewById(R.id.btn8);
        button9        = (Button) findViewById(R.id.btn9);
        buttonSubs     = (Button) findViewById(R.id.substract_btn);
        buttonAdd      = (Button) findViewById(R.id.addition_btn);
        buttonPoint    = (Button) findViewById(R.id.pointbtn);
        buttonEqual    = (Button) findViewById(R.id.equalbtn);
        buttonPower    = (Button) findViewById(R.id.power_btn);
        buttonClear    = (Button) findViewById(R.id.clear_btn);

        }
        public void onButtonClicked(View view){
            Button button = (Button) view;
            String data = button.getText().toString();
            switch(data){
                case "C":
                    input = null;
                    output = null;
                    outputText.setText("");
                    break;
                case "^":
                    input += "^";
                    solve();
                    break;
                case "*":
                    input += "*";
                    solve();
                    break;
                case "=":
                    solve();
                    break;
                case "%":
                    input += "%";
                    double d = Double.parseDouble(inputText.getText().toString()) / 100;
                    outputText.setText(String.valueOf(d));
                    break;
                default:
                    if(input == null){
                        input = "";
                    }
                    if(data.equals("+") || data.equals("/") || data.equals("-")){
                        solve();
                    }
                    input+= data;
            }
            inputText.setText(input);
    }
    private void solve(){
        if(input.split("\\+").length == 2){
            String numbers [] = input.split("\\+");
            try{
                double d = Double.parseDouble(numbers[0])+Double.parseDouble(numbers[1]);
                output   = Double.toString(d);
                outputText.setText(output);
                input = d + "";
            }
            catch (Exception e){
                outputText.setText(e.getMessage().toString());
            }
        }
    }
}