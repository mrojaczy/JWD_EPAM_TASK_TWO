package Models;


public class TabletPC {
    private int BATTERY_CAPACITY;
    private int DISPLAY_INCHES;
    private int MEMORY_ROM;
    private int FLASH_MEMORY_CAPACITY;
    private String COLOR;

    public TabletPC(int BATTERY_CAPACITY, int DISPLAY_INCHES, int MEMORY_ROM, int FLASH_MEMORY_CAPACITY, String COLOR) {
        this.BATTERY_CAPACITY = BATTERY_CAPACITY;
        this.DISPLAY_INCHES = DISPLAY_INCHES;
        this.MEMORY_ROM = MEMORY_ROM;
        this.FLASH_MEMORY_CAPACITY = FLASH_MEMORY_CAPACITY;
        this.COLOR = COLOR;
    }
}
