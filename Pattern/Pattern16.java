public class Pattern16{
   /*   The below program prints the following pattern on the console
        ****
        ***
        **
        *
    */
    public static void main(String[] args) {
        int n = 4;
        int row = 1;
        while (row <= n)
        {
            int space = n - row + 1;
            while(space > 0)
            {
                System.out.print("*");
                space = space - 1;
            }
            
            int column = 1;
            while(column <= row)
            {
                System.out.print("");
                column++;
            }

            System.out.print("\n");
            row++;
        }
    }
}