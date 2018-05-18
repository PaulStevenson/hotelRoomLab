package rooms;

import enums.ConferenceType;

public class Conference extends Room{

    private String name;
    private ConferenceType type;
    private double roomRate;

    public Conference(String name, ConferenceType type, double roomRate){
        super(type.getCapacity());
        this.name = name;
        this.type = type;
        this.roomRate = roomRate;

    }

    public int getCapacity(){
        return this.type.getCapacity();
    }

    public String getName() {
        return this.name;
    }

    public ConferenceType getConferenceType() {
        return this.type;
    }

    public double getRoomRate() {
        return this.roomRate;
    }

}
