import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DriverManager {
    private static DriverManager instance ;
    private final Map<String , Driver> drivers=new HashMap<>();
    public DriverManager (){}

    public static DriverManager getInstance(){
        if(instance==null){
            return instance = new DriverManager();
        }

            return instance;

    }

    public void addDrivers(Driver driver){
        if(driver ==null) throw new IllegalArgumentException("No Driver Found to be added !");
        else{
            drivers.put(driver.getId(),driver);
        }
    }

    public List<Driver> availableDriver(){
        return drivers.values().stream().filter(Driver::isAvailable).toList();
    }

}
