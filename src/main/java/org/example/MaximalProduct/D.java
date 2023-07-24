package org.example.MaximalProduct;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class D {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int size = reader.readLine().transform(Integer::parseInt);
            var array = Arrays.stream(reader.readLine().split(" ")).mapToLong(Long::parseLong);

            var a = array.sorted().toArray();

            long sum = 1;

            for (int l = size - 4; l < size; l++) {
                sum *= Math.abs(a[l]);
            }

            System.out.println(sum);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}