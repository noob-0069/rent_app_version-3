import java.util.HashMap;
//setter class is where computation of various parameters is done
public class setters {
    public HashMap<String, Integer> dist_map=new HashMap<>();
    setters(){
        // keep on adding distances to expand the network
        dist_map.put("MUMBAI",100);
        dist_map.put("DELHI",2000);
    }
    //returns the rate per kilometer when you give engine type and cool type
    public int rate_decide(String engine_type, String cool_type){
        //in case new engine type develops then add new conditions like electric vehicle

        if(engine_type.equals("DIESEL") && cool_type.equals("AC")) return 16;
        else if(engine_type.equals("DIESEL") && cool_type.equals("NAC")) return 14;
        else if(engine_type.equals("PETROL") && cool_type.equals("AC")) return 17;
        else if(engine_type.equals("PETROL") && cool_type.equals("NAC")) return 15;
        else return 0;
    }

    //return passengers above max limit when you give total passengers and max limit of vehicle
    public int above_slab(int max_limit, int passengers){
        if(passengers>max_limit) return passengers-max_limit;
        else return 0;
    }

    //from the hashmap finds the distance of destination in O(1)
    public int dist_calculator(String destination){
        return dist_map.get(destination);
    }
    //calculate the fare when you give passengers, fare rate, passengers above slab and distance
    public double fare_calculator(int passengers, int fare_rate, int pass_above_slab,int distance){
        return 2.0*(fare_rate*distance + pass_above_slab*distance);
    }
}
