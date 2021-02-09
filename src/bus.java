public class bus extends vehicle {
    bus(String engine, String cool, String dest, int passen ){
        vehicle_type="BUS";
        engine_type=engine.toUpperCase();
        cooling_type=cool.toUpperCase();
        destination=dest.toUpperCase();
        passengers=passen;
        max_limit=20;
        setters a=new setters();
        fare_rate=a.rate_decide(engine_type,cooling_type);
        distance=a.dist_calculator(destination);
        above_max_limit=a.above_slab(max_limit, passengers);
        fare=a.fare_calculator(passengers,fare_rate,above_max_limit,distance);
    }
}
