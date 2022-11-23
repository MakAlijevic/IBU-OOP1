package ibu.edu;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] values = {1,5,8,12,2};
        System.out.println(Arrays.toString(values));

        Swap(values, 0,3);

        System.out.println(Arrays.toString(values));
    }
    public static void Swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
