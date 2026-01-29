public class Book {
    String title;
    String author;
    int price;
    void displaydetails() {
        System.out.println("Title:" + title);
        System.out.println("Author:"+ author);
        System.out.println("Price:"+price);
    }
    void updateprice(int newprice){
        price = newprice;
    }
    public static void main(String[] args) {
        Book n = new Book();
        n.title = "Java Programming";
        n.author = "John Doe";
        n.price = 500;
        n.displaydetails();
        n.updateprice(450);
        n.displaydetails();
    }
}
