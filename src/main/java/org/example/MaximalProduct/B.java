package org.example.MaximalProduct;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int n = reader.readLine().transform(Integer::parseInt);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
