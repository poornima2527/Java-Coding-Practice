class Fan {
    String brand;
    int speed; // Current speed

    Fan(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void increaseSpeed() {
        speed++;
        System.out.println("Speed increased to: " + speed);
    }

    void decreaseSpeed() {
        if (speed > 0) {
            speed--;
            System.out.println("Speed decreased to: " + speed);
        } else {
            System.out.println("Fan is already at minimum speed.");
        }
    }

    void displayDetails() {
        System.out.println("Brand : " + brand);
        System.out.println("Speed : " + speed);
    
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan("Orient", 1);
        fan1.displayDetails();

        fan1.increaseSpeed();
        fan1.increaseSpeed();
        fan1.decreaseSpeed();
        fan1.displayDetails();
    }
}
