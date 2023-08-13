package org.example.Exchange;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class B {
    // 1, 5, 10, 20, 50
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int m = reader.readLine().transform(Integer::parseInt);

            int[] coins = {50, 20, 10, 5, 1};
            Map<Integer, Integer> map = new HashMap<>();

            for (int coin : coins) {
                map.put(coin, 0);
            }

            int result = 0;
            int remaining = m;

            for (int coin : coins) {
                int r = remaining / coin;
                map.put(coin, map.get(coin) + r);
                result += r;
                remaining = remaining % coin;
            }

            System.out.println(result);
            var s = new StringBuilder();

            for (int coin : coins) {
                int count = map.get(coin);
                if (count > 0) {
                    s.append((coin + " ").repeat(count));
                }
            }
            System.out.print(s.toString().trim());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}