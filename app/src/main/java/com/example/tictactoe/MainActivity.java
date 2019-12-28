package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Board boardTest = new Board();
        boardTest.setElement(0,1, ElState.X);
        boardTest.setElement(1,2, ElState.O);
        boardTest.print();
    }
}
