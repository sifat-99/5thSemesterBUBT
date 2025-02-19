package bd.edu.bubt.cse;

import java.util.Objects;

public class Calculator extends Main{
    private double number1;
    private double number2;
    private String op;

    Calculator(){

    }

    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }

    public double Result(){
        if (Objects.equals(op, "+"))
        {
            System.out.print("Summation Result: ");
            return this.number1+this.number2;
        }
        else if(Objects.equals(op, "-"))
        {
            System.out.print("Subtraction Result: ");
            return  this.number1-this.number2;
        }
        else if(Objects.equals(op,"/"))
        {
            System.out.print("Division Result: ");

            return  this.number1/this.number2;
        }
        else if(Objects.equals(op,"*")){
            System.out.print("Multiplication Result: ");
            return this.number1*this.number2;
        }

        else{
            System.out.println("Please enter the correct operator");
            return 0;
        }
    }
}
