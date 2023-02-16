package String;

import java.util.*;

public class GenerateParenthesis {
    public List<String> generateParenthesis(int num) throws IllegalArgumentException {
        if (num < 0) {
            throw new IllegalArgumentException("Invalid input: n must be non-negative");
        }
        List<String> result = new ArrayList<>();
        generate(result, "", 0, 0, num);
        return result;
    }

    private void generate(List<String> result, String string, int openCount, int closeCount, int num) {
        if (string.length() == 2 * num) {
            result.add(string);
            return;
        }
        if (openCount < num) {
            generate(result, string + "(", openCount + 1, closeCount, num);
        }
        if (closeCount < openCount) {
            generate(result, string + ")", openCount, closeCount + 1, num);
        }
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the number of pairs of parentheses: ");
        int num = userInput.nextInt();
        userInput.close();
        GenerateParenthesis gp = new GenerateParenthesis();
        try {
            List<String> result = gp.generateParenthesis(num);
            System.out.println("Well-formed parentheses combinations for " + num + " pairs: ");
            for (String string : result) {
                System.out.println(string);
            }
        } catch (IllegalArgumentException err) {
            System.err.println(err.getMessage());
        }
    }
}
