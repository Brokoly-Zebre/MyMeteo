package com.example.mymeteo;


import com.google.gson.annotations.SerializedName;

public class Forecast {

    @SerializedName("main")
    Weather weather;
    @SerializedName("dt")
    private int datetime;
    public Forecast(Weather weather, int datetime) {
        this.weather = weather;
        this.datetime = datetime;
    }




}
