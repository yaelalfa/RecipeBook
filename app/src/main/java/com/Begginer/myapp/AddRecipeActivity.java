package com.Begginer.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class AddRecipeActivity extends AppCompatActivity {

    private TextView notFound;
    private String[] types={"יבשים","רטובים","פירות","ירקות"};

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

        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        LayoutInflater inf=getLayoutInflater();
        View dialogView=inf.inflate(R.layout.not_found_dialog,null);
        builder.setView(dialogView);

        Spinner Dspinner=dialogView.findViewById(R.id.spinnerType);
        ArrayAdapter<CharSequence> ad=ArrayAdapter.createFromResource(this,R.array.spinnerType, android.R.layout.simple_spinner_item);
        ad.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Dspinner.setAdapter(ad);
        AlertDialog dialog=builder.create();
        dialog.show();




    }
}