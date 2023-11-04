package org.example;

public class cd implements tobestored{
    private String artist;
    private String title;
    private int year;
    private double weight;

    public cd(String artist,String title,int year) {
        this.artist = artist;
        this.title=title;
        this.year=year;
        this.weight=0.1;
    }

    @Override
    public String toString() {
        return "cd{" +
                "artist='" + artist + '\'' +
                ", title='" + title + '\'' +
                ", year=" + year +

                '}';
    }
    public double weight(){
        return weight;
    }
}
