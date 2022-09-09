import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try {
            String dburl = "jdbc:mysql://localhost:3306/test";
            String username = "admas";
            String password = "Pa$$w0rd121921";

            Connection myConnection = DriverManager.getConnection(dburl,username,password);
            Statement myStatement = myConnection.createStatement();

            ResultSet myResultSet = myStatement.executeQuery("select * from person");
            System.out.println("id\tfName\tlName");
            while(myResultSet.next()) {
                System.out.println(myResultSet.getString("id")
                        + "\t" + myResultSet.getString("fName")
                        + "\t" + myResultSet.getString("lName"));
            }
        } catch (SQLException e) {
            System.out.println("Connection Failed!!!");
        }
    }
}