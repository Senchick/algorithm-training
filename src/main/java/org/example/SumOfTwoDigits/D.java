package org.example.SumOfTwoDigits;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class D {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            String[] sizeInput = reader.readLine().split(" ");
            int rows = Integer.parseInt(sizeInput[0]);
            int columns = Integer.parseInt(sizeInput[1]);

            int[][] matrix = new int[rows][columns];

            for (int i = 0; i < rows; i++) {
                String[] rowInput = reader.readLine().split(" ");
                for (int j = 0; j < columns; j++) {
                    matrix[i][j] = Integer.parseInt(rowInput[j]);
                }
            }

            for (int i = 0; i < rows; i++) {
                String[] rowInput = reader.readLine().split(" ");
                for (int j = 0; j < columns; j++) {
                    matrix[i][j] += Integer.parseInt(rowInput[j]);
                }
            }

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
