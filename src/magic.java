public class magic {
    magic(String vehicle_type, String engine_type, String cool_type, String destination, int passengers){
        if(vehicle_type.equals("BUS")){
            bus a=new bus(engine_type,cool_type,destination,passengers);
            System.out.println("THE TOTAL COST TO BE INCURRED IS--"+a.fare);
        }
        if(vehicle_type.equals("SUV")){
            suv a=new suv(engine_type,cool_type,destination,passengers);
            System.out.println("THE TOTAL COST TO BE INCURRED IS--"+a.fare);
        }
        if(vehicle_type.equals("BIKE")){
            bike a=new bike(engine_type,cool_type,destination,passengers);
            System.out.println("THE TOTAL COST TO BE INCURRED IS--"+a.fare);
        }
    }
}
