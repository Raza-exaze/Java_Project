import java.util.Scanner;

public class Calculator {

    public static void main(String args[]){
        try{
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter The First Number:");
        int a=scan.nextInt();
        System.out.println("Enter The Second Number:");
        int b=scan.nextInt();
        System.out.println("Select The Option of Mathematics Operations");
        System.out.println("Type 1: +");
        System.out.println("Type 2: -");
        System.out.println("Type 3: *");
        System.out.println("Type 4: %");
        System.out.println("Type 5: /");
        System.out.println("Type 6: Exit");
        int c=scan.nextInt();
        switch(c) {
            case 1:
                int d = a + b;
                System.out.println("Addition Of Two Number First: " + a + " + Second: " + b + " Total: " + d);
                break;
            case 2:
                int e = a - b;
                System.out.println("Addition Of Two Number First: " + a + " - Second: " + b + " Total: " + e);
                break;
            case 3:
                int f = a * b;
                System.out.println("Addition Of Two Number First: " + a + " * Second: " + b + " Total: " + f);
                break;
            case 4:
                int o = a % b;
                System.out.println("Addition Of Two Number First: " + a + " % Second: " + b + " Total: " + o);
                break;
            case 5:
                int p = a / b;
                System.out.println("Addition Of Two Number First: " + a + " And Second: " + b + " Total: " + p);
                break;
            case 6:
                System.out.println("Thanks For Using This Technology");
                break;
            default:
                System.out.println("Enter Number is Invalid");
        }
        }catch(Exception e)
            {
                System.out.println(e);
            }

    }
}
