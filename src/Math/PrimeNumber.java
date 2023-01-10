package Math;

import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args){
        try (Scanner userInput = new Scanner(System.in)) {
            System.out.print("ENTER A NUMBER :");
            int inputInteger = userInput.nextInt();
            checkPrime(inputInteger);
        }
    }

    static void checkPrime(int num){
        int flag=0;
        int halfOfNum= (num/2);
        if(num==0 || num==1){
            System.out.println(num+" is not a prime number");
        }else{
            for(int count=2;count<=halfOfNum;count++){
                if(num%count==0){
                    System.out.println(num+" is not a prime number");
                    flag = 1;
                    break;
                }
            }
            if(flag==0){
                System.out.println(num+" is a prime number");
            }
        }
    }
}
