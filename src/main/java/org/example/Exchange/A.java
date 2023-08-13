package org.example.Exchange;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int money = scanner.nextInt();
        List<List<Integer>> solutions = new ArrayList<>();
        for (int i = 0; i <= money; i++) {
            for (int j = 0; j <= money / 5; j++) {
                for (int k = 0; k <= money / 10; k++) {
                    if (i + 5 * j + 10 * k == money) {
                        List<Integer> solution = new ArrayList<>();
                        solution.add(i);
                        solution.add(j);
                        solution.add(k);
                        solutions.add(solution);
                    }
                }
            }
        }

        System.out.println(solutions.size());
        for (List<Integer> solution : solutions) {
            var s = new StringBuilder();
            var count = 0;
            if (solution.get(0) > 0) {
                count += solution.get(0);
                s.append("1 ".repeat(solution.get(0)));
            }
            if (solution.get(1) > 0) {
                count += solution.get(1);
                s.append("5 ".repeat(solution.get(1)));
            }
            if (solution.get(2) > 0) {
                count += solution.get(2);
                s.append("10 ".repeat(solution.get(2)));
            }

            System.out.println(count + " " + s.toString().trim());
        }
    }
}