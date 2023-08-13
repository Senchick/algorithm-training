package org.example.MaximalProduct;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class A {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            long size = reader.readLine().transform(Long::parseLong);
            long[] array = Arrays.stream(reader.readLine().split(" ")).mapToLong(Long::parseLong).toArray();

            int maxIndex1 = 0;
            long max1 = Long.MIN_VALUE;
            long max2 = Long.MIN_VALUE;


            for (int i = 0; i < size; i++) {
                if (array[i] >= max1) {
                    max2 = max1;

                    max1 = array[i];
                    maxIndex1 = i;
                } else if (array[i] > max2 && i != maxIndex1) {
                    max2 = array[i];
                }
            }

            System.out.println(max1 * max2);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}