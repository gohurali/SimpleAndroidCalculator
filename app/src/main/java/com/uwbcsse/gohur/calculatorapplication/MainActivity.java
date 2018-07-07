/**
 * @author Gohur Ali
 * @version 07052018
 *
 * Simple Calculator for Android OS
 */
package com.uwbcsse.gohur.calculatorapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Stack;


public class MainActivity extends AppCompatActivity {
    //------------------Button Fields------------------------------
    private Button zero;
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;

    //Operator Buttons;
    private Button add;
    private Button subtract;
    private Button multiply;
    private Button divide;
    private Button equals;

    //Clear Button
    private Button clear;

    //Result
    private TextView info;
    private TextView result;

    //Stack for Operations
    private Stack<Integer> operation;

    boolean opClick = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Setting Fields with Respective Buttons on UI
        setUI();

        //Displaying Numbers to the Screen
        displayVals();
        displayOperator();
    }

    private void compute(){
        if(opClick){
            Integer num1 = Integer.parseInt((String)info.getText().subSequence(0,info.getText().length() - 3));
        }
    }

    /**
     * This method sets the fields with the buttons on User interface
     */
    private void setUI(){
        //Setting Number Buttons
        zero = findViewById(R.id.button0);
        one = findViewById(R.id.button1);
        two = findViewById(R.id.button2);
        three = findViewById(R.id.button3);
        four = findViewById(R.id.button4);
        five = findViewById(R.id.button5);
        six = findViewById(R.id.button6);
        seven = findViewById(R.id.button7);
        eight = findViewById(R.id.button8);
        nine = findViewById(R.id.button9);
        //Setting Operator Buttons
        add = findViewById(R.id.buttonAdd);
        subtract = findViewById(R.id.buttonSub);
        multiply = findViewById(R.id.buttonMul);
        divide = findViewById(R.id.buttonDiv);
        equals = findViewById(R.id.buttonEqual);
        //Result and Screen
        info = findViewById(R.id.textView3);
        result = findViewById(R.id.textView3);
        clear = findViewById(R.id.buttonClear);
    }

    /**
     * This Method displays the values on the info bar
     */
    private void displayVals(){
        //If Clear Button is pressed --> Empty!
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText("");
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText() + "0");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText() + "1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText() + "2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText() + "3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText() + "4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText() + "5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText() + "6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText() + "7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText() + "8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText() + "9");
            }
        });
    }

    /**
     * Displays the operator on the screen
     */
    private void displayOperator(){
        //--Operators--
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                info.setText(info.getText() + " + ");
                opClick = true;
                //compute();
            }
        });
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText() + " - ");
                opClick = true;
                //compute();
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText() + " * ");
                opClick = true;
                //compute();
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText() + " / ");
                opClick = true;
                //compute();
            }
        });
    }
}