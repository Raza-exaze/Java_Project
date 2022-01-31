import java.util.Scanner;

public class Examples {
    public static void main(String args[])
    {
        System.out.println("Hello World");
        String z="Hello World";
        String p=z.replace(" ","");
        int y=p.length();
        System.out.println("Length Of Hello World:"+y);
        System.out.println(Integer.toBinaryString(22));
        System.out.println("Decimal Number:"+Integer.parseInt("10110",2));
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter The First Number:");
        int a=scan.nextInt();
        System.out.println("Enter The Second Number:");
        int b=scan.nextInt();
        int c=a+b;
        System.out.println("Additional Of Two Numbers:"+c);

    }
}
