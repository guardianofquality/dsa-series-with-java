public class Pattern12{
   /*   The below program prints the following pattern on the console
        A
        BC
        DEF
        GHIJ
        KLMNO 
    */
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        char a = 'A';
        while (row <= n)
        {
            int column = 1;
            while(column <= row)
            {
                System.out.print(a);
                a++;
                column++;
            }
            System.out.print("\n");
            row++;
        }
    }
}