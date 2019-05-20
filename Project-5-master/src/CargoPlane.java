import java.util.ArrayList;


/**
 * <h1>CargoPlane</h1> Represents a Cargo Plane
 */
public class CargoPlane extends Vehicle {
    final double GAS_RATE = 2.33;


    /**
     * Default Constructor
     */
    //============================================================================
    //TODO
    public CargoPlane() {
        super();
    }
    //============================================================================

    /**
     * Constructor
     *
     * @param licensePlate license plate of vehicle
     * @param maxWeight    maximum weight that the vehicle can hold
     */
    //============================================================================
    //TODO
    public CargoPlane(String licensePlate, double maxWeight) {
        super(licensePlate, maxWeight);
    }
    
    //============================================================================

    /**
     * Overides its superclass method. Instead, after each iteration, the range will
     * increase by 10.
     *
     * @param warehousePackages List of packages to add from
     */
    @Override
    public void fill(ArrayList<Package> warehousePackages) {
    	//TODO
        int range = 0;
        int inc = 10;
        while(!isFull()) {
            for (int i = 0; i < warehousePackages.size(); i++) {
                if(Math.abs(warehousePackages.get(i).getDestination().getzipCode() - getZipDest()) <= range) {
                    addPackage(warehousePackages.get(i));
                    warehousePackages.remove(i);
                }
                range += inc;
            }
        }
        
    }

    /*
     * =============================================================================
     * | Methods from Profitable Interface
     * =============================================================================
     */

    /**
     * Returns the profits generated by the packages currently in the Cargo Plane.
     * <p>
     * &sum;p<sub>price</sub> - (range<sub>max</sub> &times; 2.33)
     * </p>
     */
    @Override
    public double getProfit() {
    	//TODO
        double total = 0;
        for(int i = 0; i < getPackages().size(); i++) {
            total += getPackages().get(i).getPrice();
        }

        total = total - (10 * GAS_RATE);
        return total;
        
    }

    /**
     * Generates a String of the Cargo Plane report. Cargo plane report includes:
     * <ul>
     * <li>License Plate No.</li>
     * <li>Destination</li>
     * <li>Current Weight/Maximum Weight</li>
     * <li>Net Profit</li>
     * <li>Shipping labels of all packages in cargo plane</li>
     * </ul>
     *
     * @return Cargo Plane Report
     */
    @Override
    public String report() {
    	//TODO
       
    }

   
   
}