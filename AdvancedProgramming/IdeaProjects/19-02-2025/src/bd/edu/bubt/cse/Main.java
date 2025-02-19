package bd.edu.bubt.cse;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner input = new Scanner(System.in);

        do{
            calculator.mainMenuGeneration();
            calculator.setOperand(input.nextLine().charAt(0));

            if(calculator.getOperand() == '+' ||
               calculator.getOperand() == '-' ||
               calculator.getOperand() == '*' ||
               calculator.getOperand() == '/'){
                System.out.println("Enter the first number: ");
                calculator.setOperator1(input.nextDouble());

                System.out.println("Enter the second number: ");
                calculator.setOperator2(input.nextDouble());
                calculator.showResult();
                input.nextLine();
            }
            else if(calculator.getOperand() == 'r'){
                calculator = new Calculator();
                System.out.println("Calculator memory is reseted...");
            }
            else if(calculator.getOperand() == 'q'){
                System.out.println("Calculator is quitting...");
                calculator = new Calculator();
                calculator.setOperand('q');
            } else if(calculator.getOperand() == 's'){
                ScientificCalculator sc = new ScientificCalculator();
                sc.mainMenuGeneration();
                sc.setOperand(input.nextLine().charAt(0));
               if(sc.getOperand()=='p')
               {
                   System.out.println("Enter the number: ");
                   calculator.setOperator1(input.nextDouble());

                   sc.showResult();
                   input.nextLine();
               }
            }
            else{
                System.out.println("Wrong input!");
                System.out.println("Please, try again...");
                calculator.mainMenuGeneration();
                calculator.setOperand(input.nextLine().charAt(0));
            }
        }while(calculator.getOperand() != 'q');

        input.close();
    }
}
