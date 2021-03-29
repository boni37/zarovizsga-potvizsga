package hu.nive.ujratervezes.zarovizsga.cleaning;

public class House implements Cleanable {

    private String address;
    private int floorspace;


    public House(String address, int floorspace) {
        this.address = address;
        this.floorspace = floorspace;
    }


    public int getFloorspace() {
        return floorspace;
    }

    @Override
    public int clean() {
        return 80 * floorspace;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public BuildingType getType() {
        return BuildingType.HOUSE;
    }
}
