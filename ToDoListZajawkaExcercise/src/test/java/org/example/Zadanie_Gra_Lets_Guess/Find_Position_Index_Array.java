package org.example.Zadanie_Gra_Lets_Guess;

public class Find_Position_Index_Array {
    public static int findIndex(int[] array, int x) {
        // if array is null
        if (array == null)
        {
            return -1;
        }
        // find length of array
        int leng = array.length;
        int i = 0;
        //traverse in the array
        while (i < leng) {
            // if the i-th element is x then return the index
            if (array[i] == x) {
                return i;
            } else {
                i = i + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] my_array = {5, 4, 6, 1, 3, 2, 7, 8, 9};
        // find the index of 5
        System.out.println("Index position of 5 is: " + findIndex(my_array, 5));
        // find the index of 7
        System.out.println("Index position of 7 is: " + findIndex(my_array, 7));
    }
}
