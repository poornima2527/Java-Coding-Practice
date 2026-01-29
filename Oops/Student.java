class Student {
    String name;
    int rollNo;
    int marks;

    Student(String name, int rollNo, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    void displayDetails() {
        System.out.println("Name    : " + name);
        System.out.println("Roll No : " + rollNo);
        System.out.println("Marks   : " + marks);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Aishwarya", 1, 85);
        Student s2 = new Student("Rohit", 2, 92);
        Student s3 = new Student("Sneha", 3, 78);
        Student s4 = new Student("Ankit", 4, 95);
        Student s5 = new Student("Priya", 5, 88);

        Student[] students = {s1, s2, s3, s4, s5};

        Student topStudent = students[0];

        for (Student s : students) {
            s.displayDetails();
            if (s.marks > topStudent.marks) {
                topStudent = s;
            }
        }

        System.out.println("Student with highest marks:");
        System.out.println("Name    : " + topStudent.name);
        System.out.println("Roll No : " + topStudent.rollNo);
        System.out.println("Marks   : " + topStudent.marks);
    }
}
