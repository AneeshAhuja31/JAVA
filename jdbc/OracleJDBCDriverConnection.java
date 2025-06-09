import java.sql.*;
import java.sql.DriverManager;
public class OracleJDBCDriverConnection {
    public static void main(String []args){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin@localhost:1521.xe","system","password");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM emp");
            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2));
            }
            con.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}