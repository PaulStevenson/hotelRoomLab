package enums;

public enum ConferenceType {

    SMALL(100),
    LARGE(200);

    private final int capacity;

    ConferenceType(int capacity){
        this.capacity = capacity;
    }

    public int getCapacity(){
        return capacity;
    }
}




