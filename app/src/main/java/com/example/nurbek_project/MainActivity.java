package com.example.nurbek_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText familie, name, fath, age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn= findViewById(R.id.btn);
        familie=findViewById(R.id.familie);
        name=findViewById(R.id.name);
        fath=findViewById(R.id.fath);
        age=findViewById(R.id.age);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String surname = familie.getText().toString();
                String sname = name.getText().toString();
                String sfath = fath.getText().toString();
                String sage = age.getText().toString();

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("f", surname);
                intent.putExtra("n",sname);
                intent.putExtra("fa", sfath);
                intent.putExtra("a",sage);


                startActivity(intent);
            }
        });
    }
}