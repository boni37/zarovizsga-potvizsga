package hu.nive.ujratervezes.zarovizsga.people;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class People {

    private List<PeopleRecord> peopleRecordList = new ArrayList<>();

    public People() {
    }

    public People(List<PeopleRecord> peopleRecordList) {
        this.peopleRecordList = peopleRecordList;
    }

    public int getNumberOfMales(String path) {
        Path file = Path.of(path);
        try {
            BufferedReader reader = Files.newBufferedReader(file);
            String line;
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] partsOfRecord = line.split(",");
                int id = Integer.parseInt(partsOfRecord[0]);
                String first_name = partsOfRecord[1];
                String last_name = partsOfRecord[2];
                String email = partsOfRecord[3];
                String gender = partsOfRecord[4];
                String ip_address = partsOfRecord[5];
                peopleRecordList.add(new PeopleRecord(id, first_name, last_name, email, gender, ip_address));
            }
            int count = 0;
            for (PeopleRecord people : peopleRecordList) {
                if ("Male".equals(people.getGender())) {
                    count += 1;
                }
            }
            return count;

        } catch (IOException ioe) {
            throw new IllegalStateException("Can not open file", ioe);
        }
    }
}
