class multipleemployee {
    String name;
    String designation;
    double salary;

    multipleemployee(String name, String designation, double salary) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Name        : " + name);
        System.out.println("Designation : " + designation);
        System.out.println("Salary      : " + salary);
    }

    public static void main(String[] args) {
        multipleemployee emp1 = new multipleemployee("Aishwarya", "Software Engineer", 50000);
        multipleemployee emp2 = new multipleemployee("Rohit", "Manager", 75000);
        multipleemployee emp3 = new multipleemployee("Sneha", "Tester", 40000);

        multipleemployee[] employees = {emp1, emp2, emp3};

        for (multipleemployee emp : employees) {
            emp.displayDetails();
        }

        multipleemployee ref = emp1;
        ref.name = "Aishwarya Sharma";
        emp1.displayDetails();
    }
}
