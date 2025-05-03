package za.ac.cput.domain.trade;

public class TradeRoute {
    private String route_id;
    private String destination;
    private double distance;

    @Override
    public String toString() {
        return "TradeRoute [route_id=" + route_id + ", destination=" + destination + ", distance=" + distance + "]";
    }

    private TradeRoute(Builder builder) {
        this.route_id = builder.route_id;
        this.destination = builder.destination;
        this.distance = builder.distance;
    }

    public class Builder{
        private String route_id;
        private String destination;
        private double distance;

        public Builder setRouteID(String route_id){
            this.route_id = route_id;
            return this;
        }
        public Builder setDestination(String destination){
            this.destination = destination;
            return this;
        }
        public Builder setDistance(double distance){
            this.distance = distance;
            return this;
        }

        public Builder copy(TradeRoute route){
            this.route_id = this.route_id;
            this.destination = this.destination;
            this.distance = this.distance;
            return this;
        }
        public TradeRoute build(){
            return new TradeRoute(this);
        }
    }
}
