package com.company;

public class Film {
    public String filmName;
    public String Genre;
    public double Rating;
    public int Duration;

    public void nowPlaying (String filmName, String Genre, double Rating, int Duration) {
        System.out.println("Judul Film\t\t: " +filmName);
        System.out.println("Genre Film\t\t: " +Genre);
        System.out.println("Rating Film\t\t: " +Rating);
        System.out.println("Duration Film\t: " +Duration +" Menit\n");
    }
}
