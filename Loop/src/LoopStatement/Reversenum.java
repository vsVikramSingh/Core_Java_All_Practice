package LoopStatement;

import java.util.Scanner;

public class Reversenum {

    public void Rev()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();
        int rev=0;
        int rem;
        int num1=num;
        for(int i =1; i<=3; i++)
        {
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.println("Reverse number is : "+rev);

        if(num1==rev)
        {
            System.out.println(rev +" is palindrome number");
        }
        else
        {
            System.out.println(rev +" is not palindrome number");
        }
    }

    public static void main(String[] args) {
        Reversenum rn = new Reversenum();
        rn.Rev();
    }
}
