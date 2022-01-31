public class ExampleArray {
    public static void main(String args[])
    {
        try {
            int[][] a = {{1,2,3},{3,2,1},{7,8,9}};
                    //new int[3][3];
           // a[0][0]=1;
            //a[0][1]=2;
            //a[0][2]=3;
            //a[1][0]=3;
            //a[1][1]=2;
            //a[1][2]=1;
            //a[2][0]=7;
            //a[2][1]=8;
            //a[2][2]=9;
                    //{{1, 2},{2,1},{3,4}};
            System.out.println("Array of Matrix Form");
            for (int i = 0; i <= 2; i++) {
                for (int j = 0; j <= 2; j++) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
