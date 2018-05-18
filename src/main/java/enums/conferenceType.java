package enums;

public enum conferenceType {

    SMALL(100),
    LARGE(200);

    private final int capacity;

    conferenceType(int capacity){
        this.capacity = capacity;
    }

    public int getCapacity(){
        return capacity;
    }
}




