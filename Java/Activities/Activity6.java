package Activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Plane {
    private List<String> passengers;
    private int maxPassengers;
    private Date lastTimeTookOf;
    private Date lastTimeLanded;
    
    public Plane(int maxPassengers) {
        this.maxPassengers = maxPassengers;
        this.passengers = new ArrayList<>();
    }

    public void onboard(String passenger) {
        this.passengers.add(passenger);
    }

    public Date takeOff() {
        this.lastTimeTookOf = new Date();
        return lastTimeTookOf;
    }

    public void land() {
        this.lastTimeLanded = new Date();
        this.passengers.clear();
    }

    public Date getLastTimeLanded() {
        return lastTimeLanded;
    }

    public void offboard(String passenger) {
        this.passengers.add(passenger);
    }
    
    public List<String> getPassengers() {
        return passengers;
    }
    
}

public class Activity6 {

    public static void main(String[] args) throws InterruptedException {
        //There is a plane with max 10 passengers
        Plane plane = new Plane(10);
        //Add passengers on the list
        plane.onboard("Suman");
        plane.onboard("Priyanka");
        plane.onboard("Sulekha");
        plane.onboard("Shraddha");
        plane.onboard("Priyam");
        //Plane takes off
        System.out.println("Plane took off at: " + plane.takeOff());
        //Print list of people on board
        System.out.println("People on the plane: " + plane.getPassengers());
        //Flying.....
        Thread.sleep(5000);
        //Plane has landed
        plane.land();
        //Plane lands
        System.out.println("Plane landed at: " + plane.getLastTimeLanded());
        plane.offboard("Suman");
        plane.offboard("Priyanka");
        plane.offboard("Sulekha");
        plane.offboard("Shraddha");
        plane.offboard("Priyam");        
        System.out.println("People on the plane after landing: " + plane.getPassengers());
    }
		
}
