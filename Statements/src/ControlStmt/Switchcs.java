package ControlStmt;


import java.util.Scanner;

public class Switchcs {

    public void Test() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter \n 1 for Monday. \n 2 for Tuesday. \n 3 for Wednesday. \n " +
                "4 for Thursday. \n 5 for Friday. \n 6 for Saturday. \n 7 for Sunday. \n");
        int day = sc.nextInt();

        switch (day)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid number for day.");
        }
    }



    public static void main(String[] args)
    {
        Switchcs sw = new Switchcs();
        sw.Test();
    }
}
