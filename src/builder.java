class house {
    private int numRooms;
    private int numFloors;
    private boolean hasPool;
    private boolean hasGarage;

    public house(builder builder) {
        this.numRooms = builder.numRooms;
        this.numFloors = builder.numFloors;
        this.hasPool = builder.hasPool;
        this.hasGarage = builder.hasGarage;
    }

    public String toString() {
        return "house with " + numRooms + " rooms, " + numFloors + " floors, pool: " + hasPool + ", garage: " + hasGarage;
    }

    public static class builder {
        private int numRooms;
        private int numFloors;
        private boolean hasPool;
        private boolean hasGarage;

        public builder setNumRooms(int numRooms) {
            this.numRooms = numRooms;
            return this;
        }

        public builder setNumFloors(int numFloors) {
            this.numFloors = numFloors;
            return this;
        }

        public builder setHasPool(boolean hasPool) {
            this.hasPool = hasPool;
            return this;
        }

        public builder setHasGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public house build() {
            return new house(this);
        }
    }
}
public class builder {
    public static void main(String[] args) {
        house house = new house.builder()
                .setNumRooms(3)
                .setNumFloors(2)
                .setHasPool(true)
                .setHasGarage(false)
                .build();

        System.out.println(house);
    }
}
