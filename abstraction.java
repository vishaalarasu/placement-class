abstract class Animal {
    abstract void sound();//abstract method
    void sleep(){//normal method
        System.out.print("Animal is sleeping. So maintain silence");
    }
}
class dog extends Animal{
    void sound(){
        System.out.println("The dog is cute");
    }
}
class abstraction{
    public static void main(String[] args){
        dog x=new dog();
        x.sound();
        x.sleep();
    }
}