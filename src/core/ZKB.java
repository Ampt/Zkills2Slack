package core;

/**
 * Created by Matthew on 10/23/2015.
 */
public class ZKB {

    private String hash;
    private double totalValue;
    private int points;

    public ZKB(String hash, double totalValue, int points) {
        this.hash = hash;
        this.totalValue = totalValue;
        this.points = points;
    }

    public double getTotalValue() {
        return totalValue;
    }
}
