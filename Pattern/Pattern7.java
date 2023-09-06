public class Pattern7{
   /*   The below program prints the following pattern on the console
        1
        23
        345
        4567
        56789
        67891011 */
    public static void main(String[] args) {
        int n = 6;
        int row = 1;
        
        while (row <= n)
        {
            int column = 1; int value = row;
            while(column <= row)
            {
                System.out.print(value);
                value = value + 1;
                column++;
            }
            System.out.print("\n");
            row++;
        }
    }
}