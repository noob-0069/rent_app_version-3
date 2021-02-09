public class bike extends vehicle{
    bike(String engine, String cool, String dest, int passen ){
        //simple constructor and since we inherits vehicle class no need to write functions here
        vehicle_type="BIKE";
        engine_type=engine;
        cooling_type=cool;
        destination=dest;
        passengers=passen;
        max_limit=2;

        //to make code reusable we made setter class
        setters a=new setters();
        fare_rate=a.rate_decide(engine_type,cooling_type);
        distance=a.dist_calculator(destination);
        above_max_limit=a.above_slab(max_limit, passengers);
        fare=a.fare_calculator(passengers,fare_rate,above_max_limit,distance);
    }
}
