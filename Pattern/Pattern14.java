public class Pattern14{
   /*   The below program prints the following pattern on the console
        D
        CD
        BCD
        ABCD
    */
    public static void main(String[] args) {
        int n = 4;
        int row = 1;
        while (row <= n)
        {
            int column = 1;
            char start = (char)('A' + n - row);
            while(column <= row)
            {
                System.out.print(start);
                start++;
                column++;
            }
            System.out.print("\n");
            row++;
        }
    }
}