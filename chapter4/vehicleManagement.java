// Create a Vehicle class with:
// - vehicleId
// - brand
// - rentPerDay
// - availableDays

// Requirements:
// 1. Create 8 Vehicle objects.
// 2. Calculate rental costs for different durations.
// 3. Find the vehicle with the highest rent.
// 4. Find the vehicle with the lowest rent.
// 5. Display vehicles available for more than 7 days.
// 6. Update availability after booking.
// 7. Prevent booking when sufficient days are unavailable.
// 8. Calculate total potential rental revenue.
// 9. Sort vehicles by rent.
// 10. Find the second-most-expensive vehicle.

import java.util.Scanner;

class vehicle{
    int vehicleId;
    String brand;
    int rentPerDay;
    boolean avilableDays;
}
public class vehicleManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        vehicle[] v = new vehicle[8];
    
        v[0] = new vehicle();
        v[0].vehicleId = 1;
        v[0].brand = "mahindra";
        v[0].rentPerDay = 500;
        v[0].avilableDays = true;

        v[1] = new vehicle();
        v[1].vehicleId = 2;
        v[1].brand = "maruti";
        v[1].rentPerDay = 300;
        v[1].avilableDays = true;

        v[2] = new vehicle();
        v[2].brand = "kawaski";
        v[2].vehicleId = 3;
        v[2].rentPerDay = 1500;
        v[2].avilableDays = true;

        v[3] = new vehicle();
        v[3].brand = "royal enfild";
        v[3].vehicleId = 4;
        v[3].rentPerDay = 360;
        v[3].avilableDays = true;
        
        v[4] = new vehicle();
        v[4].brand = "hero";
        v[4].vehicleId = 5;
        v[4].rentPerDay = 100;
        v[4].avilableDays = true;
        
        v[5] = new vehicle();
        v[5].brand = "bajaj";
        v[5].vehicleId = 6;
        v[5].rentPerDay = 200;
        v[5].avilableDays = true;
        
        v[6] = new vehicle();
        v[6].brand = "yamaha";
        v[6].vehicleId = 7;
        v[6].rentPerDay = 300;
        v[6].avilableDays = true;

        v[7] = new vehicle();
        v[7].brand = "tvs";
        v[7].vehicleId = 8;
        v[7].rentPerDay = 200;
        v[7].avilableDays = true;
        
        //total rent cost
        System.out.println("Enter the day's you want to rent the vehical");
        int Day = sc.nextInt();
        int totalrentcost = 0;
        vehicle heigestCost = v[0];
        vehicle lowstCosVehicle = v[0];

        for (vehicle i : v ){

            //total rent cost according to day...
             totalrentcost = i.rentPerDay * Day;
             System.out.println(i.brand + " " +totalrentcost );

             //heigest rent cost
             if(heigestCost.rentPerDay < i.rentPerDay){
                heigestCost = i;
             }

             //lowest rent
             if(lowstCosVehicle.rentPerDay > i.rentPerDay){
                lowstCosVehicle = i;
             }
             
        }
        System.out.println(heigestCost.rentPerDay +" " +heigestCost.brand);
        System.out.println(lowstCosVehicle.rentPerDay +" " + lowstCosVehicle.brand);
        
        
        

    
        
    }
}
