package com.example.android.londontourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import java.util.ArrayList;

public class RecreationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feature_list);

        // Create a list of features
        final ArrayList<Feature> features = new ArrayList<>();
        features.add(new Feature(R.drawable.recreation_1, getString(R.string.recreation_1_name),
                getString(R.string.recreation_1_rating), getString(R.string.recreation_1_price),
                getString(R.string.recreation_1_description), getString(R.string.recreation_1_address),
                getString(R.string.recreation_1_hours)));
        features.add(new Feature(R.drawable.recreation_2, getString(R.string.recreation_2_name),
                getString(R.string.recreation_2_rating), getString(R.string.recreation_2_price),
                getString(R.string.recreation_2_description), getString(R.string.recreation_2_address),
                getString(R.string.recreation_2_hours)));
        features.add(new Feature(R.drawable.recreation_3, getString(R.string.recreation_3_name),
                getString(R.string.recreation_3_rating), getString(R.string.recreation_3_price),
                getString(R.string.recreation_3_description), getString(R.string.recreation_3_address),
                getString(R.string.recreation_3_hours)));
        features.add(new Feature(R.drawable.recreation_4, getString(R.string.recreation_4_name),
                getString(R.string.recreation_4_rating), getString(R.string.recreation_4_price),
                getString(R.string.recreation_4_description), getString(R.string.recreation_4_address),
                getString(R.string.recreation_4_hours)));
        features.add(new Feature(R.drawable.recreation_5, getString(R.string.recreation_5_name),
                getString(R.string.recreation_5_rating), getString(R.string.recreation_5_price),
                getString(R.string.recreation_5_description), getString(R.string.recreation_5_address),
                getString(R.string.recreation_5_hours)));
        features.add(new Feature(R.drawable.recreation_6, getString(R.string.recreation_6_name),
                getString(R.string.recreation_6_rating), getString(R.string.recreation_6_price),
                getString(R.string.recreation_6_description), getString(R.string.recreation_6_address),
                getString(R.string.recreation_6_hours)));

        // Create an {@link FeatureAdapter}, whose data source is a list of {@link Feature}s. The
        // adapter knows how to create list items for each feature in the list.
        FeatureAdapter adapter = new FeatureAdapter(this, features);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // feature_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link FeatureAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Feature} in the list.
        listView.setAdapter(adapter);
    }
}
