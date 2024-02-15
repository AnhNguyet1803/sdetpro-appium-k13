package labjava;

import java.util.Scanner;

public class lab6 {
    public static void main(String[] args) {
        //6.1 : Calculate how many minutes in total
        String inputString = "2hrs and 5 minutes";
        int totalMinutes = calculateTotalMinutes(inputString);
        System.out.println("Total minutes: " + totalMinutes);

        //6.2 : Allow user to input maximum 3 times
        String password = "password123";
        int maxAttempts = 3;
        boolean hasAccess = validatePassword(password, maxAttempts);

        if(hasAccess){
            System.out.println("Access granted");
        } else {
            System.out.println("You've exceeded the maximum number of attempts. Access denied.");
        }

        //6.3 : NOT using REGEX, extract digit character from that String
        String myStr = "12345nabc678";
        String digits = extractDigits(myStr);
        System.out.println("Extracted digit: "+digits);

        //6.4 : Check http OR https; domain name, .com OR .net
        String url = "https://google.com";
        String protocol = getProtocol(url);
        System.out.println("Protocol: " + protocol);
        String domain = getDomain(url);
        System.out.println("Domain: " + domain);
        String extension = getExtension(url);
        System.out.println("Extension: " + extension);
    }

    //6.1
    public static int calculateTotalMinutes(String input) {
        int totalMinutes = 0;
        String[] parts = input.split("\\s+");
        for (int i = 0; i < parts.length; i++) {
            if (parts[i].contains("hrs")) {
                int hours = Integer.parseInt(parts[i].replace("hrs", ""));
                totalMinutes += hours * 60;
            } else if (parts[i].equals("minutes")) {
                int minutes = Integer.parseInt(parts[i - 1]);
                totalMinutes += minutes;
            }
        }

        return totalMinutes;
    }

    //6.2
    public static boolean validatePassword(String correctPassword, int maxAttempts){
        int attempts = 0;
        Scanner scanner = new Scanner(System.in);
        while (attempts < maxAttempts){
            System.out.print("Enter password: ");
            String userInput = scanner.nextLine();

            if(userInput.equals(correctPassword)){
                scanner.close();
                return true;
            } else {
                attempts++;
                System.out.println("Incorrect passwd. Attempts left: "+ (maxAttempts-attempts));
            }
        }
        scanner.close();
        return false;
    }

    //6.3
    public static String extractDigits(String input){
        StringBuilder result = new StringBuilder();

        for (char ch : input.toCharArray()){
            if(Character.isDigit(ch)){
                result.append(ch);
            }
        }
        return result.toString();
    }

    //6.4
    public static String getProtocol(String url){
        if(url.startsWith("http://")){
            return "http";
        } else if (url.startsWith("https://")) {
            return "https";
        }
        return "Unknow";
    }
    public static String getDomain(String url){
        String[] parts = url.split("/");
        String domain = parts[2];
        return domain;
    }
    public static String getExtension(String url){
        String[] parts = url.split("\\.");
        String extension = parts[parts.length - 1];
        return extension;
    }



}
