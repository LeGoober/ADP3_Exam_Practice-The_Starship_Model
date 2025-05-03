package za.ac.cput.factory;

import za.ac.cput.domain.Apollo13;
import za.ac.cput.domain.Cargo;
import za.ac.cput.domain.CrewMember;
import za.ac.cput.domain.Starport;
import za.ac.cput.domain.trade.TradeRoute;
import za.ac.cput.util.Helper;

public class Apollo13Factory {
    public static Apollo13
    createApollo13(String ship_id,
                   String ship_model,
                   int capacity,
                   Cargo cargo,
                   TradeRoute trade_route,
                   CrewMember crew_member,
                   Starport starport) {
        //Checking whether the ship_id is null or empty
        if(Helper.isNullOrEmpty(ship_id)){
            return null;
        }
        //Checking whether the ship id is null or empty
        if(Helper.isValidShipID(ship_id)){
            return null;
        }
        //Checking whether the ship's capacity is null or does it exceeds the 1 megaton requirement
        if(Helper.isValidCargoWeight(cargo)){
            return null;
        }

        return new Apollo13.Builder()
                .setShipID(ship_id)
                .build();
    }
}
