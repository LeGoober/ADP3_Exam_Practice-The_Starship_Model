package za.ac.cput.util;

import za.ac.cput.domain.Cargo;
import za.ac.cput.domain.trade.TradeContract;

public class Helper {
    /*Constructing a function that checks whether string parameters
    passed into the factory aren't null
    * */
    public static boolean isNullOrEmpty(String str) {
        if(str.isEmpty() || str.equals("null") || str == null){
            return true;
        }
        else return false;
    }
    /*Constructing a function that checks whether Ship id that is
    passed into the factory aren't null
    * */
    public static boolean isValidShipID(String ship_id){
        if(ship_id.isEmpty() || ship_id.equals("")){
            return true;
        }
        else return false;
    }

    public static boolean isValidCargoWeight(Cargo weight){
        //TODO
        return true;
    }

    public static boolean isValidCrewID(String crew_id){
        if(crew_id.isEmpty() || crew_id.equals("")){
            return true;
        }
        else return false;
    }

    public static boolean isValidPortID(String port_id){
        //TODO
        throw new UnsupportedOperationException();
    }
    public static boolean isValidContractID(TradeContract contract){
        //TODO
        throw new UnsupportedOperationException();
    }

    //Configuring the regex for the ship login
    public static boolean isValidLogin(String login){
        throw new UnsupportedOperationException();
    }
}
