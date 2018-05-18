package enums;

public enum diningType {

    BAR(50),
    RESTARUANT(50);

    private final int capacity;

    diningType(int capacity){
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}
