package com.example.cvhomework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_education).setOnClickListener(listenerEducation);
        findViewById(R.id.btn_work).setOnClickListener(listenerWork);
        findViewById(R.id.btn_hobby).setOnClickListener(listenerHobby);
    }

    View.OnClickListener listenerEducation = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(view.getContext(), EducationActivity.class));
        }
    };

    View.OnClickListener listenerWork = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(view.getContext(), WorkActivity.class));
        }
    };

    View.OnClickListener listenerHobby = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(view.getContext(), HobbyActivity.class));
        }
    };
}
