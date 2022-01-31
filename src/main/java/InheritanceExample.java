class InheritanceExample {
    int sal=200;
    void Moon()
    {
        System.out.println("Moon Is Bright Light");
        int a=0,b=0;
        for(int i=1;i<=3;i++) {
            int sum = a + b;
            System.out.print(sum);
        }
    }
}
class Example extends InheritanceExample {
    int sal = 300;
}
class Demo
{
    public static void main(String args[]){

        InheritanceExample e=new Example();
        System.out.println("Salary :"+e.sal);
        e.Moon();
    }
}