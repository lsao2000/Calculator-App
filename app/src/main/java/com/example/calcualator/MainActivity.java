package com.example.calcualator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
public class MainActivity extends AppCompatActivity {
    Button one, two, three, four, five, sex, seven, eight, nine, zero, division, multiplication, substract, addition, rightkaws, leftkaws, oss, point, clear, equals;

    EditText inputText;
    String textValue;
    String calculAction;
    int EqualValue, firstNum, secondNum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one            = (Button) findViewById(R.id.one);
        two            = (Button) findViewById(R.id.two);
        three          = (Button) findViewById(R.id.three);
        four           = (Button) findViewById(R.id.four);
        five           = (Button) findViewById(R.id.five);
        sex            = (Button) findViewById(R.id.sex);
        seven          = (Button) findViewById(R.id.seven);
        eight          = (Button) findViewById(R.id.eight);
        nine           = (Button) findViewById(R.id.nine);
        zero           = (Button) findViewById(R.id.zero);
        division       = (Button) findViewById(R.id.division);
        substract      = (Button) findViewById(R.id.substract);
        addition       = (Button) findViewById(R.id.addition);
        multiplication = (Button) findViewById(R.id.multiplication);
        oss            = (Button) findViewById(R.id.oss);
        point          = (Button) findViewById(R.id.point);
        rightkaws      = (Button) findViewById(R.id.kawsright);
        leftkaws       = (Button) findViewById(R.id.kawsleft);
        clear          = (Button) findViewById(R.id.clear);
        equals         = (Button) findViewById(R.id.equals);
        inputText      = (EditText) findViewById(R.id.textValue);
        textValue      = inputText.getText().toString();
        /**
         * get all the value of the button and convert it into integer number
         */
        final int ONE   = Integer.parseInt(one.getText().toString());
        final int TWO   = Integer.parseInt(two.getText().toString());
        final int THREE = Integer.parseInt(three.getText().toString());
        final int FOUR  = Integer.parseInt(four.getText().toString());
        final int FIVE  = Integer.parseInt(five.getText().toString());
        final int SEX   = Integer.parseInt(sex.getText().toString());
        final int SEVEN = Integer.parseInt(seven.getText().toString());
        final int EIGHT = Integer.parseInt(eight.getText().toString());
        final int NINE  = Integer.parseInt(nine.getText().toString());
        final int ZERO  = Integer.parseInt(zero.getText().toString());
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputText.setText(textValue += String.valueOf(ONE));
            }
        });
        two.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                inputText.setText(textValue += String.valueOf(TWO));}
        });
        three.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                inputText.setText(textValue += String.valueOf(THREE));
            }
        });
        four.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                inputText.setText(textValue += String.valueOf(FOUR));
            }
        });
        five.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                inputText.setText(textValue += String.valueOf(FIVE));
            }
        });
        sex.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                inputText.setText(textValue += String.valueOf(SEX));
            }
        });
        seven.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                inputText.setText(textValue += String.valueOf(SEVEN));
            }
        });
        eight.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                inputText.setText("");
                inputText.setText(textValue += String.valueOf(EIGHT));
            }
        });
        nine.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                inputText.setText("");

                    inputText.setText(textValue += String.valueOf(NINE));

            }
        });
        zero.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                inputText.setText(textValue += String.valueOf(ZERO));
            }
        });
        clear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                inputText.setText("");
                textValue = "";
                firstNum = 0;
                secondNum = 0;
                EqualValue = 0;
            }
        });
        addition.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                calculAction = "+";
                if(textValue.equalsIgnoreCase("") || textValue.isEmpty()){
                    inputText.setText("");
                    textValue = "";
                }else if(firstNum == 0 & secondNum == 0){
                    firstNum = Integer.parseInt(textValue);
                    inputText.setText("");
                    textValue = "";

                }else {
                    if(secondNum == 0 & firstNum >= 0){
                        secondNum = Integer.parseInt(textValue);
                        inputText.setText("");
                        textValue = "";
                    }else if (secondNum >= 0 & firstNum >= 0) {
                        secondNum += Integer.parseInt(textValue);
                        inputText.setText("");
                        textValue = "";
                    }
                }
            }

        });
        substract.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                calculAction = "-";
                if(textValue.equalsIgnoreCase("") || textValue.isEmpty()){
                    inputText.setText("");
                    textValue = "";
                }else{
                    if(firstNum == 0 & secondNum == 0){
                        firstNum = Integer.parseInt(textValue);
                        inputText.setText("");
                        textValue = "";
                    }else {
                        if(secondNum == 0 & firstNum >= 0){
                            secondNum = Integer.parseInt(textValue);
                            inputText.setText("");
                            textValue = "";

                        }else if(secondNum >= 0 & firstNum >= 0){
                            secondNum -= Integer.parseInt(textValue);
                            inputText.setText("");
                            textValue = "";

                        }
                    }
                }
            }
        });
        division.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                calculAction = "/";
                if(textValue.equalsIgnoreCase("")){
                    inputText.setText("");
                    textValue = "";

                }else{
                    if(firstNum == 0 & secondNum == 0){
                        firstNum = Integer.parseInt(textValue);
                        inputText.setText("");
                    }else{
                        if(firstNum >= 0 & secondNum == 0){
                            secondNum = Integer.parseInt(textValue);
                            inputText.setText("");
                        }else if(secondNum >= 0 & firstNum >= 0){
                            secondNum /= Integer.parseInt(textValue);
                            inputText.setText("");
                        }

                    }
                }
            }
        });

        equals.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(textValue.equalsIgnoreCase("")){
                    if(firstNum != 0){
                        EqualValue = firstNum;
                        inputText.setText(String.valueOf(EqualValue));
                        firstNum = 0;
                    }
                }else{
                    if(calculAction.equalsIgnoreCase("+")){
                        secondNum = Integer.parseInt(textValue);
                        EqualValue = firstNum + secondNum;
                    }else if(calculAction.equalsIgnoreCase("-")){
                        secondNum = Integer.parseInt(textValue);
                        EqualValue = firstNum - secondNum;
                    }
                    else if(calculAction.equalsIgnoreCase("/")){
                        secondNum = Integer.parseInt(textValue);
                        EqualValue = firstNum / secondNum;
                    }
                    else if (calculAction.equalsIgnoreCase("*")){
                        secondNum = Integer.parseInt(textValue);
                        EqualValue = firstNum * secondNum;
                    }else{
                        if(!textValue.equalsIgnoreCase("")){
                            EqualValue = Integer.parseInt(textValue);
                        }
                    }
                    inputText.setText(String.valueOf(EqualValue));
                    firstNum = 0;
                    secondNum = 0;
                    EqualValue = 0;
                    calculAction = "";
                }
            }
        });
    }

}