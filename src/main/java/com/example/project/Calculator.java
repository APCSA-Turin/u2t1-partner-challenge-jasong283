package com.example.project;

public class Calculator{
    public String calcModel;
    
    //constructor that creates an instance of the calculator class

    public Calculator (String newCalcModel) {
        //implement code here
        calcModel = newCalcModel;
    }
    
    // method that performs the operation designated by operand (which
    // could be +, -, *, or /) and returns the result of that operation
    // performed between num1 and num2
    // NOTE: if operand is some String other than "+", "-", "*", or "/" then
    // this method should return 0
    // REMINDER: use .equals to test if one string is equal to another (not ==)
    // (THIS METHOD DOES NOT PRINT)
    public double performOperation(String operand, int num1, int num2) {
        //implement code here
        if (operand.equals("+")) {
            return (num1 + num2); 
        }   else if (operand.equals("-")) {
            return (num1 - num2);
        }   else if (operand.equals("*")) {
            return (num1 * num2);
        }   else if (operand.equals("/")) {
            return ((double) num1 / num2);
        }   else
        return 0;
        }

    // method that checks if num1 is evenly divisible by num2, and if so,
    // returns true, and if not, returns false
    // (THIS METHOD DOES NOT PRINT)
    public boolean divisibleBy(int num1, int num2) {
        //implement code here
        if (num1 % num2 < 0) {
            return false;
        }   else if (num1 % num2 > 0) {
            return false;
        }   else
            return true;
        }

    // method that constructs and returns a string representing a coordinate
    // pair in the format: "(x, y)"
    // (THIS METHOD DOES NOT PRINT)
    public String coordinatePair(int x, int y) {
        //implement code here
        return ("(" + x + "," + y + ")");
    }
    // method that determines and returns the result of |num1 - num2|
    // (THIS METHOD DOES NOT PRINT)
    public int absoluteValue(int num1, int num2) {
        //implement code here
        return Math.abs(num1 - num2); 
        //https://www.w3schools.com/java/ref_math_abs.asp
    }
    
    // method that constructs and returns a String in the format:
    // "This calculator is a model "+____+" where "+____+" should be filled in
    // with the value stored in the calcModel instance variable."
    // (THIS METHOD DOES NOT PRINT)
    public String info() {
        //implement code here
        return "This calculator is a model " + calcModel + " where "+ calcModel + " should be filled in with the value stored in the calcModel instance variable.";
    }
}