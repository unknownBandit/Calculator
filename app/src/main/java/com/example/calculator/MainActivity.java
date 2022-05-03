package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import org.mariuszgromada.math.mxparser.*;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText _display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _display = findViewById(R.id.input1);
        _display.setShowSoftInputOnFocus(false);



        _display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(_display.equals("''")){
                    _display.setText("");
                }
            }
        });


    }

    private void updateText(String strToAdd)
    {
        String oldStr = _display.getText().toString();

        /*String leftStr = oldStr.substring(0,curosrPos);
        String rightStr = oldStr.substring(curosrPos);

        _display.setText(String.format("%s%s%s", leftStr, strToAdd, rightStr));*/
        _display.setText(String.format("%s%s", oldStr, strToAdd));

    }
    public void zero_BTN(View view){
        updateText("0");
    }

    public void one_BTN(View view){
        updateText("1");
    }

    public void two_BTN(View view){
        updateText("2");
    }

    public void three_BTN(View view){
        updateText("3");
    }

    public void four_BTN(View view){
        updateText("4");
    }

    public void five_BTN(View view){
        updateText("5");
    }

    public void six_BTN(View view){
        updateText("6");
    }

    public void seven_BTN(View view){
        updateText("7");
    }

    public void eight_BTN(View view){
        updateText("8");
    }

    public void nine_BTN(View view){
        updateText("9");
    }

    public void clear_BTN(View view){
        _display.setText("");
    }

   /* public void exponent_BTN(View view){
        updateText("^");
    }

    public void parentheses_BTN(View view){
        updateText("()");
    }*/

    public void divide_BTN(View view){
        updateText("/");
    }

    public void multiply_BTN(View view){
        updateText("*");
    }

    public void add_BTN(View view){
        updateText("+");
    }

    public void subtract_BTN(View view){
        updateText("-");
    }

   /* public void plusminus_BTN(View view){
        updateText("-");
    }*/

    /*public void point_BTN(View view){
        updateText(".");
    }*/

    public void equals_BTN(View view){
        String userExp = _display.getText().toString();
        Expression exp = new Expression(userExp);
        String result = String.valueOf(exp.calculate());
        _display.setText(result);
        _display.setSelection(result.length());

    }
//
//    public void backspace_BTN(View view){
//        int cursorPos = _display.getSelectionStart();
//        int textLen = _display.getText().length();
//
//        if(cursorPos != 0 && textLen !=  0 ){
//            SpannableStringBuilder selection = (SpannableStringBuilder) _display.getText();
//            selection.replace(cursorPos-1, cursorPos, "");
//            _display.setText(selection);
//            _display.setSelection(cursorPos-1);
//        }
//    }


}