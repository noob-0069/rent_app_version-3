//the parent class where the layout ogf vehicle is defined along with the location where this vehicle is going
public class vehicle {
    public String vehicle_type, engine_type, cooling_type, destination;
    public int passengers;
    public int max_limit, fare_rate, above_max_limit;
    public double fare;
    public int distance;
    public String get_vehicle(){
        String s="The type is-"+vehicle_type+" ,the engine is-"+engine_type+" and the cooling type is-"+cooling_type;
        return s;
    }
    public int get_fare_rate(){
        return fare_rate;
    }
    public int get_max_limit(){
        return max_limit;
    }
    public int get_above_max_limit(){
        return above_max_limit;
    }
    public double get_fare(){
        return fare;
    }


}
