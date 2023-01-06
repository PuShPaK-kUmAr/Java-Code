package String;
import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter Sentence to reverse :");
        String sentence = userInput.nextLine();
        String[] words = sentence.split(" ");
        String reverse = reverseSentence(words,words.length-1);
        System.out.println("The reverse of the string is: " + reverse);
    }

    public static String reverseSentence(String[] s, int index){
        if (index < 0) {
            return "";
        }
        return s[index] + " " + reverseSentence(s, index - 1);
    }
}
