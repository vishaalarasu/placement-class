import java.util.*;
class arrayusingfor{
    public static void main(String args[]){
        Scanner hi=new Scanner(System.in);
        int sum=0;
        int arr[]=new int[100];
        System.out.println("Enter the number of subjects: ");
        int b=hi.nextInt();
        System.out.print("Enter the marks of your subjects: ");
        for(int i=0;i<b;i++){
            arr[i]=hi.nextInt();
            sum=sum+arr[i];
        }
        System.out.println("The total is "+sum);
        System.out.println("The average is " + sum / b);
        /*int arr[]={1,2,3,45,50};
        for(int i:arr){
            System.out.println(i);
        } */
    }
}