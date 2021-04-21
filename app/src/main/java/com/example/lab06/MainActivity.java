package com.example.lab06;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.lab06.data.LabDatabase;

public class MainActivity extends AppCompatActivity {
private Button add_person_button;
private Button get_all_persons_button;
private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add_person_button = (Button) this.findViewById(R.id.add_person_button);
        get_all_persons_button = (Button) this.findViewById(R.id.get_all_persons_button);
        add_person_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"person added", Toast.LENGTH_SHORT);
            }
        });
        get_all_persons_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),editText.getText().toString(), Toast.LENGTH_SHORT);
            }
        });
        labDB = Room.databaseBuilder(this, LabDatabase.class, DATABASE_NAME)
                .build();
    }
}