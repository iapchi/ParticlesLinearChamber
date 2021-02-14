package com.iapchi.Main;

import com.iapchi.model.Chamber;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Chamber chamber = new Chamber("LRLR.LRLR");
        try {
            System.out.println(Arrays.toString(chamber.animate(2)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
