package ArithmeticOperators;

import java.util.Scanner;

public class Area {
    //final float pi = 3.14f;
    public void AreaOfCircle()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle = "+'\n');
        int radius = sc.nextInt();
        double area = Math.PI*(radius*radius);
        System.out.print("Area of the circle is = "+area);
    }
    public static void main(String[] args)
    {
        Area obj = new Area();
        obj.AreaOfCircle();
    }
}
