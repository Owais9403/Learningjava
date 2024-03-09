interface Computer {
    void show();
}

class Desktop implements Computer{
    public void show(){
        System.out.println("i can code as well fasteer");
    }
}

class Laptop implements Computer{
    public void show(){
        System.out.println("am i can code here");
    }
}

class Developer {
    public void devapp(Computer lap){
        lap.show();
    }
}
public class Interfacess 
{
    public static void main(String args[]){
        Laptop obj = new Laptop();
        Desktop obj1 = new Desktop();
        System.out.println("Hello");
        Developer a = new Developer();
        a.devapp(obj1);
    }
}
