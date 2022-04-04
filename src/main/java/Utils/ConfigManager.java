package Utils;


import Helpers.POST_Method_Helper;
import io.github.cdimascio.dotenv.Dotenv;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import java.io.File;
import java.io.FileInputStream;
import java.sql.*;
import java.util.Date;
import java.util.Properties;


public class ConfigManager {

    public static Properties Pro;
    public static String BASE_URL = null;
    public static String BASE_URL_Teachers = null;


    public ConfigManager(){

        BASE_URL = System.getenv("Base_URL");
        BASE_URL_Teachers = valueForTheGivenKey("BaseURL_Teachers");
    }

    public static String valueForTheGivenKey(String name) {

        File file = new File(System.getProperty("user.dir")+"/resources/config.properties");

        FileInputStream fis;
        try {
            fis = new FileInputStream(file);
            Pro = new Properties();
            Pro.load(fis);
        } catch (Exception e) {
            System.out.println("Error Message is --- " + e.getMessage());
        }

        return Pro.getProperty(name);
    }

    public String _generateToken()
    {
        return POST_Method_Helper.EmailSignIn().jsonPath().getString("token");

    }

    public String getNextDay()
    {
        Date dt = new Date();

        DateTime dtOrg = new DateTime(dt);
        DateTime dtPlusOne = dtOrg.plusDays(1);

        return StringUtils.substringBefore(dtPlusOne.toString(), "T");
    }

    public Object _getResult(String Query, String DateType, String Column){

        Object Data = null;

        try {
            Connection dbConnection = DriverManager
                    .getConnection(System.getenv("DB_CONNECTIONURL")+"/?serverTimezone=UTC&characterEncoding=utf-8&useSSL=false",System.getenv("DB_USERNAME"),System.getenv("DB_PASSWORD"));
            Statement stmt = dbConnection.createStatement();

            if(stmt.execute(Query))
            {
                ResultSet rs = stmt.executeQuery(Query);

                while (rs.next()) {

                    switch (DateType) {
                        case "int":
                            Data = rs.getInt(Column);
                            break;

                        case "String":
                            Data = rs.getString(Column);
                            break;
                    }
                }

            }

            dbConnection.close();
        } catch (SQLException e) {
            System.out.println("database-ConnectionError: " + e);
            System.exit(0);
        }

        return Data;

    }

}
