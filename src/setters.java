import java.util.HashMap;

public class setters {
    HashMap<String , Integer> dist_map;
    setters(){
        dist_map.put("MUMBAI",100);
        dist_map.put("MUKERIAN",3000);
    }
    public int rate_decide(String engine_type, String cool_type){
        if(engine_type.equals("DIESEL") && cool_type.equals("AC")) return 16;
        else if(engine_type.equals("DIESEL") && cool_type.equals("NAC")) return 14;
        else if(engine_type.equals("PETROL") && cool_type.equals("AC")) return 17;
        else if(engine_type.equals("PETROL") && cool_type.equals("NAC")) return 15;
        else return 0;
    }
    public int above_slab(int max_limit, int passengers){
        if(passengers>max_limit) return passengers-max_limit;
        else return 0;
    }
    public int dist_calculator(String destination){

        return dist_map.get(destination);
    }
    public double fare_calculator(int passengers, int fare_rate, int pass_above_slab,int distance){
        return fare_rate*1.0*passengers + pass_above_slab*distance;
    }
}
