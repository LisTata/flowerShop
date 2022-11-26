import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Rose rose = new Rose(Color.Pink, 3.5, 35, 3);
        Carnation carnation = new Carnation(Color.Pink, 4.5, 40, 2);
        Tulip tulip=new Tulip(Color.Red,2.3,33,1);
        Basket basket = new Basket(20);
        Bouquet bouquet = new Bouquet();
        bouquet.addFlower(rose, 3).addFlower(tulip,5).addFlower(carnation, 1).addAccessories(basket);
        System.out.println(bouquet.getPrice());
        System.out.println("Flowers in our bouquet with given stem length:");
        System.out.println(bouquet.findStemLength(34, 41));
        bouquet.sortFlowers();
        bouquet.print();
    }
}
