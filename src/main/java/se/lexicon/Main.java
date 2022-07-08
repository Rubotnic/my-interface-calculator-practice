package se.lexicon;

public class Main {
    public static void main(String[] args) {

        BasicCalculator calculator = new BasicCalculator();

//        System.out.println(calculator.modulus(1.5,2.5));
//        System.out.println(calculator.calculate(1,2, "%"));

        boolean running = true;

        while (running) {
        System.out.println("Please enter a number: ");
        double numb1 = Calculator.getDoubleFromUser();
        System.out.println("Please enter a number: ");
        double numb2 = Calculator.getDoubleFromUser();
        System.out.println("Please enter a operator (+ , - , * , / , %): ");
        String operator = Calculator.getStringfromUser();

        double result = calculator.calculate(numb1,numb2,operator);
        System.out.println(numb1 + " " + operator + " " + numb2 + " = " + result);

            System.out.println("Do you want to make a calulation again? (y/n) ");
            String choice = Calculator.getStringfromUser();
            if(choice.equalsIgnoreCase("n")){
                running = false;
            }
        }
    }
}