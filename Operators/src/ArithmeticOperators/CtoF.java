package ArithmeticOperators;

import java.util.Scanner;

public class CtoF {
    public void Con()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter C = ");
        float c = sc.nextInt();
        double f = (1.8*c)+32;

        System.out.print(f);

    }
    public static void main(String[] args)
    {
        CtoF obj = new CtoF();
        obj.Con();
    }
}
