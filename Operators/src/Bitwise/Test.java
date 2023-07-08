package Bitwise;

public class Test {

    public static  void main(String[] args)
    {
        int a=60;  //1 1 1 1 0 0

        System.out.println(a>>1);   // 16+8+4+2 = 30
        System.out.println(a>>2);   // 8+4+2+1= 15
        System.out.println(a>>3);   // 4+2+1= 7
        System.out.println(a>>4);   // 2+1=3

        System.out.println(a<<1);
        System.out.println(a<<2);
        System.out.println(a<<2);
        System.out.println(a<<2);
    }
}
