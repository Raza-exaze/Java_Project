import java.util.Scanner;

public class LoginApp {
    public static void main(String args[]){
        String user="MD";
        int pas=1234;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter User Name:");
        String use=scan.nextLine();
        System.out.println("Enter Password:");
        int pass=scan.nextInt();
        if(use.equals(user) && pas==pass)
        {
            System.out.println("Login Successfully");
        }
        else
        {
            System.out.println("Check Once And Try Again Later");
        }

    }
}
