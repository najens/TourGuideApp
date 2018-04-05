package com.example.android.londontourguide;

/**
 * Created by Nate on 10/4/2017.
 */

/**
 * {@link Feature} represents a thing to do or place to visit in London.
 * It contains a title, rating, price, description, address, and hours.
 */
public class Feature {

    /**
     * Image resource ID for the feature
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Constant value that represents no image was provided for this feature
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Title for the feature
     */
    private String mTitle;

    /**
     * Rating for the feature
     */
    private String mRating;

    /**
     * Price for the feature
     */
    private String mPrice;

    /**
     * Description for the feature
     */
    private String mDescription;

    /**
     * Address for the feature
     */
    private String mAddress;

    /**
     * Hours for the feature
     */
    private String mHours;

    /**
     * Create a new Feature object.
     *
     * @param imageResourceId is the drawable resource ID for the image associated with the feature.
     * @param title           is the title of the thing to do or place to visit in London.
     * @param rating          is the rating of the feature.
     * @param price           is the price of the feature.
     * @param description     is the description of the feature.
     * @param address         is the address of the feature.
     * @param hours           is the hours of operation for the feature.
     */
    public Feature(int imageResourceId, String title, String rating, String price, String description, String address,
                   String hours) {
        mImageResourceId = imageResourceId;
        mTitle = title;
        mRating = rating;
        mPrice = price;
        mDescription = description;
        mAddress = address;
        mHours = hours;
    }

    /**
     * Return the image resource ID of the feature.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this feature.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     * Get the title of the feature.
     */
    public String getTitle() {
        return mTitle;
    }

    /**
     * Get the rating of the feature.
     */
    public String getRating() {
        return mRating;
    }

    /**
     * Get the price of the feature.
     */
    public String getPrice() {
        return mPrice;
    }

    /**
     * Get the description of the feature.
     */
    public String getDescription() {
        return mDescription;
    }

    /**
     * Get the address of the feature.
     */
    public String getAddress() {
        return mAddress;
    }

    /**
     * Get the hours of the feature.
     */
    public String getHours() {
        return mHours;
    }
}
