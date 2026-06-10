class Name {
    private String name;
    public void setname(String n){
        name=n;
    }
    public String getname(){
        return name;
    }
}
public class encapsulation{
    public static void main(String[] args){
        Name n=new Name();
        n.setname("Vishaal");
        System.out.println("Name: "+n.getname());
    }
}