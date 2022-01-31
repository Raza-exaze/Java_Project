import java.util.Scanner;

public class TableExample {
    public static void main(String args[])
    {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter Number For Table:");
            int a = scan.nextInt();
            for (int i = 1; i <= 10; i++) {
                System.out.println(a + "*" + i + "=" + a * i);
            }
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
