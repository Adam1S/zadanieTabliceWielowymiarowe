package com.company;

public class Main {

    public static void main(String[] args) {
        double[][] tabl={{1, 1.5, 2},{1.5, 2, 2.5}, {2, 2.5, 3}};

        System.out.println("Suma iloczynów przekątnych tablicy: "+
                ((tabl[0][0]*tabl[1][1]*tabl[2][2])+(tabl[0][2]*tabl[1][1]*tabl[2][0])));

        System.out.println("Iloczyn sum środkowego wiersza i środkowej kolumny tablicy "+
                ((tabl[0][1]+tabl[1][1]+tabl[2][1])*(tabl[1][0]*tabl[1][1]*tabl[1][2])));

        System.out.println("drugi element z trzeciej kolumny to: "+tabl[2][1]);

        System.out.println("pierwszy element z drugiej kolumny to: "+tabl[1][0]);
    }
}
