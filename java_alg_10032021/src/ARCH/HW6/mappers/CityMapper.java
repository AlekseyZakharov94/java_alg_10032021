package ARCH.HW6.mappers;

import ARCH.HW6.exception.RecordNotFoundException;
import ARCH.HW6.model.City;
import ARCH.HW6.model.Region;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CityMapper {
    private final Connection connection;

    public CityMapper(Connection connection) {
        this.connection = connection;
    }

    public City getById(int id) throws SQLException, RecordNotFoundException {
        PreparedStatement preparedStatement = connection.prepareStatement(
                "SELECT id, country_id, important, region_id, title FROM _cities WHERE id = ?");
        preparedStatement.setInt(1, id);
        try (ResultSet resultSet = preparedStatement.executeQuery()) {
            while (resultSet.next()) {
                City city = new City();
                city.setId(resultSet.getInt(1));
                city.setCountryId(resultSet.getInt(2));
                city.setImportant(resultSet.getInt(3));
                city.setRegionId(resultSet.getInt(4));
                city.setTitle(resultSet.getString(5));
                return city;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        throw new RecordNotFoundException(id);
    }
}
