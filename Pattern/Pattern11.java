public class Pattern11{
   /*   The below program prints the following pattern on the console
        A
        BB
        CCC
        DDDD 
    */
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        
        while (row <= n)
        {
            int column = 1;
            while(column <= row)
            {
                char a = (char) ('A' + row - 1);
                System.out.print(a);
                column++;
            }
            System.out.print("\n");
            row++;
        }
    }
}