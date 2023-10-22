import java.util.Scanner;// import scanner class

public class Average { // declare average class

    static void average() { // declare average method

        int amount = 0; // declares amount variable to know how many numbers want to be averaged
        double number = 0;// intitialises number variable that temporarly stores a number
        double add = 0; // initialise variable that adds all numbers together

        System.out.println("How many numbers would you like to average");// prints
        Scanner scanner = new Scanner(System.in);// scanner
        amount = scanner.nextInt();// amount = result of scanner

        for (int i = 0; i < amount; i++) { // forver loop that prompts for number the amount of times the user specified
            System.out.print("enter nubmer" + (i + 1) + ": "); // prints a line prompting for a number and says which
                                                               // number it is by looking what number loop this is
            Scanner scannera = new Scanner(System.in);// scanner
            number = scannera.nextDouble();// adds the result of scanner to number
            add += number;// adds the number from number to add to later devide by 5
        }

        double average = add / amount; // takes the numbers and devides it by 5
        System.out.println("the average is:" + average); // prints what everage of numbers is

    }
}