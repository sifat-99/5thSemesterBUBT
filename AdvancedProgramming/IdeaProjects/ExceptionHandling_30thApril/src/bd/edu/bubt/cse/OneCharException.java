package bd.edu.bubt.cse;

public class OneCharException extends Exception{
    OneCharException(){
        super("Password must contain at least 1 character..!");
    }
}
