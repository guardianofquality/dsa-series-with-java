public class Pattern5{
   /*   The below program prints the following pattern on the console
        1
        22
        333
        4444
        55555
        666666
        7777777
        88888888 */
    public static void main(String[] args) {
        int n = 8;
        int row = 1;

        while (row <= n)
        {
            int column = 1;
            while(column <= row)
            {
                System.out.print(row);
                column++;
            }
            System.out.print("\n");
            row++;
        }
    }
}