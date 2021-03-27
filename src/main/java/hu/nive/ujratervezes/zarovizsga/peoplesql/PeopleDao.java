package hu.nive.ujratervezes.zarovizsga.peoplesql;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PeopleDao {

    private DataSource dataSource;

    public PeopleDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public String findIpByName(String firstName, String lastName) {
        String ip_address = "";
        try (Connection connection = dataSource.getConnection()) {
            PreparedStatement statement = connection.prepareStatement("select first_name, last_name, ip_address from people where first_name=? and last_name=? ");
            statement.setString(1, firstName);
            statement.setString(2, lastName);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                ip_address = rs.getString("ip_address");
            }
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Can not read data", sqlException);
        }
        return ip_address;
    }
}
