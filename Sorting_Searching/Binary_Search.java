package Sorting_Searching;

public class Binary_Search {
    public static void main(String[] args) {
        int evenNum[] = {1,2,3,4,5,6};
        int oddNum[] = {1,2,3,4,5};
        System.out.println("Array Index of: "+binarySearch(evenNum,5)+" has Search value");
    }

    public static int binarySearch(int search[], int keyEle){
        int startOfArray = 0;
        int endOfArray = search.length - 1;
        int mid = startOfArray + (endOfArray-startOfArray/2);

        while (startOfArray <= endOfArray) {
            mid = startOfArray + (endOfArray-startOfArray/2);
            if (search[mid] == keyEle) {
                return mid;
            }

            // traverse towards right part
            if (keyEle > search[mid]) {
                startOfArray = mid + 1;
            }
            else
            {
                // traverse towards left part
                endOfArray = mid - 1;
            }
        }
        return -1;
    }
}
