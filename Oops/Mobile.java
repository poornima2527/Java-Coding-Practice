class Mobile {
    String brand;
    String model;
    double price;

    Mobile(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : " + price);
    }

    public static void main(String[] args) {
        Mobile mobile1 = new Mobile("Samsung", "Galaxy S23", 75000);
        Mobile mobile2 = new Mobile("Apple", "iPhone 15", 120000);

        mobile1.displayDetails();
        mobile2.displayDetails();
    }
}
