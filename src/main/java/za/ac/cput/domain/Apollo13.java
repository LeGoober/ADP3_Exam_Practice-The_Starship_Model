package za.ac.cput.domain;

import za.ac.cput.domain.trade.TradeContract;
import za.ac.cput.domain.trade.TradeRoute;

public class Apollo13 {
    /*Creating the attributes of the Entity, all declared private for
    Immutability.

    The process of modelling a domain:
    - with the process of creating an application, they're certain steps
    I want to ingrain into my practice of developing to make it easier to
    follow through on the development, and it involves these steps:
    1. Create the attributes of the domain as private for immutability
    2. Create the Builder inner class and construct the getters of the
    domain with the Builder design pattern
    3. Within the Builder inner class, declare the attributes,
    4. Then configure the setters of the Builder with the attributes
    5. Configure a copy() method that allows me to duplicate the instance
    of the entire object
    6. Then provide a build() method that allows me to construct the entire
    object,
    7. Then finally, create the constructor of the Domain with the Builder
    passed in as a parameter
     */

    // Step 1
    private String ship_id;
    private String ship_model;
    private int capacity;
    private Cargo cargo;
    private TradeRoute route;
    private CrewMember crew_member;
    private Starport home_port;
    @Override
    public String toString() {
        return "Apollo_13: {" +
                "ship_id= " + ship_id + ", \n" +
                "ship_model= " + ship_model + ",\n " +
                "ship_cargo= " + cargo + ", \n" +
                "ship_trade_route= " + route + ",\n " +
                "ship_crew_member= " + crew_member + ", \n" +
                "ship_starport= "+ home_port + "}";
    }
    //Step 7
    private Apollo13(Builder builder) {
        this.ship_id = builder.ship_id;
        this.ship_model = builder.ship_model;
        this.capacity = builder.capacity;
        this.cargo = builder.cargo;
        this.route = builder.route;
        this.crew_member = builder.crew_member;
        this.home_port = builder.home_port;
    }

    //Step 2
    public static class Builder{
        private String ship_id;
        private String ship_model;
        private int capacity;
        private Cargo cargo;
        private TradeRoute route;
        private TradeContract contract;
        private CrewMember crew_member;
        private Starport home_port;

        public String getShipID() {
            return ship_id;
        }

        public String getShipModel() {
            return ship_model;
        }

        public int getCapacity() {
            return capacity;
        }

        public Cargo getCargo() {
            return cargo;
        }

        public TradeRoute getRoute() {
            return route;
        }

        public TradeContract getContract() {
            return contract;
        }

        public CrewMember getCrewMember() {
            return crew_member;
        }

        public Starport getHomePort() {
            return home_port;
        }

        @Override
        public String toString() {
            return "Apollo13: [" +
                    "ship_id= " + ship_id + ", \n" +
                    "ship_model= " + ship_model + ",\n " +
                    "capacity= " + capacity + ", \n" +
                    "cargo= " + cargo + ", \n" +
                    "route= " + route + ", \n" +
                    "contract= " + contract + ", \n" +
                    "]";
        }

        //Step 3, 4
        public Builder setShipID(String ship_id){
            this.ship_id = ship_id;
            return this;
        }
        public Builder setShipModel(String ship_model){
            this.ship_model = ship_model;
            return this;
        }
        public Builder setCapacity(int capacity){
            this.capacity = capacity;
            return this;
        }
        public Builder setCargo(Cargo cargo){
            this.cargo = cargo;
            return this;
        }
        public Builder setRoute(TradeRoute route){
            this.route = route;
            return this;
        }
        public Builder setCrewMember(CrewMember crew_member){
            this.crew_member = crew_member;
            return this;
        }
        public Builder setHomePort(Starport home_port){
            this.home_port = home_port;
            return this;
        }
        //Step 5
        public Builder copy(Apollo13 apollo13){
            this.ship_id = this.ship_id;
            this.ship_model = this.ship_model;
            this.capacity = this.capacity;
            this.cargo = this.cargo;
            this.route = this.route;
            this.crew_member = this.crew_member;
            this.home_port = this.home_port;
            return this;
        }
        //Step 6
        public Apollo13 build(){
            return new Apollo13(this);
        }
    }
}
