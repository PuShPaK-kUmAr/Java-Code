package String;

import java.util.Stack;
import java.util.Scanner;

class ParenthesisValidation {
    public static boolean isValid(String input) {
        Stack<Character> stack = new Stack<>();
        for (char bracket : input.toCharArray()) {
            if (bracket == '(' || bracket == '{' || bracket == '[') {
                stack.push(bracket);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char topBracket = stack.pop();
                if (bracket == ')' && topBracket != '(') {
                    return false;
                }
                if (bracket == '}' && topBracket != '{') {
                    return false;
                }
                if (bracket == ']' && topBracket != '[') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        try {
            System.out.print("Enter the string of parenthesis: ");
            String input = userInput.nextLine();
            boolean result = isValid(input);
            if (result) {
                System.out.println("The string of parenthesis is valid.");
            } else {
                System.out.println("The string of parenthesis is not valid.");
            }
        } catch (Exception error) {
            System.out.println("An error occurred: " + error.getMessage());
        } finally {
            userInput.close();
        }
    }
}
