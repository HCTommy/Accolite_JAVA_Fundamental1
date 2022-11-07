package Q2;

public class SpecialEditionBook extends Book{

    double discount;

    public SpecialEditionBook() {
        super();
    }

    public SpecialEditionBook(int bno, String bname, double price, double discount) {
        super(bno, bname, price);
        this.discount=discount;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("discount= "+discount);
    }
}
