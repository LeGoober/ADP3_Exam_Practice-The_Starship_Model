package za.ac.cput.domain;

public class Starport {
    private String port_id;
    private String port_location;
    private int docking_capacity;

    public String getPortID() {
        return port_id;
    }

    public int getDockinCapacity() {
        return docking_capacity;
    }

    public String getPortLocation() {
        return port_location;
    }

    @Override
    public String toString() {
        return "Starport_Details: [" +
                "Port_ID: " + port_id + ", \n" +
                "Port_Location: " + port_location + ", \n" +
                "Docking_Capacity: " + docking_capacity + "]";
    }

    //Creating the Contstructor of the Starport using the Builder
    public Starport(Builder builder) {
        this.port_id = builder.port_id;
        this.port_location = builder.port_location;
        this.docking_capacity = builder.docking_capacity;
    }

    public class Builder{
        private String port_id;
        private String port_location;
        private int docking_capacity;

        public Builder setPortID(String port_id){
            this.port_id = port_id;
            return this;
        }
        public Builder setPortLocation(String port_location){
            this.port_location = port_location;
            return this;
        }
        public Builder setDockingCapacity(int docking_capacity){
            this.docking_capacity = docking_capacity;
            return this;
        }

        public Builder copy(Starport starport){
            this.port_id = port_id;
            this.port_location = port_location;
            this.docking_capacity = docking_capacity;
            return this;
        }

        public Starport build(){
            return new Starport(this);
        }
    }
}
