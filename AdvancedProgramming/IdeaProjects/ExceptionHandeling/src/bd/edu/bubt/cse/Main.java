package bd.edu.bubt.cse;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       int a;
       Scanner input = new Scanner(System.in);
       Random ran = new Random();
       for (int i =0 ; i<100; i++){
           System.out.print("Loop : "+ i);
           int sign = ran.nextInt(3);
           System.out.println();
           try{
               int r = ran.nextInt(10);
               if(sign==0)
               {
                   r *=-1;
               }
               else if(sign==1)
               {
                   r = Integer.parseInt("hello");
               }
               System.out.println("Random Number: "+ r);

               if(r<0)
               {
                   throw new NegativeNumberException();
               }
               else if(r==0)
               {
                   throw new ZeroNumberException();
               }
           }
           catch (NegativeNumberException e){
               System.out.println(e.getMessage());
           }
           catch (ZeroNumberException eZero) {
               System.out.println(eZero.getMessage());
           }
           catch (NumberFormatException n)
           {
               System.out.println(n.getMessage());
           }
       }


    }
}
