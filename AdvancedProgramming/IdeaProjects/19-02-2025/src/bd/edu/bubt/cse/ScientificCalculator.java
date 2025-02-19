package bd.edu.bubt.cse;

public class ScientificCalculator extends Calculator {


    public double squareRoot() {
        return Math.sqrt(super.getOperator1());
    }

    @Override
    public void mainMenuGeneration() {
        super.mainMenuGeneration();
        System.out.println("'p' for Square Root");
    }

    @Override
    public void showResult() {
        if (this.getOperand() == 'p') {
            System.out.println("√" + this.getOperator1() + " = " + squareRoot());
        }  else {
            super.showResult();
        }
    }
}
