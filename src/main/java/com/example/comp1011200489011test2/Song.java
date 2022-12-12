package com.example.comp1011200489011test2;

import com.google.gson.annotations.SerializedName;

import java.time.LocalDate;

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

    /**
     * getWeek() that combines the year, month and day into a LocalDate object and returns it
     */

    public LocalDate getWeek(){
        int year = getYear();
        int month = getMonth();
        int day = getDay();
        if(year < 1000 ) {
            year = 1958;
        }
        if(month > 12 || month < 1) {
            month = 1;
        }
        if(day > 31 || day < 1){
            day = 1;
        }
        LocalDate date = LocalDate.of(year, month, day);
        return date;
    }
}
