package com.calculator.cal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
   Integer input1 = 0 , input2 =0;
    boolean Addition, Subtract, Multify, Division, decimal;
    private Button btnMultify, btnDel, btnZero, btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine, btnAdd, btnSub, btnDivide, btnEqual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Binding

        btnDel = findViewById(R.id.btnDel);
        editText = findViewById(R.id.etText);
        btnAdd = findViewById(R.id.btnAdd);
        btnDivide = findViewById(R.id.btnDivide);
        btnSub = findViewById(R.id.btnSub);
        btnEqual = findViewById(R.id.btnEqual);
        btnMultify = findViewById(R.id.btnMultiply);
        btnZero = findViewById(R.id.btnZero);
        btnOne = findViewById(R.id.btnOne);
        btnTwo = findViewById(R.id.btnTwo);
        btnThree = findViewById(R.id.btnThree);
        btnFour = findViewById(R.id.btnFour);
        btnFive = findViewById(R.id.btnFive);
        btnSix = findViewById(R.id.btnSix);
        btnSeven = findViewById(R.id.btnSeven);
        btnEight = findViewById(R.id.btnEight);
        btnNine = findViewById(R.id.btnNine);



        //Setting Custom Value To Android
        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "0");
            }
        });

       btnOne.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

                editText.setText(editText.getText() + "1");

           }
       });
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "2");
            }
        });
        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "3");
            }
        });
        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "4");
            }
        });
        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "5");
            }
        });
        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "6");
            }
        });
        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "7");
            }
        });
        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "8");
            }
        });
        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "9");
            }
        });



        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText.getText().length() !=0){
                    input1 = Integer.parseInt(editText.getText() + "");
                    Addition = true;
                    decimal =false;
                    editText.setText(null);
                }
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText.getText().length() !=0){
                    input1 = Integer.parseInt(editText.getText() + "");
                    Subtract = true;
                    decimal = false;
                    editText.setText(null);
                }
            }
        });
        btnMultify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText.getText().length() !=0){
                    input1 = Integer.parseInt(editText.getText() + "");
                    Multify = true;
                    decimal = false;
                    editText.setText(null);
                }
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText.getText().length() !=0){
                    input1 = Integer.parseInt(editText.getText() + "");
                    Division = true;
                    decimal = false;
                    editText.setText(null);

                }
            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Addition || Subtract || Multify || Division ){
                    input2 = Integer.parseInt(editText.getText() + "");
                }
                if (Addition){
                    editText.setText(input1 + input2 + "");
                    Addition = false;
                }
                if (Subtract){
                    editText.setText(input1 - input2 + "");
                    Subtract = false;
                }
                if(Multify){
                    editText.setText(input1 * input2 + "");
                    Multify = false;
                }

                if(Division){
                    editText.setText(input1 / input2 + "");
                    Division = false;
                }
            }
        });

        btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
         public void onClick(View v) {
                editText.setText("");
            }
        });



    }
}
