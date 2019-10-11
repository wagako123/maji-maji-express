package com.example.majiexpress;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MockActivity extends AppCompatActivity {


    private Button LogoutBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mock);

        LogoutBtn= (Button) findViewById(R.id.logout_btn);

        LogoutBtn. setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {

                Intent intent= new Intent( MockActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
