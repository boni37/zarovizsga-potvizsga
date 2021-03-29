package hu.nive.ujratervezes.zarovizsga.cleaning;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CleaningService {

    List<Cleanable> cleanables = new ArrayList<>();

    public CleaningService() {
    }

    public CleaningService(List<Cleanable> cleanables) {
        this.cleanables = cleanables;
    }

    public int cleanAll() {
        int price = 0;
        for (Cleanable actual : cleanables) {
            price += actual.clean();
        }
        cleanables.clear();
        return price;
    }


    public List<Cleanable> getCleanables() {
        return cleanables;
    }

    public int cleanOnlyOffices() {
        int price = 0;
        Iterator<Cleanable> iterator = cleanables.iterator();
        while (iterator.hasNext()) {
            Cleanable cleanable = iterator.next();
            if (cleanable.getType() == BuildingType.OFFICE) {
                price += cleanable.clean();
                iterator.remove();
            }
        }
        return price;
    }

    public List<Cleanable> findByAddressPart(String addressPart) {
        List<Cleanable> result = new ArrayList<>();
        for (Cleanable cleanable : cleanables) {
            if (cleanable.getAddress().contains(addressPart)) {
                result.add(cleanable);
            }
        }
        return result;
    }

    public String getAddresses() {
        StringBuilder sb = new StringBuilder();
        sb.append(cleanables.get(0).getAddress());
        for (int i = 1; i < cleanables.size(); i++) {
            sb.append(", ");
            sb.append(cleanables.get(i).getAddress());
        }
        return sb.toString();
    }

    public void add(Cleanable cleanable) {
        cleanables.add(cleanable);
    }
}
