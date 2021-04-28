package hu.nive.ujratervezes.zarovizsga.cleaning;

import java.util.ArrayList;
import java.util.List;

public class CleaningService {

    List<Cleanable> service = new ArrayList<>();

    public CleaningService() {
    }


    public void add(Cleanable cleanable) {
        service.add(cleanable);
    }

    public List<Cleanable> getCleanables() {
        return service;
    }

    public int cleanAll() {
        int costOfCleanining = 0;
        List<Cleanable> removable = new ArrayList<>();
        for (Cleanable cleanable : service) {
            costOfCleanining += cleanable.clean();
            removable.add(cleanable);
        }
        service.removeAll(removable);
        return costOfCleanining;
    }

    public int cleanOnlyOffices() {
        int costOfCleanining = 0;
        List<Cleanable> removable = new ArrayList<>();
        for (Cleanable cleanable : service) {
            if (cleanable.getType().equals("Office")) {
                costOfCleanining += cleanable.clean();
                removable.add(cleanable);
            }
        }
        service.removeAll(removable);
        return costOfCleanining;
    }

    public List<Cleanable> findByAddressPart(String address) {
        List<Cleanable> removable = new ArrayList<>();
        for (Cleanable cleanable : service) {
            if (cleanable.getAddress().contains(address)) {
                removable.add(cleanable);
            }
        }
        return removable;
    }

    public String getAddresses() {
        StringBuilder sb = new StringBuilder();
        for (Cleanable cleanable : service) {
            sb.append(cleanable.getAddress());
        }
        return sb.substring(0, sb.toString().length() - 2);
    }
}
