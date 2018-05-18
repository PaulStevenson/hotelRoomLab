package rooms;

import enums.BedroomType;

public class Bedroom extends Room {

    private int number;
    private BedroomType type;
    private double roomRate;

    public Bedroom(int number, BedroomType type, double roomRate){
        super(type.getCapacity());
        this.number = number;
        this.type = type;
        this.roomRate = roomRate;
    }

    public int getCapacity(){
        return this.type.getCapacity();
    }


    public int getRoomNumber() {
        return this.number;
    }

    public BedroomType getBedroomRoomType() {
        return this.type;
    }

    public double getRoomRate() {
        return this.roomRate;
    }
}
