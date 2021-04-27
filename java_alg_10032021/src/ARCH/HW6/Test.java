package ARCH.HW6;

import ARCH.HW6.exception.RecordNotFoundException;
import ARCH.HW6.mappers.CityMapper;
import ARCH.HW6.mappers.CountryMapper;
import ARCH.HW6.mappers.RegionMapper;
import ARCH.HW6.model.City;
import ARCH.HW6.model.Country;
import ARCH.HW6.model.Region;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test {

    private static final String URL = "jdbc:mysql://localhost:3306/geodata";
    private static final String USER = "root";
    private static final String PASSWORD = "123456789";

    private static Connection connection;

    public static void main(String[] args) {
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            CityMapper cityMapper = new CityMapper(connection);
            CountryMapper countryMapper = new CountryMapper(connection);
            RegionMapper regionMapper = new RegionMapper(connection);

            City city = cityMapper.getById(1);
            Country country = countryMapper.getById(1);
            Region region = regionMapper.getById(875);

            System.out.println(city.getTitle());
            System.out.println(country.getTitle());
            System.out.println(region.getTitle());

        }catch (SQLException | RecordNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
