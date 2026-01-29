class TV {
    String brand;
    int size; 
    String resolution;

    TV(String brand, int size, String resolution) {
        this.brand = brand;
        this.size = size;
        this.resolution = resolution;
    }

    void displayDetails() {
        System.out.println("Brand      : " + brand);
        System.out.println("Size       : " + size + " inches");
        System.out.println("Resolution : " + resolution);
    }

    public static void main(String[] args) {
        TV tv1 = new TV("Samsung", 55, "4K");
        TV tv2 = new TV("LG", 65, "8K");

        tv1.displayDetails();
        tv2.displayDetails();
    }
}
