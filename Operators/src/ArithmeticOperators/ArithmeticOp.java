package ArithmeticOperators;

import java.util.Scanner;

public class ArithmeticOp {
    int c;
    public void Add()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter two number for Addition = ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        c=a+b;
        System.out.print("Value of "+a + "+" +b +" = "+c);
        System.out.println('\n');
    }
    public void Sub()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter two number for Subtraction = ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        c=a-b;
        System.out.print("Value of "+a + "-" +b +" = "+c);
        System.out.println('\n');
    }
    public void Mul()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter two number for Multiply = ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        c=a*b;
        System.out.print("Value of "+a + "*" +b +" = "+c);
        System.out.println('\n');
    }
    public void Div()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter two number for Division = ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        c=a/b;
        System.out.print("Value of "+a + "/" +b +" = "+c);
        System.out.println('\n');
    }
    public void Mod()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter two number for Mod = ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        c=a%b;
        System.out.print("Value of "+a + "%" +b +" = "+c);
        System.out.println('\n');
    }
    public static  void main(String[] args)
    {
        ArithmeticOp obj=new ArithmeticOp();

        obj.Add();
        obj.Sub();
        obj.Mul();
        obj.Div();
        obj.Mod();
    }
}