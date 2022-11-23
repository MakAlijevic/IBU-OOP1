package ibu.edu;

public class Task2 {
    public static void main(String[] args) {
        int[] values = {6,5,8,1,11};
        System.out.println(indexOfSmallest(values));

    }
    public static int indexOfSmallest(int[] array){
        int smallest = array[0];
        int indexOfSmallest = 0;

        for(int i = 1; i < array.length; i++){
            if(array[i] < smallest){
                smallest = array[i];
                indexOfSmallest = i;
            }
        }

        return indexOfSmallest;
    }
}
