package com.example.comp1011200489011test2;

import com.google.gson.annotations.SerializedName;

public class Song {

    //Instance variables

    @SerializedName("SongTitle")
    public String songTitle;

    public String performer;
    public int weekPosition;

    @SerializedName("Year")
    public int year;

    public int month;
    public int day;
    public  String url;

    /**
     * Gettes
     */
    public String getSongTitle() {
        return songTitle;
    }

    public String getPerformer() {
        return performer;
    }

    public int getWeekPosition() {
        return weekPosition;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public String getUrl() {
        return url;
    }

    /**
     * toString method
     * @return
     */
    @Override
    public String toString() {
        return "Song{" +
                "songTitle='" + songTitle + '\'' +
                ", performer='" + performer + '\'' +
                ", weekPosition=" + weekPosition +
                ", year=" + year +
                ", month=" + month +
                ", day=" + day +
                ", url='" + url + '\'' +
                '}';
    }
}
