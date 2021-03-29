package hu.nive.ujratervezes.zarovizsga.cleaning;

public class Office implements Cleanable {

    private String address;
    private int floorspace;
    private int floor;


    public Office(String address, int floorspace, int floor) {
        this.address = address;
        this.floorspace = floorspace;
        this.floor = floor;
    }

    public int getFloorspace() {
        return floorspace;
    }

    public int getFloor() {
        return floor;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public BuildingType getType() {
        return BuildingType.OFFICE;
    }

    @Override
    public int clean() {
        return 100 * floorspace * floor;
    }


}
