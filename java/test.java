import java.sql.*;
public class Test {
    public static void main(String[] args){
        try{

            Class.forName("com.cj.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection('url','user','pass');
    

        }
    }
}