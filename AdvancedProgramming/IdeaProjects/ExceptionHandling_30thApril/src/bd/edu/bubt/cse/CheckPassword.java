package bd.edu.bubt.cse;

import java.util.*;

public class CheckPassword {
    Scanner input = new Scanner(System.in);

    public CheckPassword() {
        while (true) {
            System.out.print("Enter password: ");
            String pass = input.nextLine();

            List<String> errors;

            try {
                validatePassword(pass);
                System.out.println("Password accepted.");
                break;
            } catch (CompositePasswordException e) {
                errors = new ArrayList<>(e.getMessages());
            }

            if (!errors.isEmpty()) {
                System.out.println("Invalid password. Reasons:");
                for (String err : errors) {
                    System.out.println("- " + err);
                }
                System.out.println("Please try again.\n");
            }
        }
    }

    public void validatePassword(String pass) throws CompositePasswordException {
        List<String> errors = new ArrayList<>();

        if (pass.length() < 8) errors.add(new LengthException().getMessage());

        int hasUpper = 0, hasLower = 0, hasDigit = 0, hasSymbol = 0, hasSpace = 0, hasChar = 0;

        for (char ch : pass.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUpper++;
                hasChar++;
            } else if (Character.isLowerCase(ch)) {
                hasLower++;
                hasChar++;
            } else if (Character.isDigit(ch)) hasDigit++;
            else if (ch == ' ') hasSpace++;
            else hasSymbol++;
        }

        if (hasChar == 0) errors.add(new OneCharException().getMessage());
        if (hasLower == 0) errors.add(new LowerCaseException().getMessage());
        if (hasUpper == 0) errors.add(new UpperCaseException().getMessage());
        if (hasDigit == 0) errors.add(new NumberException().getMessage());
        if (hasSymbol == 0) errors.add(new SymbolException().getMessage());
        if (hasSpace > 0) errors.add(new BlankSpaceException().getMessage());

        if (!errors.isEmpty()) {
            throw new CompositePasswordException(errors);
        }
    }
}
