import java.util.HashMap;
import java.util.Map;

public class RiderManager {
    private static RiderManager instance;
    private final Map<String,Rider> riders=new HashMap<>();

    public RiderManager(){}

    public RiderManager getInstance(){
        if(instance ==null){
            return new RiderManager();
        }
        else {
            return instance;
        }
    }

    public void addRider(Rider rider){
        riders.put(rider.getId(),rider);
    }
    public Rider getRider(String id){
        return riders.get(id);
    }

}
