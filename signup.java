package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class signup extends AppCompatActivity {

  private EditText name, editTextEmail,editTextPhone;
 // private Button submit;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
       name=findViewById(R.id.name);
       editTextEmail=findViewById(R.id.editTextEmail);
        editTextPhone=findViewById(R.id.editTextPhone);

       // submit=findViewById(R.id.submit);
        //submit.setOnClickListener(new View.OnClickListener() {
          //  @Override
            //public void onClick(View v) {
              //Toast.makeText(signup.this,"Data saved successfully",Toast.LENGTH_LONG).show();
            //}
        //});


        Toast.makeText(signup.this,"Data saved successfully",Toast.LENGTH_LONG).show();


    }



}
