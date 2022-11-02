package ibu.edu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //ArrayList<String> list = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your word: ");
        String word = scanner.nextLine();

        if(palindrome(word)){
            System.out.println("It is palindrome.");
        }
        else{
            System.out.println("It is not palindrome.");
        }


        // list.add("Hello");
        // list.add("World");
        // list.add("!gdsgndslfkgnmodpsgm");

        // System.out.println(getLengths(list));

        //  while(true){
        //  System.out.println("Enter your word: ");
        // String word = scanner.nextLine();

        //  if(words.contains(word)){
        //  System.out.println("You entered " + word + " twice");

        //  Collections.sort(words);
        //  System.out.println(words);

        //   break;
        // }

        //  words.add(word);
        // }




        //  int index = first.indexOf(second);

        // if(index == -1){
        //  System.out.println("The word " + second + " does not exist");
        // }
        // else{
        //  System.out.println("The word " + second + " exists");
        //}

        // for(int i = username.length()-1; i >= 0; i--){
        //  System.out.print(username.charAt(i));
        //}

        // System.out.println("Number of characters in your name :" + username.length());

        // double answer = average(3,4,6,1);
        //  System.out.println("Answer is: " + answer);
    }

    public static boolean palindrome(String word){
        String reverse = "";

        for(int i = word.length()-1; i >= 0; i--){
            reverse = reverse + word.charAt(i);
        }
        return word.equals(reverse);
    }

    // public static ArrayList<Integer> getLengths(ArrayList<String> list){
    // ArrayList<Integer> lengths = new ArrayList<Integer>();

    //  for(String word : list){
    //     lengths.add(word.length());
    //  }
    //  return lengths;
    //}

    //  public static double average(int num1, int num2, int num3, int num4){
    //     double avg;
    //    avg = sum(num1, num2 , num3, num4) / 4;
    //    return avg;
    // }
    // public static double sum(int num1, int num2, int num3, int num4){
    //  double sum;
    //  sum = num1 + num2 + num3 + num4;
    // return sum;
    //}
}
