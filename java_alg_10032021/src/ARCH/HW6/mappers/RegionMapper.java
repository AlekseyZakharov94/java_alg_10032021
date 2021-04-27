package ARCH.HW6.mappers;

import ARCH.HW6.exception.RecordNotFoundException;
import ARCH.HW6.model.Region;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RegionMapper {

    private final Connection connection;

    public RegionMapper(Connection connection) {
        this.connection = connection;
    }

    public Region getById(int id) throws SQLException, RecordNotFoundException {
        PreparedStatement preparedStatement = connection.prepareStatement(
                "SELECT id, country_id, title FROM _regions WHERE id = ?");
        preparedStatement.setInt(1, id);
        try (ResultSet resultSet = preparedStatement.executeQuery()) {
            while (resultSet.next()) {
                Region region = new Region();
                region.setId(resultSet.getInt(1));
                region.setCountryId(resultSet.getInt(2));
                region.setTitle(resultSet.getString(3));
                return region;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        throw new RecordNotFoundException(id);
    }

}
