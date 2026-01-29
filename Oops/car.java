public class car {
    String brand;
    int price;
    void display() {
        System.out.println("Brand :"+brand );
        System.out.println("Price :"+price);
    }
    public static void main(String[] args) {
        car c = new car();
        c.brand = "Laborgini";
        c.price = 10000000;
        c.display();
    }
}
