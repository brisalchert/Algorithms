//**********************************************************************
//  Pascal.java
//
//  Asks the user for integer input n and then generates the nth row
//  of Pascal's triangle.
//**********************************************************************

import java.util.Scanner;

public class Pascal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int[] nthRow;

        System.out.println();
        System.out.print("\tEnter row number n: ");
        n = input.nextInt();

        while (n < 1) {
            System.out.println("\tError: input must be positive.");

            System.out.print("\tEnter row number n: ");
            n = input.nextInt();
        }

            nthRow = PascalTriangle.generateRow(n);

        System.out.println();
        System.out.print("\tRow " + n + " of Pascal's Triangle: ");

        for (int index = 0; index < nthRow.length; index++) {
            if (index < (nthRow.length - 1)) {
                System.out.print(nthRow[index] + ", ");
            }
            else {
                System.out.print(nthRow[index]);
            }
        }

        input.close();
    }
}
