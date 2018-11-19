package com.example.sherlynlobo.sherlynlobo_mapd711_lab_assignment4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class HumberCollege extends AppCompatActivity {



    String[] humberArray = {"North Campus","Lakeshore Campus","Orangeville Campus"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_humber_college);


        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.activity_campus, humberArray);

        ListView listView = (ListView) findViewById(R.id.hcampus_listview);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                switch (position) {
                    case 0:
                        Intent newActivity1 = new Intent(HumberCollege.this, MapsActivityHumN.class);
                        startActivity(newActivity1);
                        break;
                    case 1:
                        Intent newActivity2 = new Intent(HumberCollege.this, MapsActivityHumL.class);

                        startActivity(newActivity2);
                        break;
                    case 2:
                        Intent newActivity3 = new Intent(HumberCollege.this, MapsActivityHumOrg.class);

                        startActivity(newActivity3);
                        break;

                }
            }


        });

    }
}
