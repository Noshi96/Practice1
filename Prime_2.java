package spoj;  //https://www.spoj.com/problems/PRIME1/

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by To moje on 2019-01-08.
 */
public class Prime_2 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int m = 0, n = 0, t = 0, counter = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();

        t = scanner.nextInt();
        for (int i = 0; i < t ; i++) {
            m = scanner.nextInt();
            n = scanner.nextInt();
            arrayList.add(m);
            arrayList.add(n);
        }

        if (n - m <= 100000) {
            for (int k = 0; k < t*2; k=k+2) {
                for (int i = arrayList.get(k); i <= arrayList.get(k+1); i++) {
                    counter = 0;
                    for (int j = i; j >= 1; j--) {
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
}
