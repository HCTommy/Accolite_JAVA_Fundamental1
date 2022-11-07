package Q2;

public class Book {
    int bno;
    String bname;
    double price;

    public Book() {
    }

    public Book(int bno, String bname, double price) {
        this.bno = bno;
        this.bname = bname;
        this.price = price;
    }

    public void display(){
        System.out.println(
                "bno=" + bno +
                "\nbname=" + bname +
                "\nprice=" + price);
    }
}
