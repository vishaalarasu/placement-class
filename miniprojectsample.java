import java.util.*;
 class parent {
    public String name;
    public int age;
    void details()
    {
     Scanner hi = new Scanner(System.in);

        System.out.println("Enter your name:");
        name = hi .nextLine();
        System.out.println("Enter your age:");
        age = hi .nextInt();
       
    }
 }
    class child extends parent{
        public int mark;
        void getDetails()
        {
             Scanner hi = new Scanner(System.in);
 System.out.println("Enter your mark:");
        mark = hi .nextInt();
        }
    }
    

public class miniprojectsample{
   
    public static void main(String[] args){
        child x = new child();
        x.details();
        x.getDetails();
        System.out.println("Name: " + x.name);
        System.out.println("Age: " + x.age);
        System.out.println("Mark: " + x.mark);
    }


}