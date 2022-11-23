package ibu.edu;

public class Task6 {
    public static void main(String[] args) {
        int[] values = {1,5,8,12,2};
        printElegantly(values);
    }
    public static void printElegantly(int[] array){
        for(int i = 0; i < array.length-1; i++){
            System.out.print(array[i] + ", ");
        }
        System.out.print(array[array.length-1]);
    }
}
