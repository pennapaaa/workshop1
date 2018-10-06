package com.example.administrator.workshopbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final TextView  SHOWNAME = findViewById(R.id.tv_SHOWNAME);
        final TextView  SHOWSURNAME = findViewById(R.id.tv_SHOWSURNAME);
        final TextView  NAME = findViewById(R.id.et_NAME);
        final TextView  SURNAME = findViewById(R.id.et_SURNAME);
        Button btnSetData = findViewById(R.id.btn_setdata);

        btnSetData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SHOWNAME.setText(NAME.getText());
                SHOWSURNAME.setText(SURNAME.getText());
            }
        });
    }
}
