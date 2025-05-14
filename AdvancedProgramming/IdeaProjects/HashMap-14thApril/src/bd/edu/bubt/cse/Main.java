package bd.edu.bubt.cse;


import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        String[] strLine = input.toLowerCase().split(" ");
        String upperCase = input.toUpperCase();
        String lowerCase = input.toLowerCase();
        String trim = input.trim();
        String subString = input.substring(0,2);
        char charAt = input.charAt(4);
        char[] toCharArray = input.toCharArray();
        String stripLeading = input.stripLeading();
        String stripTrailing = input.stripTrailing();
        int indexOf = input.indexOf("a");
        int length = input.length();
        int notEqualMinus = input.compareTo(input+"d");
        int notEqualPlus = input.compareTo(input.substring(0,input.length()-1));
        String concat = input.concat("CSE");



        System.out.println(indexOf);














//        List<String> listArray = Arrays.asList(strLine);
//        Map< String , Integer> checkMap = new HashMap<>();
//        for(String s: listArray){
//            if(checkMap.containsKey(s)){
//                checkMap.put(s, checkMap.get(s)+1);
//            }
//            else{
//                checkMap.put(s,1);
//            }
//        }
//
//        for (String s: checkMap.keySet()){
//            if(checkMap.get(s) ==1)
//            {
//                System.out.println("Key:" + s + " , "+ "Values: " + "Unique ");
//            }
//            else{
//                System.out.println("Key:" + s + " , "+ "Values: " + checkMap.get(s));
//            }
//        }

    }
}
