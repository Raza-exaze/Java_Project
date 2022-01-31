import java.util.Scanner;

public class ExampleJava {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter The Number:");
        int a=scan.nextInt();
        for(int i=1;i<=10;i++)
        {
            int result=a*i;
            System.out.println(a+"x"+i+"="+result);
        }
        //Factorial Values Finding Here
        int fact=1;
        for(int j=1;j<=5;j++)
        {
            fact=fact*j;
            System.out.println("Factorial Of Number:"+fact);
        }
        int rev=0,n,rem,temp;
        System.out.println("Enter The Number:");
        n=scan.nextInt();
        temp=n;
        while(n!=0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        System.out.println("Reverse Number of Is:"+rev);

        if(temp==rev)
        {
            System.out.println("Palindrome Number");
        }
        else
        {
            System.out.println("Not A Palindrome Number");
        }

        System.out.println("Welcome To Java Programming Language");
    }
}
