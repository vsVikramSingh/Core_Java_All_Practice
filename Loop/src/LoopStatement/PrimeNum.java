package LoopStatement;
import java.util.Scanner;
public class PrimeNum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number :");
        int num=sc.nextInt();
        int i=1;
        int count = 0;

        while(num>=i)
        {
            if(num%i==0)
            {
                count++;
            }
            i++;
        }
        if(count == 2)
        {
            System.out.println("Prime number :");
        }
        else
        {
            System.out.println("Not prime number");
        }
    }
}
