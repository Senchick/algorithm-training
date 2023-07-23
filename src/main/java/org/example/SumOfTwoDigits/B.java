package org.example.SumOfTwoDigits;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class B {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            var map = new HashMap<Integer, Integer>();

            var k1 = reader.readLine().transform(Integer::parseInt);
            var expr1 = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            var k2 = reader.readLine().transform(Integer::parseInt);
            var expr2 = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();


            for (Integer i = 0; i <= k1; i++) {
                map.put(i, expr1[k1-i]);
            }

            for (Integer i = 0; i <= k2; i++) {
                final int finalI = k2 - i;

                if (map.containsKey(i)) {
                    map.put(i, map.get(i) + expr2[finalI]);
                } else {
                    map.put(i, expr2[finalI]);
                }
            }

            var max = Math.max(k1, k2);
            System.out.println(max);

            for (int i = max; i > -1; i--) {
                System.out.print(map.get(i) + " ");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}