package Math;

import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {. // what sc means , what int a meeans??
            System.out.print("ENTER A NUMBER :");
            int a = sc.nextInt();
            checkPrime(a);
        }
    }

    static void checkPrime(int n){
        int i, half, flag=0;
        half= (n/2);
        if(n==0 || n==1){
            System.out.println(n+" is not a prime number");
        }else{
            for(i=2;i<=half;i++){
                if(n%i==0){
                    System.out.println(n+" is not a prime number");  // what in n means .?
                    flag = 1;
                    break;
                }
            }
            if(flag==0){
                System.out.println(n+" is a prime number");
            }
        }
    }
}
