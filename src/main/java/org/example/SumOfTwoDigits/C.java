package org.example.SumOfTwoDigits;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class C {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            var k = reader.readLine().transform(Integer::parseInt);
            var str1 = reader.readLine().toCharArray();
            var str2 = reader.readLine().toCharArray();

            var s = new StringBuilder();

            for (Integer i = 0; i < k; i++) {
                s.append(str1[i]);
                s.append(str2[i]);
            }

            System.out.println(s);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
