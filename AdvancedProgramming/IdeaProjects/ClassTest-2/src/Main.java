import java.util.*;
public class Main {
    public static void main(String[] args) {
        String input;
        Scanner scanner = new Scanner(System.in);
        input = scanner.next();
        String[] inputArray = input.split("");
        List<String> inputList = Arrays.asList(inputArray);
        Map<Character, Integer> map = new HashMap<>();

        for (String s : inputList) {
            char c = s.charAt(0);
            if (!Character.isLetterOrDigit(c)) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }

        for (Character s : map.keySet()) {
            System.out.println("Key: " + s + " Value: " + map.get(s));
        }



    }
}