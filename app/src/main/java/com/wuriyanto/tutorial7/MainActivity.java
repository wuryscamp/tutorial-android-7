package com.wuriyanto.tutorial7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn1;
    private RadioGroup radioGroupGender;
    private RadioButton radioButtonGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.btn1);

        radioGroupGender = (RadioGroup) findViewById(R.id.rg_gender);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btnClick(view);
            }
        });
    }

    private void btnClick(View view) {

        // get id from radio group
        int selected = radioGroupGender.getCheckedRadioButtonId();

        radioButtonGender = (RadioButton) findViewById(selected);

        if(selected == -1) {
            Toast.makeText(getApplicationContext(), "No Gender Selected !", Toast.LENGTH_SHORT).show();
        } else {
            String gender = radioButtonGender.getText().toString();

            String result = "Gender : "+gender;

            Toast.makeText(getApplicationContext(), result, Toast.LENGTH_SHORT).show();
        }
    }
}
