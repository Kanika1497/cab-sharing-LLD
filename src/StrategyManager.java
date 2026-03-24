import java.util.Objects;

public class StrategyManager {
    private static StrategyManager instance;

    public StrategyManager(){}

    public static StrategyManager getInstance(){
        if(instance==null) instance=new StrategyManager();
        return instance;
        //return Objects.requireNonNullElseGet(instance, StrategyManager::new);
    }

    public PricingStrategy getPricingStrategy(TripMetaData data){
        return new DefaultPricingStrategy();
    }

    public DriverMatchingStrategy getDriverMatchingStrategy(TripMetaData data){
        return new NearestDriverStrategy();
    }
}
