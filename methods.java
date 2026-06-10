import java.util.*;
public class methods {
    public static void main(String args[]){
        Scanner hi=new Scanner(System.in);
        System.out.println("Enter your name: ");
        String a=hi.nextLine();
        System.out.println("Name: "+a);
        System.out.println("Uppercase: "+a.toUpperCase());
        System.out.println("Lowercase: "+a.toLowerCase());
        System.out.println("First character: "+a.charAt(0));
        System.out.println("Length: "+a.length());
        System.out.println("Substring: "+a.substring(0,3));
        System.out.println("Replace: "+a.replace('a','e'));
        System.out.println("Contains 'a': "+a.contains("a"));
    }
}
