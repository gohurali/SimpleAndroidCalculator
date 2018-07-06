package com.uwbcsse.gohur.calculatorapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

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

    //Result
    private TextView info;
    private TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
