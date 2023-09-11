package repository;

import employees.Employees;
import jdbcConnetion.JdbcConnection;

import java.sql.*;

public class EmployessRepository {

    JdbcConnection jdbcConnection = new JdbcConnection();
    Connection connection = jdbcConnection.getConnection();

    public EmployessRepository() throws SQLException {
    }

    public void createTable() throws SQLException {
        String sql = "CREATE TABLE employee(" +
                "employessNumber serial," +
                "firstName varchar(50)," +
                "lastName varchar(50)," +
                "officeCode int," +
                "addressId serial primary key)";
        Statement statement = connection.createStatement();
        statement.executeUpdate(sql);

    }

    public int save(Employees employees) throws SQLException {
        String add = "INSERT INTO employee(firstname, lastname, officecode) VALUES (?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(add);
        preparedStatement.setString(1, employees.getFirstName());
        preparedStatement.setString(2, employees.getLastName());
        preparedStatement.setInt(3, employees.getOfficeCode());
        int result = preparedStatement.executeUpdate();
        return result;
    }
    public int Update(int officecode ,int addressid) throws SQLException{
        String sql="UPDATE employee SET officecode=? where addressid=?";
        PreparedStatement preparedStatement=connection.prepareStatement(sql);
        preparedStatement.setInt(1,officecode);
        preparedStatement.setInt(2,addressid);
        int result = preparedStatement.executeUpdate();
        return result;

    }

    public int Delete(int employessnumber)throws SQLException{
        String sql="DELETE FROM employee WHERE addressid=?";
        PreparedStatement preparedStatement=connection.prepareStatement(sql);
        preparedStatement.setInt(1,employessnumber);
        int result=preparedStatement.executeUpdate();
        return result;
    }





}
