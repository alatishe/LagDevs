/**
 * Created by Segun on 9/2/2017.
 */

package com.example.android.javadevsegun;


public class DevsList {

    /** Github Username*/
    private String mUsername;

    /** Github Profile Url*/
    private String mProfileUrl;

    /** Github Image Url*/
    private  String mImageUrl;

    /**
     * Constructs a new {@link DevsList} object.
     *
     * @param username is the username of the developer
     * @param profile is the url to he developers Github Profile
     *he profile picture of the developer on Github* @param url is the website URL to find more details about the earthquake
     */
    public DevsList(String username, String profile, String image) {
        mUsername = username;
        mProfileUrl = profile;
        mImageUrl = image;
    }

    /** getter functions to return the various values of the params*/

    public String getmUsername() { return mUsername; }

    public String getmProfileUrl() { return mProfileUrl; }

    public String getmImageUrl() { return mImageUrl; }}