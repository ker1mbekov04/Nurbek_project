package com.example.nurbek_project;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView familiet, namet, fathet, aget;
    Button btnt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        familiet = findViewById(R.id.familiet);
        namet = findViewById(R.id.namet);
        fathet = findViewById(R.id.fatht);
        aget = findViewById(R.id.aget);
        btnt = findViewById(R.id.btnt);

        Intent intent = getIntent();
        String surname = intent.getStringExtra("f");
        String sname = intent.getStringExtra("n");
        String sfath = intent.getStringExtra("fa");
        String sage = intent.getStringExtra("a");

        familiet.setText(surname);
        namet.setText(sname);
        fathet.setText(sfath);
        aget.setText(sage);

        btnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
