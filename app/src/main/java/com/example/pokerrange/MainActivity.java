package com.example.pokerrange;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button buttonBU40;
    Button buttonCO40;
    Button buttonHJ40;
    Button buttonMP40;
    Button buttonUTG2BB40;
    Button buttonUTG1BB40;
    Button buttonUTG40;

    ArrayList <Range> ranges;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }

        ranges = new ArrayList<>();
        ranges.add(new Range(getString(R.string.text_BU40), R.drawable.bu_40, R.drawable.bu_40_a ));
        ranges.add(new Range(getString(R.string.text_CO40), R.drawable.co_40, R.drawable.co_40_a ));
        ranges.add(new Range(getString(R.string.text_HJ40), R.drawable.hj_40, R.drawable.hj_40_a ));
        ranges.add(new Range(getString(R.string.text_MP40), R.drawable.mp_40, R.drawable.mp_40_a ));
        ranges.add(new Range(getString(R.string.text_UTG2BB40), R.drawable.utg2_40, R.drawable.utg2_40_a ));
        ranges.add(new Range(getString(R.string.text_UTG1BB40), R.drawable.utg1_40, R.drawable.utg1_40_a ));
        ranges.add(new Range(getString(R.string.text_UTG40), R.drawable.utg_40, R.drawable.utg_40_a ));

        buttonBU40 = findViewById(R.id.buttonBU40);
        buttonCO40 = findViewById(R.id.buttonCO40);
        buttonHJ40 = findViewById(R.id.buttonHJ40);
        buttonMP40 = findViewById(R.id.buttonMP40);
        buttonUTG2BB40 = findViewById(R.id.buttonUTG2BB40);
        buttonUTG1BB40 = findViewById(R.id.buttonUTG1BB40);
        buttonUTG40 = findViewById(R.id.buttonUTG40);


    }




    @Override
    public void onClick(View v) {

        int position = 0;
        switch (v.getId()) {//получаем id нажатой кнопки
            case R.id.buttonBU40:
                position = 0;
                break;
            case R.id.buttonCO40:
                position = 1;
                break;
            case R.id.buttonHJ40:
                position = 2;
                break;
            case R.id.buttonMP40:
                position = 3;
                break;
            case R.id.buttonUTG2BB40:
                position = 4;
                break;
            case R.id.buttonUTG1BB40:
                position = 5;
                break;
            case R.id.buttonUTG40:
                position = 6;
                break;
        }


        Range range = ranges.get(position);
        Intent intent = new Intent(this, ViewRange.class);
        intent.putExtra("title", range.getTitle());
        intent.putExtra("resRangeId", range.getResRangeId());
        intent.putExtra("resActionId", range.getResActionId());
        startActivity(intent);
    }
}