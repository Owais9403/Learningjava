enum Laptop{
    Macbook(1000),xps(599),surface(455),microsoft(4544);
    private int price;
    private Laptop(int price){
        this.price=price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
    

}

public class Enums {
    public static void main(String[] args) {
        for(Laptop each : Laptop.values()){
            System.out.println(each + " : "+ each.getPrice());
        }
    }
}
