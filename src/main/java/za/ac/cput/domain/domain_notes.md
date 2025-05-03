# The Process of Domain Modelling


#### Constructing an Object using the Builder design pattern

```java
    import za.ac.cput.domain.Apollo13;

Apollo13 apollo13_spacesip = new Apollo13.Builder()
        .setShipID()
        .setShipModel()
        .setCapacity()
        .setCargo()
        .setRoute()
        .build();
```