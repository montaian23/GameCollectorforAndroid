package com.example.gamecollectorforandroid;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArcadeDetailsList
{
    public static ArrayList<ArcadeDetails> ArcadeList = new ArrayList<ArcadeDetails>();

    public static ArrayList<ArcadeDetails> getArcadeList() {
        return ArcadeList;
    }
    public static void AddtoArcadeList(ArcadeDetails newGame) {
        ArcadeList.add(newGame);
    }

}
