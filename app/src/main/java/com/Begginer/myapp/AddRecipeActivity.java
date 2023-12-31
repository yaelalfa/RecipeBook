package com.Begginer.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AddRecipeActivity extends AppCompatActivity {

    private TextView notFound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_recipe);
        notFound=(TextView) findViewById(R.id.notFoundI);
        notFound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addNotFoundIngredient();
            }
        });

    }

    private void addNotFoundIngredient(){
        Dialog dialog=new Dialog(this);
        dialog.setContentView(R.layout.not_found_dialog);
        dialog.show();

    }
}