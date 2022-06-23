
package com.example.pokerrange;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ViewRange extends AppCompatActivity {
    private TextView textView;
    private ImageView imageRange;
    private ImageView imageAction;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_range);
        textView = findViewById(R.id.textView);
        imageRange = findViewById(R.id.imageRange);
        imageAction = findViewById(R.id.imageActions);
        Intent intent  = getIntent();
        if (intent.hasExtra("title") && intent.hasExtra("resRangeId") & intent.hasExtra("resActionId")) {
            String title = intent.getStringExtra("title");
            int resRangeId = intent.getIntExtra("resRangeId", -1);
            int resActionId = intent.getIntExtra("resActionId", -1);
            textView.setText(title);
            imageRange.setImageResource(resRangeId);
            imageAction.setImageResource(resActionId);

        }

                ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }

    }
}