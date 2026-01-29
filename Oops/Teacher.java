class Teacher {
    String name;
    String subject;
    Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }
    void teach() {
        System.out.println(name + " is teaching students in " + subject + "...");
    }

    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mr. Poornima", "Biology");
        Teacher t2 = new Teacher("Ms. Aishwarya", "Chemistry");

        t1.teach();
        t2.teach();
    }
}
