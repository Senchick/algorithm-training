package org.example.SumOfTwoDigits;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var map = new HashMap<Integer, Integer>();

        for (int i = scanner.nextInt(); i >= 0; i--) {
            map.put(i, scanner.nextInt());
            System.out.println(i);
        }
    }
}