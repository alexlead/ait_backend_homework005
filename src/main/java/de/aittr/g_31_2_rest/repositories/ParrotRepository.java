package de.aittr.g_31_2_rest.repositories;

import de.aittr.g_31_2_rest.domain.Parrot;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Repository
public class ParrotRepository implements CrudRepository<Parrot> {

    private final String DB_DRIVER_PATH = "com.mysql.cj.jdbc.Driver";
    private final String DB_ADDRESS = "jdbc:mysql://localhost:3306/";
    private final String DB_NAME = "31_2_parrots";
    private final String DB_USERNAME = "root";
    private final String DB_PASSWORD = "root";


    private Connection getConnection() {
        try {
            Class.forName(DB_DRIVER_PATH);
            String dbUrl = String.format("%s%s?user=%s&password=%s", DB_ADDRESS, DB_NAME, DB_USERNAME, DB_PASSWORD);
            return DriverManager.getConnection(dbUrl);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }


    @Override
    public Parrot save(Parrot parrot) {


        try(Connection connection = getConnection()) {

            String query = String.format(Locale.ROOT,"INSERT INTO parrot (color, weight) VALUES ('%s', %.3f)", parrot.getColor(), parrot.getWeight());
            boolean resultSet = connection.createStatement().execute(query);

            return parrot;

        } catch (Exception e) {
            throw new RuntimeException();
        }


    }

    @Override
    public List<Parrot> getAll() {

        try (Connection connection = getConnection()) {
            String query = "SELECT * FROM parrot";

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            List<Parrot> parrots = new ArrayList<>();

            while (resultSet.next()) {
//                int id = resultSet.getInt(1);  // Get by Column number
                int id = resultSet.getInt("id");  // Get by Column name
                String color = resultSet.getString("color");  // Get by Column name
                double weight = resultSet.getDouble("weight");  // Get by Column name

                parrots.add(new Parrot(id, color, weight));
            }

            return parrots;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Parrot getById(int id) {

        try (Connection connection = getConnection()) {
            String query = String.format("SELECT * FROM parrot WHERE id = %d", id);

            ResultSet resultSet = connection.createStatement().executeQuery(query);

            resultSet.next();

                String color = resultSet.getString("color");  // Get by Column name
                double weight = resultSet.getDouble("weight");  // Get by Column name
                Parrot parrot = new Parrot( id, color, weight);
            return parrot;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(Parrot obj) {

    }

    @Override
    public void deleteById(int id) {
// TODO
    try (Connection connection = getConnection()) {
        String query = String.format("DELETE FROM parrot WHERE id = %d", id);
        boolean resultSet = connection.createStatement().execute(query);

    } catch (Exception e ) {
        throw new RuntimeException();
    }
    }
}
