public class Main {
    public static void main(String[] args) {
        // --- Testing the Cook (Oven & Stove) Class ---
        System.out.println("=== Testing Cook (Oven & Stove) ===");
        // Create a Cook object with: stove available, bake available, timer available, and energy source "Electric".
        Cook myCook = new Cook(true, true, true, "Electric");
        myCook.useStove();
        myCook.useBake();
        myCook.startTimer();
        System.out.println("Energy Source: " + myCook.getEnergySource());
        System.out.println();

        // --- Testing the Refrigerator Class ---
        System.out.println("=== Testing Refrigerator ===");
        // Create a Refrigerator object with: freezer present, independent temperature controls available,
        // door open beep active, and freezer defrost method available.
        Refrigerator myRefrigerator = new Refrigerator(true, true, true, true);
        myRefrigerator.doorOpenBeep();
        myRefrigerator.defrostFreezer();
        // This method displays the status of independent temperature controls.
        myRefrigerator.independentTempControls();
        System.out.println();

        // --- Testing the Microwave Class ---
        System.out.println("=== Testing Microwave ===");
        // Create a Microwave object with: defrost, cook, reheat available, power level 5, and timer available.
        Microwave myMicrowave = new Microwave(true, true, true, 5, true);
        myMicrowave.defrost();
        myMicrowave.cook();
        myMicrowave.reheat();
        // Set a new power level (for example, 8).
        myMicrowave.setPowerLevel(8);
        myMicrowave.startTimer();
    }
}
