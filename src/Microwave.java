public class Microwave {
    // Attributes
    private boolean defrostMethod;
    private boolean cookMethod;
    private boolean reheatMethod;
    private int powerLevel; // valid range: 1 to 10
    private boolean timer;

    // Constructor
    public Microwave(boolean defrostMethod, boolean cookMethod, boolean reheatMethod, int powerLevel, boolean timer) {
        this.defrostMethod = defrostMethod;
        this.cookMethod = cookMethod;
        this.reheatMethod = reheatMethod;
        // Validate the power level; if invalid, set it to a default value (e.g., 1)
        if (powerLevel < 1 || powerLevel > 10) {
            System.out.println("Invalid power level. Setting default power level to 1.");
            this.powerLevel = 1;
        } else {
            this.powerLevel = powerLevel;
        }
        this.timer = timer;
    }

    // Method to simulate defrosting food
    public void defrost() {
        if (defrostMethod) {
            System.out.println("Defrosting food in the microwave.");
        } else {
            System.out.println("Defrost method is not available.");
        }
    }

    // Method to simulate cooking food
    public void cook() {
        if (cookMethod) {
            System.out.println("Cooking food in the microwave.");
        } else {
            System.out.println("Cook method is not available.");
        }
    }

    // Method to simulate reheating food
    public void reheat() {
        if (reheatMethod) {
            System.out.println("Reheating food in the microwave.");
        } else {
            System.out.println("Reheat method is not available.");
        }
    }

    // Method to set the microwave's power level (valid range: 1 to 10)
    public void setPowerLevel(int level) {
        if (level < 1 || level > 10) {
            System.out.println("Invalid power level. Please set a level between 1 and 10.");
        } else {
            this.powerLevel = level;
            System.out.println("Power level set to " + level + ".");
        }
    }

    // Method to start the microwave timer
    public void startTimer() {
        if (timer) {
            System.out.println("Microwave timer started.");
        } else {
            System.out.println("Timer feature is not available in this microwave.");
        }
    }
}

