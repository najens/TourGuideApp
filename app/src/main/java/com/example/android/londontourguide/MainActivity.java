package com.example.android.londontourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the sites category
        TextView sites = (TextView) findViewById(R.id.sites_text_view);

        // Set a click listener on that View
        sites.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SitesActivity}
                Intent sitesIntent = new Intent(MainActivity.this, SitesActivity.class);

                // Start the new activity
                startActivity(sitesIntent);
            }
        });

        // Find the View that shows the restaurants category
        TextView restaurants = (TextView) findViewById(R.id.restaurants_text_view);

        // Set a click listener on that View
        restaurants.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the restaurants category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link RestaurantsActivity}
                Intent restaurantsIntent = new Intent(MainActivity.this, RestaurantsActivity.class);

                // Start the new activity
                startActivity(restaurantsIntent);
            }
        });

        // Find the View that shows the recreation category
        TextView recreation = (TextView) findViewById(R.id.recreation_text_view);

        // Set a click listener on that View
        recreation.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the recreation category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link RecreationActivity}
                Intent recreationIntent = new Intent(MainActivity.this, RecreationActivity.class);

                // Start the new activity
                startActivity(recreationIntent);
            }
        });

        // Find the View that shows the entertainment category
        TextView entertainment = (TextView) findViewById(R.id.entertainment_text_view);

        // Set a click listener on that View
        entertainment.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PhrasesActivity}
                Intent entertainmentIntent = new Intent(MainActivity.this, EntertainmentActivity.class);

                // Start the new activity
                startActivity(entertainmentIntent);
            }
        });
    }
}
