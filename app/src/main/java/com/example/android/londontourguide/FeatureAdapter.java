package com.example.android.londontourguide;

/**
 * Created by Nate on 10/4/2017.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link FeatureAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Feature} objects.
 */
public class FeatureAdapter extends ArrayAdapter<Feature> {

    /**
     * Create a new {@link FeatureAdapter} object.
     *
     * @param context  is the current context (i.e. Activity) that the adapter is being created in.
     * @param features is the list of {@link Feature}s to be displayed.
     */
    public FeatureAdapter(Context context, ArrayList<Feature> features) {
        super(context, 0, features);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Feature currentFeature = getItem(position);

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Check if an image is provided for this item or not
        if (currentFeature.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentFeature.getImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        // Find the TextView in the list_item.xml layout with the ID title_text_view.
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title_text_view);
        // Get the title from the currentItem object and set this text on
        // the title TextView.
        titleTextView.setText(currentFeature.getTitle());

        // Find the RatingBar in the list_item.xml layout with the ID rating_bar.
        RatingBar ratingBar = (RatingBar) listItemView.findViewById(R.id.rating_bar);
        // Get the rating from the currentItemobject and set this value on the RatingBar.
        ratingBar.setRating(Float.parseFloat(currentFeature.getRating()));

        // Find the TextView in the list_item.xml layout with the ID price_text_view.
        TextView priceTextView = (TextView) listItemView.findViewById(R.id.price_text_view);
        // Get the price from the currentItem object and set this text on
        // the price TextView.
        priceTextView.setText(currentFeature.getPrice());

        // Find the TextView in the list_item.xml layout with the ID description_text_view.
        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description_text_view);
        // Get the description from the currentItem object and set this text on
        // the description TextView.
        descriptionTextView.setText(currentFeature.getDescription());

        // Find the TextView in the list_item.xml layout with the ID address_text_view.
        TextView addressTextView = (TextView) listItemView.findViewById(R.id.address_text_view);
        // Get the address from the currentItem object and set this text on
        // the address TextView.
        addressTextView.setText(currentFeature.getAddress());

        // Find the TextView in the list_item.xml layout with the ID hours_text_view.
        TextView hoursTextView = (TextView) listItemView.findViewById(R.id.hours_text_view);
        // Get the hours from the currentItem object and set this text on
        // the hours TextView.
        hoursTextView.setText(currentFeature.getHours());

        // Return the whole list item layout so that it can be shown in
        // the ListView.
        return listItemView;
    }
}
