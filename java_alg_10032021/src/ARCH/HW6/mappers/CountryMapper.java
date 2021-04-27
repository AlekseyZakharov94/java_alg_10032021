package ARCH.HW6.mappers;

import ARCH.HW6.exception.RecordNotFoundException;
import ARCH.HW6.model.Country;
import ARCH.HW6.model.Region;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CountryMapper {
    private final Connection connection;

    public CountryMapper(Connection connection) {
        this.connection = connection;
    }

    public Country getById(int id) throws SQLException, RecordNotFoundException {
        PreparedStatement preparedStatement = connection.prepareStatement(
                "SELECT id, title FROM _countries WHERE id = ?");
        preparedStatement.setInt(1, id);
        try (ResultSet resultSet = preparedStatement.executeQuery()) {
            while (resultSet.next()) {
                Country country = new Country();
                country.setId(resultSet.getInt(1));
                country.setTitle(resultSet.getString(2));
                return country;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        throw new RecordNotFoundException(id);
    }
}
