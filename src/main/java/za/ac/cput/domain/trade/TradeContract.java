package za.ac.cput.domain.trade;

import za.ac.cput.domain.Apollo13;
import za.ac.cput.domain.Starport;

public class TradeContract {
    //Defining the instances variables as private for immutability
    private String contract_id;
    private double value;
    private Apollo13 apollo13;
    private Starport starport;

    /*Creating the getters for the object to retrieve its details, still
    having the encapsulation of the object, not able to set any attribute
    values, only retrieve
    */
    public String getContractID() {
        return contract_id;
    }

    public double getValue() {
        return value;
    }

    public Apollo13 getApollo13() {
        return apollo13;
    }

    public Starport getStarport() {
        return starport;
    }

    /*Constructing the toString() method for data retrieval of the
    constructed instance
    * */
    @Override
    public String toString() {
        return "TradeContract_Details: [" +
                "Contract_ID:" + contract_id +
                ",\n Value: " + value +
                ",\n Apollo13: " + apollo13 +
                ", \n Starport: " + starport +"]";
    }

    /*Creating the class constructor, which uses the methods from the
    Builder inner class, so that we still achieve immutability within the
    domain models
    * */
    public TradeContract(Builder builder) {
        this.contract_id = builder.contract_id;
        this.value = builder.value;
        this.apollo13 = builder.apollo13;
        this.starport = builder.starport;
    }

    /*Constructing the Builder inner class for achieving the Builder
    design pattern and achieving class immutability with the class instances
     */
    public class Builder{
        private String contract_id;
        private double value;
        private Apollo13 apollo13;
        private Starport starport;

        //Constructing the Setters using the Builder for immutability
        public Builder setContractID(String contract_id) {
            this.contract_id = contract_id;
            return this;
        }
        public Builder setValue(double value) {
            this.value = value;
            return this;
        }
        public Builder setApollo13(Apollo13 apollo13) {
            this.apollo13 = apollo13;
            return this;
        }
        public Builder setStarport(Starport starport) {
            this.starport = starport;
            return this;
        }

        /*Constructing the copy method for duplicating any data being stored
        within the class, for whenever we then want to duplicate the object
        instance
        * */
        public Builder copy(TradeContract tradeContract) {
            this.contract_id = contract_id;
            this.value = value;
            this.apollo13 = apollo13;
            this.starport = starport;
            return this;
        }

        //Finally calling the Build method within the Builder method so we can construct the objects using the inner class
        public TradeContract build(){
            return new TradeContract(this);
        }
    }
}
