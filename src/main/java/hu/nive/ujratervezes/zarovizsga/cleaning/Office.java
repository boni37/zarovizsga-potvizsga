package hu.nive.ujratervezes.zarovizsga.cleaning;

public class Office implements Cleanable {

    String address;
    int area;
    int level;
    String type;

    public Office(String address, int area, int level) {
        this.address = address;
        this.area = area;
        this.level = level;
        this.type = "Office";
    }

    public int getArea() {
        return area;
    }

    public int getLevel() {
        return level;
    }

    public String getType() {
        return type;
    }

    @Override
    public int clean() {
        return area * level * 100;
    }

    @Override
    public String getAddress() {
        return address + ", ";
    }
}
