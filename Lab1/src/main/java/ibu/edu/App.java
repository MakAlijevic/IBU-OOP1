package ibu.edu;

import java.util.Random;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        //System.out.println("Mak Alijević");

        //int seconds = 365 *  86400;
        //System.out.println("There is " + seconds + " seconds in a year");

        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Enter your first number");
        //int num1 = scanner.nextInt();
        //System.out.println("Enter your second number");
        //int num2 = scanner.nextInt();

        //if(num1 < num2){
            //System.out.println("Second number is bigger ");
        //}
        //else if(num2 < num1){
            //System.out.println("First number is bigger");
        //}
        //else{
            //System.out.println("Numbers are equal");
        //}
        //int sum = num1 + num2;
        //System.out.println("Sum of the two numbers is: " + sum);

        //System.out.println("Enter your number: ");
        //int num1 = scanner.nextInt();
        //if(num1 > 0){
            //System.out.println("Number is positive");
        //}
        //else{
            //System.out.println("Number is negative");
        //}

        //Scanner scanner = new Scanner(System.in);

        //int pow = scanner.nextInt();
        //int sum = 0;

        //for(int i = 0 ; i <= pow; i++){
            //sum = sum + (int)Math.pow(2, i);
        //}
        //System.out.println("The result is : " + sum);



        //System.out.println("Enter first number: ");
        //int first = scanner.nextInt();
        //System.out.println("Enter last number: ");
        //int last = scanner.nextInt();

        //while(first <= last){
            //System.out.println(first);
            //first++;
        //}
        //int sum = 0;
        //while (true){
            //int read = scanner.nextInt();
            //if(read == 0){
                //break;
            //}else{
                //sum = sum + read;
                //System.out.println("Sum now: " + sum);
            //}
        //}
        //System.out.println("Sum in the end is " + sum);

        //int sum = 0;
        //int read;

        //System.out.println("Enter your first number : ");
        //read = scanner.nextInt();
        //sum = sum + read;
        //System.out.println("Enter your second number : ");
        //read = scanner.nextInt();
        //System.out.println("Enter your third number : ");
        //read = scanner.nextInt();
        //sum = sum + read;

         //System.out.println("Sum : " + sum);


        //String password = "carrot";

        //while(true){
            //System.out.println("Enter your password: ");
            //String guess = scanner.nextLine();

            //if(guess.equals(password)){
                //System.out.println("Correct!");
                //System.out.println("Secret message is : password");
                //break;
            //}
            //else{
                //System.out.println("Wrong. Try again!");
            //}
        //}


        //Scanner scanner = new Scanner(System.in);
        //int counter = 0;

        //int randomInt = drawNumber();

        //while(true){
            //System.out.println("Guess the number: ");
            //int guess = scanner.nextInt();

            //if(guess < randomInt){
                //counter++;
                //System.out.println("Number is higher");
                //System.out.println("Guesses made : " + counter);
            //}
            //else if(guess > randomInt){
                //counter++;
                //System.out.println("Number is lesser");
                //System.out.println("Guesses made : " + counter);
            //}
            //else{
                //System.out.println("Good job.");
                //System.out.println("Guesses made : " + counter);
                //break;
            //}
        //}

        //printStars(5);
        //printStars(7);
        //printStars(2);
    //}
    //public static void printText(int times){
        //for(int i = 0; i < times; i++) {
            //System.out.println("In the beginning there were the swamp, the hoe and Java.");
        //}
    }
    public static int drawNumber(){
        Random rand = new Random();

        int randomInt = rand.nextInt(100);
        return randomInt;
    }
    //public static void printStars(int times){
        //for(int i = 0; i < times; i++){
            //System.out.print("*");
        //}
        //System.out.println("");
    //}
}
