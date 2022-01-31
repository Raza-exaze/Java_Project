import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMappingExample {
    public static void main(String args[]){
        TreeMap<String,Integer> mp=new TreeMap<>();
        mp.put("Java",1);
        mp.put("c",2);
        mp.put("Android",9);
        mp.put("React Native",10);
        mp.put("IOS",11);
        mp.put("JavaScript",12);
        mp.put("Node.js",13);
        mp.put("c++",4);
        mp.put("Python",3);
        mp.put("C#",8);
        mp.put("Ruby",5);
        mp.put("Perl",6);
        mp.put("PHP",7);

        System.out.println(mp);
            TreeSet<String> ts=new TreeSet<>();
            ts.add("Java");
            ts.add("Android");
            ts.add("Kotlin");
            ts.add("React");
            ts.add("C");
            ts.add("C++");
            ts.add("C#");
            for(String a: ts){
                     System.out.println(a);
            }

    }
}
