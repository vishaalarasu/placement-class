//method and function are same in java
class methodjava{
    static void fun(){
        System.out.println("This is a method");
    }
    static void ction(int a,int b){
        System.out.println(a+b);
    }
    public static void main(String args[]){
        methodjava x=new methodjava();//calling using object
        x.fun();
        ction(6,4);
    }
}