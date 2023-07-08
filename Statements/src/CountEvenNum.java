import java.util.Scanner;

public class CountEvenNum {
    public void CountEven()
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the array: ");
        n=sc.nextInt();

        int arr[]=new int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        int counteven=0;
        System.out.println("\n");
        System.out.println("The Even Elements are : ");
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                System.out.println(arr[i]+" ");
                counteven++;
            }
        }
        System.out.println("Total even numbers are :"+counteven);
    }

    public static void main(String[] args) {
        CountEvenNum ce = new CountEvenNum();
        ce.CountEven();
    }
}
