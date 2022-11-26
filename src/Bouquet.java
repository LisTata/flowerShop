import java.util.ArrayList;

public class Bouquet {


    private ArrayList<Flower> flowers = new ArrayList<>();
    private ArrayList<Accessories> accessori = new ArrayList<>();

    private double price;

  /* public Bouquet madeBouquet(int roses,  int carnations, int lilies, int tulips, int cards,boolean basket,boolean wrapper){
        for (int i = 0; i < roses; i++) {
            flowers.add(new Rose());

        }}*/

    public Bouquet addFlower(Flower flower, int pieceFlower) {
        flowers.add(flower);

        price += flower.getPriseFlower() * pieceFlower;
        return this;
    }

    public Bouquet addAccessories(Accessories accessories) {
        accessori.add(accessories);
        price += accessories.getPrice();
        return this;
    }

    public double getPrice() {
        return price;
    }

    public ArrayList sortFlowers() {
        for (int j = flowers.size() - 1; j >= 0; j--) {
            for (int i = 0; i < j; i++) {
                if (flowers.get(i).getFreshness() > flowers.get(i + 1).getFreshness()) {
                    Flower temp = flowers.get(i);
                    flowers.set(i, flowers.get(i + 1));
                    flowers.set(i + 1, temp);
                }
            }
        }
        return flowers;
    }

    public String findStemLength(int minLength, int maxLength) {
        String result = "Stem Length: " + minLength + "-" + maxLength + " cm. \n";
        for (int i = 0; i < flowers.size(); i++) {
            if (flowers.get(i).getStemLength() >= minLength && flowers.get(i).getStemLength() <= maxLength) {
                result += flowers.get(i);
            }
        }
        return result;
    }
    public void print(){
        for (Object flower:
            flowers ) {
            System.out.println(flower);

        }
    }

}


