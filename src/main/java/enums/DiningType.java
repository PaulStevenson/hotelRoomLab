package enums;

public enum DiningType {

    BAR(50),
    RESTARUANT(50);

    private final int capacity;

    DiningType(int capacity){
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}
