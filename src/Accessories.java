public class Accessories {
private int price;

    public Accessories(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Accessories{" +
                "price=" + price +
                '}';
    }


}
