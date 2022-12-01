package hu.petrik.lancoltlista;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        lancoltlista<Integer> list= new lancoltlista<>();
        int elemekszama = 69;
        int legkisebb = 1;
        int legnagyobb = 420;
        for (int i = 0; i < elemekszama; i++) {
            int ertek = (int)(Math.random() * (legnagyobb - legkisebb + 1)) + legkisebb;
            list.hozzaAd(ertek);

        }

    }
}
