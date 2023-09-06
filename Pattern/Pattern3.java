public class Pattern3 {
    /*   The below program prints the following pattern on the console
        1 2 3 4 5 
        6 7 8 9 10 
        11 12 13 14 15 
        16 17 18 19 20 
        21 22 23 24 25 */
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int count = 1;
    
        while (row <= n)
        {
            int column = 1;
            while(column <= n)
            {
                System.out.print(count+" ");
                count++;
                column++;
            }
            System.out.println("");
            row++;
        }
    }
}
