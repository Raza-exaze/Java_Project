public class ConversionExample {
    public static void main(String args[]){
        System.out.println("Binary:"+Integer.toBinaryString(20));
        System.out.println("Decimal:"+Integer.parseInt("10100",2));
        System.out.println("Octal:"+Integer.toOctalString(20));
        System.out.println("Hexa Decimal:"+Integer.toHexString(20));
        try{
        System.out.println(Integer.parseInt("10001",2));
        System.out.println(Integer.toBinaryString(17));}
        catch(Exception e){System.out.println(e.getMessage());}

    }
}
