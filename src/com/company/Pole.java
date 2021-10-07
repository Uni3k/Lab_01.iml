package com.company;

public class Pole {
    int z;
    int x;
    int c;

    public Pole(int z, int x, int c) {
        this.z = z;
        this.x = x;
        this.c = c;
    }

    public static boolean Poletrojkata(int z, int x, int c) {
        if (z > 0 && x > 0 && c > 0) {
            int najdluzszy = z;
            int bok1 = x;
            int bok2 = c;
            if (c > z && c > x) {
                najdluzszy = c;
                bok1 = z;
                bok2 = x;
                System.out.println("Najdluzszy bok:  " + c + " kolejny bok: " + z + " ostatni bok: " + x);
            } else if (x > z && x > c) {
                najdluzszy = x;
                bok1 = c;
                bok2 = z;
                System.out.println("Najdluzszy bok:  " + x + " kolejny bok: " + c + " ostatni bok: " + z);
            }

            return bok1 * bok1 + bok2 * bok2 >= najdluzszy * najdluzszy;
        } else {
            return false;
        }
    }
}
