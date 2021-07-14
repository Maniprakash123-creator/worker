package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class signup extends AppCompatActivity {

    private Spinner myspinner;
    private Button Register;
    private EditText edittextname,edittextEmail,edittextPhone;
    boolean isallchecked=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        myspinner = findViewById(R.id.sex_spinner);

        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(signup.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.sex));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        myspinner.setAdapter(myAdapter);
        Register = findViewById(R.id.Register);
        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(signup.this,"Data Saved Successfully",Toast.LENGTH_LONG).show();
                isallchecked = Allchecked();
                if (isallchecked) {
                    Toast.makeText(signup.this,"User data saved successfully",Toast.LENGTH_LONG).show();
                }

            }
        });
    }
        private boolean Allchecked()
        {
            if(edittextname.length()==0)
            {
                edittextname.setError("This Fiels is required");
                return false;
            }
            if(edittextEmail.length()==0)
            {
                edittextEmail.setError("This Field is required");
                return false;
            }
            if(edittextPhone.length()==0) {
                edittextPhone.setError("This Field is required");
                return false;
            }
            return true;

        }

}