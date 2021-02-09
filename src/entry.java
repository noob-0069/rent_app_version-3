import java.util.Scanner;
public class entry {
    public static void main(String[] args){
        //take inputs from the user
        Scanner lol= new Scanner(System.in);

        System.out.println("Enter the type  of vehicle");
        String vehicle_type=lol.nextLine();

        System.out.println("Enter the engine type--Diesel or Petrol");
        String engine_type=lol.nextLine();

        System.out.println("Enter the cooling type--AC or NAC");
        String cool_type=lol.nextLine();

        System.out.println("Enter the Destination");
        String destination=lol.nextLine();

        System.out.println("Enter the number of passengers");
        int passengers=lol.nextInt();

        //magic class is where abstraction is implemented..give the parameters and i will make object magically
        magic a= new magic(vehicle_type.toUpperCase(), engine_type.toUpperCase(), cool_type.toUpperCase(), destination.toUpperCase(),passengers);
        //also just making object will give fare...
    }
}
