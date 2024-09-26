package com.example.project;
import java.net.SocketImpl;
import java.net.SocketPermission;
import java.util.Scanner; 

public class CalculatorRunner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //test your program here
        //1. create an instance of the calculator class
        Calculator calc = new Calculator("TI84");
        
        //2. call any methods of that class to test
        

        System.out.print("Please enter +, -, *, or / to begin operations: ");
        String operand = scan.nextLine();
        System.out.print("Enter your first integer: ");
        int num1 = scan.nextInt();
        System.out.print("Enter your second integer: ");
        int num2 = scan.nextInt();
        System.out.println(num1 + " " + operand + " " + num2 + " = " + (calc.performOperation(operand, num1, num2)));

        System.out.println("Let's check 2 numbers for divisibility.");
        System.out.print("Pick your first integer: ");
        int division1 = scan.nextInt();
        System.out.print("Pick your second integer: ");
        int division2 = scan.nextInt();
        System.err.println("Is " + division1 + " perfectly divisible by " + division2 + "?: " + calc.divisibleBy(division1, division2));

        System.out.print("Enter an x coordinate: ");
        int x = scan.nextInt();
        System.out.print("Enter a y coordinate: ");
        int y = scan.nextInt();
        System.out.println("The coordinate pair is: " + calc.coordinatePair(x, y));
        
        System.out.println("Enter 2 integers you would like to subtract, the absolute value will be returned to you.");
        System.out.print("Enter your first integer: ");
        int absVal1 = scan.nextInt();
        System.out.print("Enter your second integer: ");
        int absVal2 = scan.nextInt();
        System.out.println("The absolute value is: " + calc.absoluteValue(absVal1, absVal2));

    }
}
