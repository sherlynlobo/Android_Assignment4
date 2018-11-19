package com.example.sherlynlobo.sherlynlobo_mapd711_lab_assignment4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SheridanCollege extends AppCompatActivity {
    String[] sheridanArray = {"Sheridan Oakville Campus","Davis Campus","Hazel McCallion Campus"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sheridan_college);

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.activity_campus, sheridanArray);

        ListView listView = (ListView) findViewById(R.id.shercampus_listview);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                switch (position) {
                    case 0:
                        Intent newActivity1 = new Intent(SheridanCollege.this, MapsActivitySherOk.class);
                        startActivity(newActivity1);
                        break;
                    case 1:
                        Intent newActivity2 = new Intent(SheridanCollege.this, MapsActivitySherDav.class);

                        startActivity(newActivity2);
                        break;
                    case 2:
                        Intent newActivity3 = new Intent(SheridanCollege.this, MapsActivitySherHazeMc.class);

                        startActivity(newActivity3);
                        break;

                }
            }


        });
    }
}
