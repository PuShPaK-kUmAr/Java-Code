package Math;
import java.util.Arrays;
import java.util.Scanner;

public class VariableArgumentSum {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the number of Integer to be added : ");
        int count = userInput.nextInt();
        int[] number = new int[count];
        for(int i=0;i<count;i++){.  // Why you are using i, j , whynot youare following the naming convention.
            System.out.println("Enter number "+i+1+" :");
            number[i]= userInput.nextInt();
        }
        int result = sum(number);
        System.out.print("The sum of all the elements of "+ Arrays.toString(number)+" is : "+result);
    }
    public static int sum(int... numbers) {
        int result = 0;
        for (int number : numbers) {
            result += number;
        }
        return result;
    }

}
