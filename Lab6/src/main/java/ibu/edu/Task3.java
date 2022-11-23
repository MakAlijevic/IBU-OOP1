package ibu.edu;

public class Task3 {
    public static void main(String[] args) {
        int[] values = {1,5,8,12,2};
        System.out.println(indexOfSmallest(values, 3));
    }
    public static int indexOfSmallest(int[] array, int index){
        int smallest = array[index];
        int indexOfSmallest = index;

        for(int i = index+1; i < array.length; i++){
            if(array[i] < smallest){
                smallest = array[i];
                indexOfSmallest = i - index;
            }
        }

        return indexOfSmallest;
    }
}
