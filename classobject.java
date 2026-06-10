class classobject{
    int a=10;
    String b="Jeeva";
    public static void main(String[] args){
        classobject x=new classobject();
        classobject y=new classobject();
        x.a=40;//modified
        System.out.println(x.a);
        System.out.println(y.a);
        System.out.println(x.b);
    }
}