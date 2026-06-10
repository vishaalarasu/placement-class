public class constructor{
    int year;
    String name;
    String department;
    double CGPA;
    //creating constructor(function with the same name as the class and no return type)
    public constructor(int y, String n,String dept,double cgpa){
        year=y;
        name=n;
        department=dept;
        CGPA=cgpa;
    }
    public static void main(String[] args){
        //creating object of the class and passing value to the constructor
        constructor a=new constructor(2007,"Vishaal",
        "Software Systems",9.06);
        System.out.println("Name: "+a.name+"\n"+"Year: "+a.year+
        "\n"+"Department: "+a.department+"\n"+"CGPA: "+a.CGPA);
    }
}