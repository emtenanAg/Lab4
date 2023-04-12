package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText Name;
    EditText Age;
    Switch switch1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        Name = findViewById(R.id.Name);
        Age = findViewById(R.id.Age);
        switch1 = findViewById(R.id.switch1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    CustomerModel cm = new CustomerModel(2, Integer.parseInt(Age.getText().toString()), Name.getText().toString() , switch1.isChecked());
                    DatabaseHelper dbh = new DatabaseHelper(MainActivity.this);
                    boolean addOne = dbh.addOne(cm);
                    Toast.makeText(MainActivity.this, "Added" + addOne, Toast.LENGTH_SHORT).show();
                } catch (Exception e) {
                    Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
                }

            }


        });
    }
}