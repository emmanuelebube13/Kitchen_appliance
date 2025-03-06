public class Refrigerator {
    // Attributes
    private boolean freezer;
    private boolean independentTempControls;
    private boolean doorOpenBeep;
    private boolean freezerDefrostMethod;

    // Constructors
    public Refrigerator (boolean freezer, boolean independentTempControls, boolean doorOpenBeep, boolean freezerDefrostMethod) {
        this.freezer = freezer;
        this.independentTempControls = independentTempControls;
        this.doorOpenBeep = doorOpenBeep;
        this.freezerDefrostMethod = freezerDefrostMethod;
    }
    // Method
    public void doorOpenBeep() {
        if (doorOpenBeep) {
            System.out.println("Door is open more than 60 seconds.");
        }else {
            System.out.println("Door is Closed.");
        }
    }
    public void defrostFreezer() {
        if (freezerDefrostMethod) {
            System.out.println("Defrost is on.");
        }else {
            System.out.println("Defrost is off.");
        }
    }
    public void independentTempControls() {
        if (independentTempControls) {
            System.out.println("ON");
        }else{
            System.out.println("OFF");
        }
    }

}
