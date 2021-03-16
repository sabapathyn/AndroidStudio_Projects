package com.example.android.quakereport;

public class Earthquake {
    private double mMagnitude;
    private String mLocation;
    private long mTimeInMilliseconds;
    private String mUrl;

    /**
     * Constructs a new{@link Earthquake} object
     * @param magnitude is the magnitude of the earthquake
     * @param location is the location of the earthquake
     * @param timeInMilliseconds is the time in milliseconds (from the Epoch) when the
     * earthquake happened
     * @param url is the website URL to find more details about the earthquake
     */
    public Earthquake(double magnitude, String location, Long timeInMilliseconds, String url){
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;

    }

    public double getMagnitude(){ return mMagnitude; }

    public String getLocation(){ return mLocation;}

    public Long getTimeInMilliseconds() { return mTimeInMilliseconds;}

    public String getUrl() { return mUrl; }

}



