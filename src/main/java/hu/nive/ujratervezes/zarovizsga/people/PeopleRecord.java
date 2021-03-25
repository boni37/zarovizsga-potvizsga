package hu.nive.ujratervezes.zarovizsga.people;

public class PeopleRecord {

    private int id;
    private String first_name;
    private String last_name;
    private String email;
    private String gender;
    private String ip_address;

    public PeopleRecord(int id, String first_name, String last_name, String email, String gender, String ip_address) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.gender = gender;
        this.ip_address = ip_address;
    }

    public int getId() {
        return id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public String getIp_address() {
        return ip_address;
    }
}
