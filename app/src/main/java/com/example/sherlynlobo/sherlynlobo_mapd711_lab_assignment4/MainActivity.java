package com.example.sherlynlobo.sherlynlobo_mapd711_lab_assignment4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    // Array of strings
    String[] collegeArray = {"Centennial College","Seneca College","Humber College","Sheridan College",
            "Lambton College"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.activity_campus, collegeArray);

        // Configure the list view.
        ListView listView = (ListView) findViewById(R.id.colleges_listview);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                switch (position) {
                    case 0:
                        Intent newActivity1 = new Intent(MainActivity.this, CentennialCollege.class);
                        startActivity(newActivity1);
                        break;
                    case 1:
                        Intent newActivity2 = new Intent(MainActivity.this, SenecaCollege.class);
                        startActivity(newActivity2);
                        break;
                    case 2:
                        Intent newActivity3 = new Intent(MainActivity.this, HumberCollege.class);
                        startActivity(newActivity3);
                        break;
                    case 3:
                        Intent newActivity4 = new Intent(MainActivity.this, SheridanCollege.class);
                        startActivity(newActivity4);
                        break;
                    case 4:
                        Intent newActivity5 = new Intent(MainActivity.this, LambtonCollege.class);
                        startActivity(newActivity5);
                        break;

                }
            }


        });

    }
    }