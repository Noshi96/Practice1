package spoj;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created on 2019-01-06.
 */
public class Prime_1 {
    public static void main(String[] args){

        Scanner wczytaj = new Scanner(System.in);
        int m, n, t;
        t = Integer.parseInt(wczytaj.next());

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            m = wczytaj.nextInt();
            n = wczytaj.nextInt();
            arrayList.add(m);
            arrayList.add(n);
        }

        for (int i = 0; i < t*2 ; i++) {
            isPrime(arrayList.get(i), arrayList.get(i + 1));
            i++;
        }
    }

    public static void isPrime(int m, int n) {
        if (n - m <= 100_000) {
            for (int i = m; i < n; i++) {
                int counter = 0;
                for (int j = i; j >= 1; j--) {    //for (int j = 1; j < n; j++){
                    if (i % j == 0) {
                        counter++;
                    }
                }
                if (counter == 2) {
                    System.out.println(i);
                }
            }
            System.out.println();
        }
    }
}


