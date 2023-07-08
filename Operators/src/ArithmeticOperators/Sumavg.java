package ArithmeticOperators;

import java.util.Scanner;

public class Sumavg {

    public void SumAndAvg()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 3 subjects numbers = ");
        int sub1 = sc.nextInt();
        int sub2 = sc.nextInt();
        int sub3 = sc.nextInt();

        int sum = sub1+sub2+sub3;
        float avg = (sub1+sub2+sub3)/3;

        System.out.print("Sum of 3 subjects = "+sum +'\n');
        System.out.print("Avg of 3 subjects = "+avg);
    }
    public static void main(String[] args)
    {
        Sumavg obj = new Sumavg();
        obj.SumAndAvg();
    }
}
