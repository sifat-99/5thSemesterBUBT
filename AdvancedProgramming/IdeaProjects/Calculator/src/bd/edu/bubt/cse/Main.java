package bd.edu.bubt.cse;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    while(true){
            Calculator sum = new Calculator();
            Scanner input = new Scanner(System.in);

            System.out.println("Enter the Numbers");
            System.out.print("Number 1: ");
            sum.setNumber1(input.nextDouble());
            System.out.print("Number 2: ");
            sum.setNumber2(input.nextDouble());
            System.out.println("Enter the operator (+,-,*,/): ");
            sum.setOp(input.next());

            System.out.println(sum.getNumber1() + " " + sum.getOp() + " " + sum.getNumber2() + " = " + sum.Result());
            System.out.println();
        }
    }
}
