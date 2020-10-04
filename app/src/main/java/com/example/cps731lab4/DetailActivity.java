package com.example.cps731lab4;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity  extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_detail);
        Log.d("test","ttt");
        getItemDetails();
    }
    private void getItemDetails(){
        Intent intent=getIntent();
        if(intent.hasExtra("item_title") && intent.hasExtra("item_desc")){
            TextView title=findViewById(R.id.txtTitle);
            TextView description = findViewById(R.id.txtDescription);
            title.setText(intent.getStringExtra("item_title"));
            description.setText(intent.getStringExtra("item_desc"));

        }

    }
}
