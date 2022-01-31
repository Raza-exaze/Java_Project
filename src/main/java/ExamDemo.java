import java.util.Scanner;

public class ExamDemo
{
    public static void main(String args[])
    {
       String name;
       int rollno;
       int marks;
       Scanner scan=new Scanner(System.in);
       System.out.println("Enter Your Name:");
       name=scan.nextLine();
       System.out.println("Enter Your Roll Number:");
       rollno=scan.nextInt();
       System.out.println("Enter Your Marks:");
       marks=scan.nextInt();
       if(marks>=75)
       {
           System.out.println("Welcome:"+name);
          System.out.println("Roll Number:"+rollno);
           System.out.println("Congratualation Your Got Marks:"+marks);
           System.out.println("Grade: A");
       }
       else if (marks>=60 && marks<=74) {
           System.out.println("Welcome: "+name);
           System.out.println("Roll Number:"+rollno);
           System.out.println("Congratualation You Got Marks:"+marks);
           System.out.println("Grade: B");

       }
       else
       {
           System.out.println("Welcome: "+name);
           System.out.println("Roll Number:"+rollno);
           System.out.println("Unfurtunately You Are Failed Try Hard For next Time");
           System.out.println("Good Luck For Future Exams");
           System.out.println("Grade: F");
       }
    }
}
