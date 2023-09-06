public class Pattern13{
   /*   The below program prints the following pattern on the console
        A
        BC
        CDE
        DEFG
        EFGHI
    */
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        while (row <= n)
        {
            int column = 1;
            while(column <= row)
            {
                char pattern = (char) ('A'+ row + column - 2);
                System.out.print(pattern);
                column++;
            }
            System.out.print("\n");
            row++;
        }
    }
}