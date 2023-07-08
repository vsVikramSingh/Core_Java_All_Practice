package ArithmeticOperators;

import java.util.Scanner;

public class Swap {

    public int SwapNum()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();

        System.out.print("Value of a and b before swap is = "+"a = "+a +" and b = "+b +'\n');
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.print("After swap the value is : " +"a = "+a +" and b = " +b +'\n');

        return 0;

    }
    public static  void main(String[] args)
    {
        Swap obj = new Swap();
        obj.SwapNum();
    }
}
