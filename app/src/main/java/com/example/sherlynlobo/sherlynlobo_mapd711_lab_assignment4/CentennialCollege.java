package com.example.sherlynlobo.sherlynlobo_mapd711_lab_assignment4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CentennialCollege extends AppCompatActivity {

    String[] centennialArray = {"Progress Campus","Morningside Campus","Ashtonbee Campus","Pickering Campus",
            "Story Arts Campus"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_centennial_college);

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.activity_campus, centennialArray);

        ListView listView = (ListView) findViewById(R.id.ccampus_listview);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                switch (position) {
                    case 0:
                        Intent newActivity1 = new Intent(CentennialCollege.this, MapsActivityCentPG.class);
                        // Intent newActivity1 = new Intent(CentennialCollege.this, ProgressCampus.class);
                        startActivity(newActivity1);
                        break;
                    case 1:
                        Intent newActivity2 = new Intent(CentennialCollege.this, MapsActivityCentMS.class);

                        // Intent newActivity2 = new Intent(CentennialCollege.this, MorningsideCampus.class);
                        startActivity(newActivity2);
                        break;
                    case 2:
                        Intent newActivity3 = new Intent(CentennialCollege.this, MapsActivityCentAsh.class);

                       // Intent newActivity3 = new Intent(CentennialCollege.this, AshtonbeeCampus.class);
                        startActivity(newActivity3);
                        break;
                    case 3:
                        Intent newActivity4 = new Intent(CentennialCollege.this, MapsActivityCentPick.class);

                       // Intent newActivity4 = new Intent(CentennialCollege.this, PickeringCampus.class);
                        startActivity(newActivity4);
                        break;
                    case 4:
                        Intent newActivity5 = new Intent(CentennialCollege.this, MapsActivityCentSA.class);

                       // Intent newActivity5 = new Intent(CentennialCollege.this, StoryArtsCampus.class);
                        startActivity(newActivity5);
                        break;
                }
            }


        });

    }
}
