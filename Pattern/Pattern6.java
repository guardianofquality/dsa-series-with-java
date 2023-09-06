public class Pattern6{
   /*   The below program prints the following pattern on the console
        1
        23
        456
        78910 */
    public static void main(String[] args) {
        int n = 4;
        int row = 1;
        int count = 1;
        
        while (row <= n)
        {
            int column = 1;
            while(column <= row)
            {
                System.out.print(count);
                count = count + 1;
                column++;
            }
            System.out.print("\n");
            row++;
        }
    }
}