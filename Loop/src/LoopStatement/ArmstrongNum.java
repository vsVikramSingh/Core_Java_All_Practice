package LoopStatement;

import java.security.PublicKey;
import java.util.Scanner;

public class ArmstrongNum {

    public void armstrongOrNot()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 4 digit number : ");
        int num= sc.nextInt();
        int arms=num;
        int rem,powersum=0;
        while(num!=0)
        {
            rem=num%10;
            powersum=powersum+(rem*rem*rem*rem);
            num/=10 ;
        }
        System.out.println("Armstrong number is = " +powersum);

        if(powersum==arms)
        {
            System.out.println(arms +" is Armstrong number");
        }
        else
        {
            System.out.println(arms +" is not Armstrong number");
        }

    }

    public static void main(String[] args) {
        ArmstrongNum ar = new ArmstrongNum();
        ar.armstrongOrNot();
    }
}
