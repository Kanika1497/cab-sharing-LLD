public class DefaultPricingStrategy implements PricingStrategy{

    @Override
    public double calculatefare(TripMetaData data) {
        Location source = data.getSource();
        Location destination =data.getDestination();
        double distance= source.distance(destination);

        return distance*10 ;
    }
}
