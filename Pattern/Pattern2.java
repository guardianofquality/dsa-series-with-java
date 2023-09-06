public class Pattern2 {
    /*   The below program prints the following pattern on the console
        87654321
        87654321
        87654321
        87654321
        87654321
        87654321
        87654321
        87654321 */
    public static void main(String[] args) {
        int n = 8;
        int row = 1;
    
        while (row <= n)
        {
            int column = 1;
            while(column <= n)
            {
                System.out.print(n - column + 1);
                column = column + 1;
            }
            System.out.println("");
            row = row + 1;
        }
    }
}
