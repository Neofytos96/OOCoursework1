//Neofytos Neokleous
//C1615033

import java.util.*;
public class magic2
{
public static void main (String[] args)
        {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an odd integer:");

        int n = input.nextInt();

        int[][] magic = new int[n][n];

        // Place 1 in the center of the first row ( row 0)
        int row = 1;
        int col = (n+1)/2;
        magic[row][col] = 1;

        for(int i=2; i <=n*n; i++)
        {
//         Move up and right to a new position
        col = col - 1;
        row = row - 1;
//         row is off the array
                        col = col;
            if (magic[row-1][col-1] == 0){
        row--;
        col--;
        }else row++;

        magic[row][col]=i;
        }

        for(int x = 0; x < n; x++)
        {
        for(int y=0; y < n; y++)
        System.out.print("|"+magic[x][y] +"|\t");
        System.out.println();
        }
        }}