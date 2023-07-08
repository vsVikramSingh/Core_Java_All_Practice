package LoopStatement;

import java.util.Scanner;

public class DoWhileCalc {


    Scanner sc = new Scanner(System.in);

    public void Add(int a, int b) {
        a = sc.nextInt();
        b = sc.nextInt();
        int res = a + b;
        System.out.println("Add = " + res);
    }

    public void Sub() {
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b) {
            int res = a - b;
            System.out.println("Sub = " + res);
        } else {
            System.out.print(" Please enter correct number a > b ");
        }
    }

    public void Mul() {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res = a * b;
        System.out.println("Mul = " + res);
    }

    public void Div() {
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b) {
            int res = (a / b);
            System.out.println("Div = " + res);
        } else {
            System.out.print(" Please enter correct number a > b ");
        }
    }

    public void Mod() {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res = a % b;
        System.out.println("Mod = " + res);
    }

    public void Calc() {
        DoWhileCalc cst = new DoWhileCalc();
        System.out.println("Enter \n 1 for Add. \n 2 for Sub. \n 3 for Mul. \n " + "4 for Div. \n 5 for Mod. \n \n");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        int x = 0, y = 0;

        switch (choice) {
            case 1:
                System.out.println("Enter two number for Add :");
                cst.Add(x, y);
                break;
            case 2:
                System.out.println("Enter two number for Sub :");
                cst.Sub();
                break;
            case 3:
                System.out.println("Enter two number for Mul :");
                cst.Mul();
                break;
            case 4:
                System.out.println("Enter two number for Div :");
                cst.Div();
                break;
            case 5:
                System.out.println("Enter two number for Mod :");
                cst.Mod();
                break;
            default:
                System.out.println(" Invalid input. ");
        }
    }

    public void ContinueOperation()
    {
        DoWhileCalc dw = new DoWhileCalc();
        char s;
        char y = 'y';
        char Y = 'Y';

        do {
            dw.Calc();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter (Y/N) Y for more operation and N for no more . ");
            s = sc.next().charAt(0);

        }while(s==y || s==Y);

    }

    public static void main(String[] args) {

        DoWhileCalc dw = new DoWhileCalc();
        dw.ContinueOperation();
    }
}
