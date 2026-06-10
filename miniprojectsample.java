import java.util.*;
 class parent {
    String name;
    int age;
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
        int m1,m2,m3;
        void marks()
        {
            Scanner hi = new Scanner(System.in);
            System.out.println("Enter your 3 subject marks: ");
            m1 = hi .nextInt();
            m2=hi.nextInt();
            m3=hi.nextInt();
        }
        double avg(){
            return (m1+m2+m3)/3.0;
        }
    }
    

public class miniprojectsample{
   
    public static void main(String[] args){
        Scanner hi=new Scanner(System.in);
        child arr[] = new child[3];
        for(int i=0;i<3;i++){
            arr[i] = new child();
            arr[i].details();
            arr[i].marks();
        }
        for(int i=0;i<3;i++){
            System.out.println("Name: "+arr[i].name);
            System.out.println("Age: "+arr[i].age);
            System.out.println("Average Marks: "+arr[i].avg());
        }
    }
}