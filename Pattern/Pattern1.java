public class Pattern1{
   /*   The below program prints the following pattern on the console
        12345678  
        12345678
        12345678
        12345678
        12345678
        12345678
        12345678
        12345678 */
    public static void main(String[] args) {
        int n = 8;
        int row = 1;

        while (row <= n)
        {
            int column = 1;
            while(column <= n)
            {
                System.out.print(column);
                column = column + 1;
            }
            System.out.println("");
            row = row + 1;
        }
    }
}