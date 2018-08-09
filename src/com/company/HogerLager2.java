package com.company;

import java.util.Random;

public class HogerLager2 {
    private int getal;
    private int teRadenGetal;
    private int teller = 0;

    public HogerLager2(int maxGetal) {
        Random rnd = new Random();
        teRadenGetal= rnd.nextInt(maxGetal) +1;



    }
    public int raad(int getal) {
        teller++;
        if (getal<teRadenGetal){

            return +1;
        }
        if (getal>teRadenGetal){
            return -1;
        }else


        return 0;

    }

    public int getAantalBeurten() {
        return teller++;
    }
}
