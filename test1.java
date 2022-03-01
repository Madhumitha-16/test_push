import java.sql.*;
public class test {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/Eb_Bill";
        String username="root";
        String password="23.11.2002root";
    

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection= DriverManager.getConnection(url,username,password);

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from tblEmployee");

            while(resultSet.next()){
                System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2));
            }

        } catch (Exception e) {
            System.out.println(e);
        }
      
    } 
}
