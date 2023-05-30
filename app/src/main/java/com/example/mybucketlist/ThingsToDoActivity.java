package com.example.mybucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class ThingsToDoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_things_to_do);
        setUpList();
    }

    private void setUpList() {

        BucketListEntry[] thingsToDo = {
                new BucketListEntry("Climb Mount.Kilimanjaro","Its Quite Difficult",R.drawable.kilimanjaro,5),
                new BucketListEntry("Experience the Northern Lights","Somewhere in the arctic circle,probably in the norway",R.drawable.northern_lights,4.5f),
                new BucketListEntry("Road Trip across USA","Hire a car from West Coast and travel towards East coast",R.drawable.road_trip,5),
                new BucketListEntry("Scuba Dive ","In Koh Tao , Thailand",R.drawable.scubadive,4),
                new BucketListEntry("SkyDive","preferably over somewhere with an amazing view",R.drawable.skydive,3.5f)

        };

        RecyclerView recyclerView=findViewById(R.id.recycler_view_things_to_do);
        BucketListEntryAdapter adapter=new BucketListEntryAdapter(thingsToDo);
        recyclerView.setAdapter(adapter);
    }
}