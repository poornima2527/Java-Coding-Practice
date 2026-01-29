class Rectangle {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double computeArea() {
        return length * width;
    }

    double computePerimeter() {
        return 2 * (length + width);
    }

    void displayDetails() {
        System.out.println("Length    : " + length);
        System.out.println("Width     : " + width);
        System.out.println("Area      : " + computeArea());
        System.out.println("Perimeter : " + computePerimeter());
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 3);
        Rectangle r2 = new Rectangle(10, 7);

        r1.displayDetails();
        r2.displayDetails();
    }
}
