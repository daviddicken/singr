package com.daviddicken.singr;

public class Album {

    private String title;
    private String artist;
    private int count;
    private int seconds;
    private String image;


    public Album(String title, String artist, int count, int seconds, String image) {
        this.title = title;
        this.artist = artist;
        this.count = count;
        this.seconds = seconds;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
