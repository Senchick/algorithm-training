package org.example.MaximalProduct;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class C {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int size = reader.readLine().transform(Integer::parseInt);
            var array = Arrays.stream(reader.readLine().split(" ")).mapToLong(Long::parseLong).toArray();

            System.out.println(maxProduct(array));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static long maxProduct(long[] nums) {
        long min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        long max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;

        for (long n : nums) {
            if (n <= min1) {
                min2 = min1;
                min1 = n;
            } else if (n <= min2) {
                min2 = n;
            }

            if (n >= max1) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if (n >= max2) {
                max3 = max2;
                max2 = n;
            } else if (n >= max3) {
                max3 = n;
            }
        }

        return Math.max(min1 * min2 * max1, max1 * max2 * max3);
    }
}
