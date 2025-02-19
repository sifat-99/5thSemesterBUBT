package bd.edu.bubt.cse;

public class Calculator {
    protected double operator1;
    protected double operator2;
    protected char operand;

    public Calculator() {
        
    }

    public Calculator(double operator1, double operator2) {
        this.operator1 = operator1;
        this.operator2 = operator2;
    }

    public Calculator(double operator1, double operator2, char operand) {
        this.operator1 = operator1;
        this.operator2 = operator2;
        this.operand = operand;
    }

    public double getOperator1() {
        return this.operator1;
    }

    public void setOperator1(double operator1) {
        this.operator1 = operator1;
    }

    public double getOperator2() {
        return this.operator2;
    }

    public void setOperator2(double operator2) {
        this.operator2 = operator2;
    }

    public char getOperand() {
        return operand;
    }

    public void setOperand(char operand) {
        this.operand = operand;
    }

    public double addition(){
        return this.operator1 + this.operator2;
    }
    
    public double substitution(){
        return this.operator1 - this.operator2;
    }
    
    public double multiplication(){
        return this.operator1 * this.operator2;
    }
    
    public double division(){
        return this.operator1 / this.operator2;
    }
    
    public void mainMenuGeneration(){
        System.out.println("Press:");
        System.out.println("'+' for Addition");
        System.out.println("'-' for Substitution");
        System.out.println("'*' for Multiplication");
        System.out.println("'/' for Division");
        System.out.println("'r' for Reset");
        System.out.println("'q' for Quit");
        System.out.println("'s' for Scientific Calculator");
    }

    public void showResult(){
        System.out.print(this.operator1 + " " + this.operand + " " + this.operator2 + " = ");

        if(this.operand == '+'){
            System.out.println(addition());
        }
        else if(this.operand == '-'){
            System.out.println(substitution());
        }
        else if(this.operand == '*'){
            System.out.println(multiplication());
        }
        else if(this.operand == '/'){
            if(this.operator2 == 0){
                System.out.println("Infinity...");
            }
            else {
                System.out.println(division());
            }
        }
    }
}
