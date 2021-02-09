package Models;

public class Refrigerator {
    private int POWER_CONSUMPTION;
    private int WEIGHT;
    private int FREEZER_CAPACITY;
    private int OVERALL_CAPACITY;
    private int HEIGHT;
    private int WIDTH;

    public Refrigerator(int POWER_CONSUMPTION, int WEIGHT, int FREEZER_CAPACITY, int OVERALL_CAPACITY, int HEIGHT, int WIDTH) {
        this.POWER_CONSUMPTION = POWER_CONSUMPTION;
        this.WEIGHT = WEIGHT;
        this.FREEZER_CAPACITY = FREEZER_CAPACITY;
        this.OVERALL_CAPACITY = OVERALL_CAPACITY;
        this.HEIGHT = HEIGHT;
        this.WIDTH = WIDTH;
    }
}
