package hu.nive.ujratervezes.zarovizsga.cleaning;

public class House implements Cleanable {

    String address;
    int area;
    String type;

    public House(String address, int area) {
        this.address = address;
        this.area = area;
        this.type = "House";
    }

    public int getArea() {
        return area;
    }

    public String getType() {
        return type;
    }

    @Override
    public int clean() {
        return area * 80;
    }

    @Override
    public String getAddress() {
        return address + ", ";
    }
}
