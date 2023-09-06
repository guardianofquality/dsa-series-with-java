public class Pattern9{
   /*   The below program prints the following pattern on the console
        AAAA
        BBBB
        CCCC
        DDDD 
    */
    public static void main(String[] args) {
        int n = 4;
        int row = 1;
        
        while (row <= n)
        {
            int column = 1;
            while(column <= n)
            {
                char value = (char) ('A' + row - 1);
                System.out.print(value);
                column++;
            }
            System.out.print("\n");
            row++;
        }
    }
}