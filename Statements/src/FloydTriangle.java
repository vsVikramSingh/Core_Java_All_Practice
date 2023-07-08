public class FloydTriangle {

    public void FloydTring()
    {
        int k =1;
        for(int i=1; i<=4; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(k);
                k++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        FloydTriangle ft = new FloydTriangle();
        ft.FloydTring();
    }
}
