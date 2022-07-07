package uk.ac.serc.customers;
import java.sql.Connection;
import java.util.ArrayList;
import java.sql.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String databaseName = "cf-training-db-server";
        String url = databaseName + ".database.windows.net";
        String database = "northwind";
        String user = "cf_readonly_login";
        String password = "BDtrp7ajxtzoMpF4WN4rGDrfIDAc0xIy";
        String connectionUrl = "jdbc:sqlserver://" + url + ":1433;databaseName=" + database + ";user="+ user + ";password=" + password +";";
    
        System.out.println(connectionUrl);

        ArrayList<Customer> customerArray = new ArrayList<Customer>();
        ArrayList<Employee> employeeArray = new ArrayList<Employee>();

        try {
            // Load SQL Server JDBC driver and establish connection.
            System.out.print("Connecting to SQL Server ... ");
            try (Connection connection = DriverManager.getConnection(connectionUrl)) {
                System.out.println("Done.");

                // READ demo
                System.out.print("Reading data from table, press ENTER to continue...");
                System.in.read();
                String sql = "SELECT * FROM Customers;";
                try (Statement statement = connection.createStatement();
                        ResultSet resultSet = statement.executeQuery(sql)) {
                    while (resultSet.next()) {
                        customerArray.add(new Customer(resultSet.getString("customerID"), 
                        resultSet.getString("companyName"), 
                        resultSet.getString("contactName"), 
                        resultSet.getString("contactTitle"), 
                        resultSet.getString("address"), 
                        resultSet.getString("city"), 
                        resultSet.getString("region"), 
                        resultSet.getString("postalCode"), 
                        resultSet.getString("country"), 
                        resultSet.getString("phone"), 
                        resultSet.getString("fax")));

                       /* 
                        employeeArray.add(new Employee(resultSet.getString("EmployeeID"), 
                        resultSet.getString("lastName"), 
                        resultSet.getString("firstName"), 
                        resultSet.getString("title"), 
                        resultSet.getString("titleOfCourtesy"), 
                        resultSet.getDate("birthDate"), 
                        resultSet.getDate("hireDate"), 
                        resultSet.getString("address"), 
                        resultSet.getString("city"), 
                        resultSet.getString("region"), 
                        resultSet.getString("postalCode"),
                        resultSet.getString("country"), 
                        resultSet.getString("homePhone"), 
                        resultSet.getString("extension"), 
                        resultSet.getInt("reportsTo")));
                        */


                    }
                    for(Customer customer : customerArray){
                        System.out.println(customer.toString());
                    }
                }
                connection.close();
                System.out.println("All done.");
            }
        } catch (Exception e) {
            System.out.println();
            e.printStackTrace();
        }
    }
}
