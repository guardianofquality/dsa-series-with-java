public class Pattern10{
   /*   The below program prints the following pattern on the console
        ABC
        DEF
        GHI 
    */
    public static void main(String[] args) {
        int n = 3;
        int row = 1;
        char start = 'A';
        
        while (row <= n)
        {
            int column = 1;
            while(column <= n)
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