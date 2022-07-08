package se.lexicon;

import java.util.Scanner;

public interface Calculator {

    String PLUS = "+";
    String MINUS = "-";
    String MULTIPLY = "*";
    String DIVIDE = "/";
    String MODULS = "%";


    Scanner scan = new Scanner(System.in);
    static String getStringfromUser(){
        return  scan.nextLine();
    }


    static double getDoubleFromUser(){
        boolean invalid = true;
        double number = 0;
        while (invalid){
            try{
                number = Double.parseDouble(getStringfromUser().replaceAll(",",".").trim());
                invalid = false;
            }catch (NumberFormatException ex){
                System.out.println("No valid number");
            }
        }
        return number;
    }


    double addition(double num1, double num2);
    double subtraction(double num1, double num2);
    double multiplication(double num1, double num2);
    double division(double num1, double num2);
    double modulus(double num1, double num2);


    default double calculate(double num1, double num2, String operator){

        double result = 0;

        switch (operator){
            case PLUS:
                result = addition(num1,num2);
                break;
            case MINUS:
                result = subtraction(num1,num2);
                break;
            case MULTIPLY:
                result = multiplication(num1, num2);
                break;
            case DIVIDE:
                result = division(num1, num2);
                break;
            case MODULS:
                result = modulus(num1,num2);
                break;
            default:
                throw new IllegalArgumentException("Invalid op: " + operator);
        }
        return result;
    }
}
