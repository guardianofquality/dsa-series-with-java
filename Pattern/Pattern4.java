public class Pattern4{
   /*   The below program prints the following pattern on the console
        *
        **
        ***
        ****
        *****
        ******
        *******
        ******** */
    public static void main(String[] args) {
        int n = 8;
        int row = 1;

        while (row <= n)
        {
            int column = 1;
            while(column <= row)
            {
                System.out.print("*");
                column++;
            }
            System.out.print("\n");
            row++;
        }
    }
}