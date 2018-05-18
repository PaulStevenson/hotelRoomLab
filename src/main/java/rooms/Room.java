package rooms;

import java.util.ArrayList;

public abstract class Room {

    private ArrayList<String> guestlist;
    private int capacity;

    public Room(int capacity){
        this.guestlist = guestlist;
        this.capacity = capacity;
    }

    public ArrayList<String> getGuestlist() {
        return guestlist;
    }

    public abstract int getCapacity();

}
