package com.example.codefest_calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn_0,btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9;
    Button btn_addition, btn_substraction, btn_multiply, btn_division, btn_dot, btn_clear, btn_equal,btn_delete;
    EditText editTxt_display;
    TextView txt_view;

    float valueOne, valueTwo, answer;
    boolean isAddition, isSubstraction, isMultiply, isDivision;
    String operation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.sliit);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        valueOne = 0;
        valueTwo = 0;

        btn_0 = findViewById(R.id.btn_zero);
        btn_1 = findViewById(R.id.btn_one);
        btn_2 = findViewById(R.id.btn_two);
        btn_3 = findViewById(R.id.btn_three);
        btn_4 = findViewById(R.id.btn_four);
        btn_5 = findViewById(R.id.btn_five);
        btn_6 = findViewById(R.id.btn_six);
        btn_7 = findViewById(R.id.btn_seven);
        btn_8 = findViewById(R.id.btn_eight);
        btn_9 = findViewById(R.id.btn_nine);

        btn_addition = findViewById(R.id.btn_adition);
        btn_substraction = findViewById(R.id.btn_subtraction);
        btn_multiply = findViewById(R.id.btn_multiply);
        btn_division = findViewById(R.id.btn_division);
        btn_dot = findViewById(R.id.btn_dot);
        btn_clear = findViewById(R.id.btn_clear);
        btn_equal = findViewById(R.id.btn_equal);
        btn_delete = findViewById(R.id.btn_delete);

        editTxt_display = findViewById(R.id.txt_display);
        txt_view = findViewById(R.id.txt_view);

        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTxt_display.setText(editTxt_display.getText() + "0");
            }
        });

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTxt_display.setText(editTxt_display.getText() + "1");
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTxt_display.setText(editTxt_display.getText() + "2");
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTxt_display.setText(editTxt_display.getText() + "3");
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTxt_display.setText(editTxt_display.getText() + "4");
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTxt_display.setText(editTxt_display.getText() + "5");
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTxt_display.setText(editTxt_display.getText() + "6");
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTxt_display.setText(editTxt_display.getText() + "7");
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTxt_display.setText(editTxt_display.getText() + "8");
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTxt_display.setText(editTxt_display.getText() + "9");
            }
        });

        btn_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTxt_display.setText(editTxt_display.getText() + ".");
            }
        });

        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTxt_display.setText(null);
                txt_view.setText(null);
                editTxt_display.setClickable(true);
                valueOne = 0;
                valueTwo = 0;
            }
        });

        btn_addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(valueOne == 0) {
                    valueOne = Float.parseFloat(editTxt_display.getText() + "");
                }
                isAddition = true;

                editTxt_display.setText(null);
                txt_view.setText(valueOne+" " + " +");
            }
        });

        btn_substraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(valueOne == 0) {
                    valueOne = Float.parseFloat(editTxt_display.getText() + "");
                }
                isSubstraction = true;

                editTxt_display.setText(null);
                txt_view.setText(valueOne+"" + " -");
            }
        });

        btn_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(valueOne == 0) {
                    valueOne = Float.parseFloat(editTxt_display.getText() + "");
                }
                isMultiply = true;

                editTxt_display.setText(null);
                txt_view.setText(valueOne+"" + " *");
            }
        });

        btn_division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(valueOne == 0) {
                    valueOne = Float.parseFloat(editTxt_display.getText() + "");
                }
                isDivision= true;

                editTxt_display.setText(null);
                txt_view.setText(valueOne+"" + " /");
            }
        });

        btn_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editTxt_display.length() >= 1 ) {
                    String text = editTxt_display.getText().toString();
                    editTxt_display.setText(text.substring(0, text.length() - 1));
                }
            }
        });

        btn_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueTwo = Float.parseFloat(editTxt_display.getText() + "");

                if(isAddition == true) {
                    answer = valueOne + valueTwo;
                    operation = "+";
                    isAddition = false;
                }

                if(isSubstraction == true) {
                    answer = valueOne - valueTwo;
                    operation = "-";
                    isSubstraction = false;
                }

                if(isMultiply == true) {
                    answer = valueOne * valueTwo;
                    operation = "*";
                    isMultiply = false;
                }

                if(isDivision == true) {
                    answer = valueOne / valueTwo;
                    operation = "/";
                    isDivision = false;
                }

                editTxt_display.setText(valueOne + " " + operation + " " + valueTwo + " " + "=" + " " + answer);
                editTxt_display.setKeyListener(null);
                txt_view.setText(null);

                valueOne = answer;
                valueTwo = 0;
            }
        });
    }
}
