package com.example.mybucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class PlacesToGoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places_to_go);
        setUpList();
    }

    private void setUpList() {

        BucketListEntry[] placesToGo = {
                new BucketListEntry("Vietnam","Con Dao Islands , Hanoi, Halong Bay, Hoi An, Lang Co.",R.drawable.vietnam,5),
                new BucketListEntry("Kerala","Try varied Tea Flavours, stay in houseboat, the fabulous food!",R.drawable.kerala,3.5f),
                new BucketListEntry("Japan","Hot Springs, Sushi, Bamboo Forest, bullet train through mountains.",R.drawable.japan,5),
                new BucketListEntry("Iceland","Dynjandi Waterfall, natural reseves, maybe Northern lights too!",R.drawable.scubadive,4),
                new BucketListEntry("The Amazon, Brazil","Try to survive....being scared by all the creepy crawlies!",R.drawable.amazon,4.5f)

        };

        RecyclerView recyclerView=findViewById(R.id.recycler_view_places_to_go);
        BucketListEntryAdapter adapter=new BucketListEntryAdapter(placesToGo);
        recyclerView.setAdapter(adapter);
    }
}