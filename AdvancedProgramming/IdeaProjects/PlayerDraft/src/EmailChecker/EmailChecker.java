package EmailChecker;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class EmailChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your email address:");
        String email = scanner.nextLine().trim();

        try {
            checkEmailDomain(email);
        } catch (InvalidEmailException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static void checkEmailDomain(String email) throws InvalidEmailException {
        // Basic email format validation
        if (!isValidEmail(email)) {
            throw new InvalidEmailException("Invalid email format");
        }

        // Extract domain
        String domain = extractDomain(email).toLowerCase();

        // Check domain types
        if (domain.endsWith(".edu.bd")) {
            System.out.println("This is an educational (.edu) email address");
        } else if (domain.contains("gmail.com")) {
            System.out.println("This is a Google (Gmail) email address");
        } else if (domain.contains("yahoo.com")) {
            System.out.println("This is a Yahoo email address");
        } else if (domain.contains("hotmail.com") || domain.contains("outlook.com")) {
            System.out.println("This is a Microsoft (Hotmail/Outlook) email address");
        } else {
            System.out.println("This is another type of email address. Domain: " + domain);
        }
    }

    private static boolean isValidEmail(String email) {
        // Simple regex for basic email validation
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    private static String extractDomain(String email) throws InvalidEmailException {
        int atIndex = email.indexOf('@');
        if (atIndex == -1 || atIndex == email.length() - 1) {
            throw new InvalidEmailException("Invalid email - no domain found");
        }
        return email.substring(atIndex + 1);
    }
}
