public class Flower {
    private Color colorFlower;
    private double priseFlower;
    private int stemLength;
    private int freshness;

    public Flower(Color colorFlower, double priseFlower, int stemLength, int freshness) {
        this.colorFlower = colorFlower;
        this.priseFlower = priseFlower;
        this.stemLength = stemLength;
        this.freshness = freshness;
    }

    public Color getColorFlower() {
        return colorFlower;
    }

    public void setColorFlower(Color colorFlower) {
        this.colorFlower = colorFlower;
    }

    public double getPriseFlower() {
        return priseFlower;
    }

    public void setPriseFlower(double priseFlower) {
        this.priseFlower = priseFlower;
    }

    public int getStemLength() {
        return stemLength;
    }

    public void setStemLength(int stemLength) {
        this.stemLength = stemLength;
    }

    public int getFreshness() {
        return freshness;
    }

    public void setFreshness(int freshness) {
        this.freshness = freshness;
    }
}

enum Color {
    Red, Green, Pink, Yellow, Purple
}

