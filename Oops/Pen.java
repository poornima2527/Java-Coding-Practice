class Pen {
    String color;
    String type;

    Pen(String color, String type) {
        this.color = color;
        this.type = type;
    }

    void displayDetails() {
        System.out.println("Color : " + color);
        System.out.println("Type  : " + type);
    }

    public static void main(String[] args) {
        Pen pen1 = new Pen("Blue", "Ballpoint");
        Pen pen2 = new Pen("Black", "Gel");

        pen1.displayDetails();
        pen2.displayDetails();
    }
}
