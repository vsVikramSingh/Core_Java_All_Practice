package Assignment;

public class Test {

    // (=,+=,-=,*=,/=,%)

    public void Assign()
    {
        int a=10, b=20;
        int c=a;
        System.out.println(c);
        System.out.println(a += b);
        System.out.println(a -= b);
        System.out.println(a *= b);
        System.out.println(a /= b);
        System.out.println(a %= b);
    }

    public static void main(String[] args)
    {
        Test ts = new Test();
        ts.Assign();
    }
}
