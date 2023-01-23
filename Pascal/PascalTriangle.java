//**********************************************************************
//  PascalTriangle.java
//
//  Generates the nth row of Pascal's Triangle based on input n.
//**********************************************************************

public class PascalTriangle {
    //------------------------------------------------------------------
    //  Generates the nth row of Pascal's Triangle.
    //------------------------------------------------------------------
    public static int[] generateRow(int n) {
        int[] row = new int[n];

        for (int index = 0; index < n; index++) {
            row[index] = generateValue(n, index);
        }

        return row;

    }


    //------------------------------------------------------------------
    //  Generates the ith value of the nth row of Pascal's Triangle.
    //------------------------------------------------------------------
    private static int generateValue(int n, int i) {
        int rowValue;

        if (n < 3) {
            rowValue = 1;

            return rowValue;

        }

        if (i == 0 || i == (n - 1)) {
            rowValue = 1;

            return rowValue;

        }
        else {
            rowValue = (generateValue((n - 1), (i - 1))
                      + generateValue((n - 1), i));

            return rowValue;
        }
    }
}
