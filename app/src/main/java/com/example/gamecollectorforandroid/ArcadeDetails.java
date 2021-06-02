package com.example.gamecollectorforandroid;

import java.time.Year;

public class ArcadeDetails
{
    private String name;
    private String Genre;
    private String platform;
    private int year;
    private String Company;

    public String getName() {
        return name;
    }
    public String getGenre() {
        return Genre;
    }
    public String getPlatform() {
        return platform;
    }
    public int getYear() {
        return year;
    }
    public String getCompany() {
        return Company;
    }
    public ArcadeDetails(String N, String G, String P, int Y, String C) {
        name = N;
        Genre = G;
        platform = P;
        year = Y;
        Company = C;
    }
}
