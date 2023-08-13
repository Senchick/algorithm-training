package org.example.MaximalProduct;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class D {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int size = reader.readLine().transform(Integer::parseInt);
            var array = Arrays.stream(reader.readLine().split(" ")).mapToLong(Long::parseLong).toArray();

            System.out.println(findMaxProduct(array));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static long findMaxProduct(long[] nums) {
        int n = nums.length;

        if (n < 4) {
            throw new IllegalArgumentException("Array should contain at least 4 numbers.");
        }

        long maxProduct = Long.MIN_VALUE;

        // Sort the array in ascending order
        Arrays.sort(nums);

        // Case 1: Product of the four largest positive numbers
        long product1 = nums[n - 1] * nums[n - 2] * nums[n - 3] * nums[n - 4];
        maxProduct = Math.max(maxProduct, product1);

        // Case 2: Product of the two smallest negative numbers and the two largest positive numbers
        long product2 = nums[0] * nums[1] * nums[n - 1] * nums[n - 2];
        maxProduct = Math.max(maxProduct, product2);

        return maxProduct;
    }
}
