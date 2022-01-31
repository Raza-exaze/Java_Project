import java.util.Scanner;

public class ExampleString {
    public static void main(String args[]){
        String a="Hello World Of Programming Language";
        System.out.println("With Space is Content:"+a.length());
        String b=a.replace(" ","");
        int c=a.length()-b.length();
        System.out.println("Only Space is Count:"+c);
        System.out.println("Without Space Character is Count:"+b.length());
        char[] e={'a','b','c','d'};
        for(char p: e)
        {
            System.out.println(p);
        }
        String name="Computer";
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Your Name:");
        String names=s.nextLine();
        if(name.equals(names))
        {
            System.out.println("Welcome To The Company: "+name);
        }
        else
        {
            System.out.println("Details Is Not Available ever Database");
        }
    }
}
