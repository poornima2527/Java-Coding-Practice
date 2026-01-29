class Laptop {
    String brand;
    String model;
    int ram; 

    Laptop(String brand, String model, int ram) {
        this.brand = brand;
        this.model = model;
        this.ram = ram;
    }

    void displayDetails() {
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("RAM   : " + ram + " GB");
    }

    void upgradeRAM(int additionalRAM) {
        ram += additionalRAM;
        System.out.println("RAM upgraded by " + additionalRAM + " GB. New RAM: " + ram + " GB");
    }

    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Dell", "Inspiron 15", 8);
        Laptop laptop2 = new Laptop("HP", "Pavilion", 16);

        laptop1.displayDetails();
        laptop2.displayDetails();

        laptop1.upgradeRAM(8);
        laptop1.displayDetails();
    }
}
