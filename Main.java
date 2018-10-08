package com.company;

/**
 * Yogie Alfin Salim
 * 10117100
 * IF - 3
 * Deskripsi Program : Menunjukkan daftar film
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("=====DAFTAR FILM YANG SEDANG TAYANG====="+"\n");

        Film film = new Film();
        film.nowPlaying("Venom", "Action, Horror, Sci-fi", 8.5, 120);
        film.nowPlaying("Small Foot", "animation", 9.0, 120);
        film.nowPlaying("Crazy Rich Asian", "Comedy", 7.8, 119);
        film.nowPlaying("Asih", "Horror", 6.0, 100);
    }

}
