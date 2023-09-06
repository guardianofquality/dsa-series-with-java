public class Pattern8{
   /*   The below program prints the following pattern on the console
        1
        21
        321
        4321 */
    public static void main(String[] args) {
        int n = 4;
        int row = 1;
        
        while (row <= n)
        {
            int column = 1;
            while(column <= row)
            {
                System.out.print(row - column + 1);
                column++;
            }
            System.out.print("\n");
            row++;
        }
    }
}