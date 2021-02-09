package Models;

public class VacuumCleaner {
    private int POWER_CONSUMPTION;
    private char FILTER_TYPE;
    private String BAG_TYPE;
    private String WAND_TYPE;
    private int MOTOR_SPEED_REGULATION;
    private int CLEANING_WIDTH;

    public VacuumCleaner(int POWER_CONSUMPTION, char FILTER_TYPE, String BAG_TYPE, String WAND_TYPE, int MOTOR_SPEED_REGULATION, int CLEANING_WIDTH) {
        this.POWER_CONSUMPTION = POWER_CONSUMPTION;
        this.FILTER_TYPE = FILTER_TYPE;
        this.BAG_TYPE = BAG_TYPE;
        this.WAND_TYPE = WAND_TYPE;
        this.MOTOR_SPEED_REGULATION = MOTOR_SPEED_REGULATION;
        this.CLEANING_WIDTH = CLEANING_WIDTH;
    }
}
