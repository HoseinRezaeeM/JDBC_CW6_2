package repository;


import employeeadress.EmployessAddress;
import employees.Employees;
import jdbcConnetion.JdbcConnection;

import java.sql.*;

public class EmployeesAddressRepository {

    JdbcConnection jdbcConnection = new JdbcConnection();
    Connection connection = jdbcConnection.getConnection();

    public EmployeesAddressRepository() throws SQLException {
    }

    public void createTable() throws SQLException {
        String sql = "CREATE TABLE employeesaddress (" +
                "addressId serial references employee(addressid)," +
                "city varchar(50)," +
                "street varchar(50)," +
                "postalCode int)";
        Statement statement = connection.createStatement();
        statement.executeUpdate(sql);

    }

    public void select(int employeeNumber) throws SQLException {
        String sql = "SELECT employeesaddress.city ,employeesaddress.street FROM " +
                "employeesaddress inner join employee e on e.addressid = employeesaddress.addressid where employessnumber= ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, employeeNumber);
        ResultSet result = preparedStatement.executeQuery();
        if (result.next()) {
            String city = result.getString("city");
            String street = result.getString("street");
            int postalcode =result.getInt("postalcode");
            System.out.println("Address: " + city + ", " + street+" ,"+postalcode);
        }
    }

        public int Delete(int addressid)throws SQLException {
            String sqll = "DELETE FROM employeesaddress WHERE addressid=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sqll);
            preparedStatement.setInt(1, addressid);
            int result = preparedStatement.executeUpdate();
            return result;
        }





}

