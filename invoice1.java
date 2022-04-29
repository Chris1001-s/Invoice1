public class Invoice1 {
    private String item;
    private double price;

    public Invoice1() {}

    public Invoice1(String item, double price) {
        super();
        this.item = item;
        this.price = price;
    }
    public Invoice1(String item) {
        this.item = item;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    };
    public void display() {
        System.out.println("\tdescription \t \tprice");
        System.out.println("-----------------------------------------------");
    }

    @Override
    public String toString() {
        System.out.println("\t" + getItem() + "\t" + "\t\t" + "$" + getPrice());
        return item;
    }

}



