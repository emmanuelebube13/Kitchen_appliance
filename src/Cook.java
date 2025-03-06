
public class Cook {
        // Attributes
        private boolean stoveMethod;
        private boolean bakeMethod;
        private boolean timer;
        private String energySource;

        // Constructor (must be inside the class)
        public Cook(boolean stoveMethod, boolean bakeMethod, boolean timer, String energySource) {
            this.stoveMethod = stoveMethod;  // Fixed capitalization issue
            this.bakeMethod = bakeMethod;
            this.timer = timer;
            this.energySource = energySource;
        }

        // Methods
        public void useBake() {
            if (bakeMethod) {
                System.out.println("Baking using the oven.");
            } else {
                System.out.println("Bake method not available.");
            }
        }

        public void useStove() {
            if (stoveMethod) {
                System.out.println("Cooking on the stove...");
            } else {
                System.out.println("Stove method not available.");
            }
        }

        public void startTimer() {
            if (timer) {
                System.out.println("Timer started!");
            } else {
                System.out.println("No timer available.");
            }
        }

        public String getEnergySource() {
            return energySource;
        }
    }

