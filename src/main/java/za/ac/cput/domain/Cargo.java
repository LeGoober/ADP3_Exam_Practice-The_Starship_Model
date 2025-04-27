package za.ac.cput.domain;

/*
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
public class Cargo {
    private String cargo_id;
    private double cargo_weight;
    private String cargo_description;
    @Override
    public String toString() {
        return "Cargo: {" +
                "cargo_id= " + cargo_id + ", \n" +
                "cargo_weight= " + cargo_weight + ",\n " +
                "cargo_description= "+ cargo_description + "}";
    }

    private Cargo(Builder builder) {
        this.cargo_id = builder.cargo_id;
        this.cargo_weight = builder.cargo_weight;
        this.cargo_description = builder.cargo_description;
    }

    public class Builder{
        private String cargo_id;
        private double cargo_weight;
        private String cargo_description;

        public Builder setCargoId(String cargo_id){
            this.cargo_id = cargo_id;
            return this;
        }
        public Builder setCargoWeight(double cargo_weight){
            this.cargo_weight = cargo_weight;
            return this;
        }
        public Builder setCargoDescription(String cargo_description){
            this.cargo_description = cargo_description;
            return this;
        }

        public Builder copy(){
            this.cargo_id = cargo_id;
            this.cargo_weight = cargo_weight;
            this.cargo_description = cargo_description;
            return this;
        }
        public Cargo build(Cargo cargo){
            return new Cargo(this);
        }
    }
}
