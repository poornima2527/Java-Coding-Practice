class Stud {
    String name;
    int rollno;
    int mark;
    void display() {
        System.out.println("Name:"+name);
        System.out.println("Roll No:"+rollno);
        System.out.println("Mark:"+mark);
    }
    public static void main(String[] args) {
        Stud s = new Stud();
        s.name = "Poorni";
        s.rollno = 42;
        s.mark = 95;
        s.display();
    }
}