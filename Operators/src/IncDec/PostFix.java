package IncDec;

public class PostFix {

    public static void main(String[] args)
    {
        //example
        int a=0,b=0,c=0;

        a=++b + ++c;
        System.out.println(a +" " +b +" " +c);
        a=b++ + c++;
        System.out.println(a +" " +b +" " +c);
        a=++b + c++;
        System.out.println(a +" " +b +" " +c);
        a=b-- + c--;
        System.out.println(a +" " +b +" " +c);

//////////////////////////////////////////////////////////////////////////


        int i=1, m=1, j=1, k=1, n=1, x=1, y=1, z=1, p=1;

        c=1;a=1;b=1;

        i = i++ + ++i;  // i=4
        System.out.print(" Value of i = "+i +"\n");

        c = a + b + a++ + b++ + ++a + ++b;
        System.out.print(" Value of c a b = "+c +" "+a+" "+b +"\n");

        i = i++ - --i + ++i - i--;
        System.out.print(" Value of i = "+i +"\n");

        m = i-- - j-- - k--;
        System.out.print(" Value of m j k = "+m +" "+j +" "+k +"\n");

        k = i-- - i++ + --j - ++j + --i - j-- + ++i - j++;
        System.out.print(" Value of k i j = "+k +" "+i +" " +j +"\n");

        p = --m * --n * n-- * m--;
        System.out.print(" Value of p m n = "+p +" "+m +" " +n +"\n");

        a = a++ + ++a * --a - a--;
        System.out.print(" Value of a = "+a +"\n");

        i = --x + y++ - z-- - --z + ++y - --x + y-- - --x;
        System.out.print(" Value of i x y z = "+i +" " +x +" " +y +" " +z +"\n");

    }
}
