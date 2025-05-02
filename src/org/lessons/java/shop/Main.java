package org.lessons.java.shop;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();

        Prodotto iphone16 = new Prodotto(rand.nextInt(99), "iPhone 16", "L'ultimo smartphone rilasciato da Apple!", 999.99f, 22);
    }
}
