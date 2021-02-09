package Models;

public class Speakers {
    private int POWER_CONSUMPTION;
    private int NUMBER_OF_SPEAKERS;
    private int[] FREQUENCY_RANGE; // ?
    private int CORD_LENGTH;

    public Speakers(int POWER_CONSUMPTION, int NUMBER_OF_SPEAKERS, int[] FREQUENCY_RANGE, int CORD_LENGTH) {
        this.POWER_CONSUMPTION = POWER_CONSUMPTION;
        this.NUMBER_OF_SPEAKERS = NUMBER_OF_SPEAKERS;
        this.FREQUENCY_RANGE = FREQUENCY_RANGE;
        this.CORD_LENGTH = CORD_LENGTH;
    }
}
