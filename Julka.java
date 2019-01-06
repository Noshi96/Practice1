package spoj; //https://www.spoj.com/problems/JULKA/

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created on 2019-01-05.
 */
public class Julka {
    public static void main(String[] args){

        Scanner wczytaj = new Scanner(System.in);

        int jablka, roznica;
        //System.out.println("Ile jest jabłek");
        jablka = wczytaj.nextInt();
        //System.out.println("O ile więcej jabłek posiada Klaudia");
        roznica = wczytaj.nextInt();
        wynik(jablka, roznica);

        // 2.
        BigInteger a, b, temp;

        a = wczytaj.nextBigInteger();
        b = wczytaj.nextBigInteger();
        temp = a.divide(new BigInteger("2")).subtract(b.divide(new BigInteger("2")));

        System.out.printf("%d\n%d\n", temp.add(b),temp );

        // 3.
        BigInteger[] wynik = dobryWynik();
        System.out.printf("%d\n%d\n", wynik[0], wynik[1]);

    }


    public static BigInteger[] dobryWynik(){

        Scanner wczytaj_2 = new Scanner(System.in);
        BigInteger temp, wszystkieJablka, roznica;

        wszystkieJablka = wczytaj_2.nextBigInteger();
        roznica = wczytaj_2.nextBigInteger();

        temp = wszystkieJablka.divide(new BigInteger("2")).subtract(roznica.divide(new BigInteger("2")));

        return new BigInteger[] {temp.add(roznica), temp};

    }

    public static void wynik(int wszystkieJablka, int roznica){
        double result_1, result_2;

        result_1 = (double)wszystkieJablka / 2 - (double) roznica / 2;
        result_2 = result_1 + roznica;

        //System.out.println("Było " + wszystkieJablka + " jabłek. Klaudia ma " + result_2 + " jabłek, a Natalia " + result_1 + " jabłek");
        System.out.println(result_2);
        System.out.println(result_1);
    }

}
