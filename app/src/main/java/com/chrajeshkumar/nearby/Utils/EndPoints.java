package com.chrajeshkumar.nearby.Utils;

/**
 * Created by ChRajeshKumar on 26-Jan-17.
 */

public class EndPoints {

    public static String searching = "";
    public static String getSearching(String latitude,String longitude,String type) {

//        searching="https://www.googleapis.com/youtube/v3/videos?chart=mostPopular&part=snippet&key="+Config.YOUTUBE_API_KEY+"&maxResults="+15+"&pageToken="+nextpagetoken;
        //searching="https://www.googleapis.com/youtube/v3/videos?chart=mostPopular&part=snippet&key=";

        searching = "https://maps.googleapis.com/maps/api/place/nearbysearch/json?location="+latitude+","+longitude+"&radius=1000&types="+type+"&name="+type+"&sensor=false&key=AIzaSyDkp9gJIpPUNivsOQxbNKCqhg1CoO_IEjw";
        return searching;

    }
}