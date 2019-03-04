
//Neofytos Neokleous
//C1615033

import java.util.*;
public class magicSquare {

    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter an odd number: ");
        int n;
        n = s1.nextInt();
//        System.out.println("The entered integer is" + n);
//        int n = 3;
        for (int[] row : magicSquareOdd(n)) {
            for (int x : row)
                System.out.format("%2s ", x);
            System.out.println();
        }

//        System.out.printf("\nMagic constant: %d ", (n * n + 1) * n / 2);
    }

    public static int[][] magicSquareOdd(final int n) {
        if (n % 2 == 0 || n < 3)
            throw new IllegalArgumentException("Number must be ood and > 2");

        int[][] grid = new int[n][n];
        int r = 0, number = 0;
        int size = n * n;

        int c = n / 2;
        while (number++ < size) {
            grid[r][c] = number;
            if (r == 0) {
                if (c == n - 1) {
                    r++;
                } else {
                    r = n - 1;
                    c++;
                }
            } else {
                if (c == n - 1) {
                    r--;
                    c = 0;
                } else {
                    if (grid[r - 1][c + 1] == 0) {
                        r--;
                        c++;
                    } else {
                        r++;
                    }
                }
            }
        }



        return grid;



    }



}