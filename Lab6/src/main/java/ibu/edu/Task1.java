package ibu.edu;

public class Task1 {
    public static void main(String[] args) {

            int[] values = {6,5,1,8,11};
            System.out.println(smallest(values));

        }
        public static int smallest(int[] array){
            int smallest = array[0];

            for(int i = 1; i < array.length; i++){
                if(array[i] < smallest){
                    smallest = array[i];
                }
            }

            return smallest;
        }
    }
