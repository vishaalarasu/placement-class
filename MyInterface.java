interface Animal{
    void sound();
}
class cat implements Animal{
    public void sound(){
        System.out.println("The cat is cute");
    }
}
class Myinterface{
    public static void main(String[] args){
        cat c=new cat();
        c.sound();
    }
}