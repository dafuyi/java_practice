/**
 * Created by yidafu on 17-4-6.
 */
public class Vehicle {
    public double load;
    public double maxLoad;

    public Vehicle() {

    }

    public Vehicle(double maxLoad) {
        this.maxLoad = maxLoad;
    }

    public double getLoad() {
        return this.load;
    }

    public double getMaxLoad() {
        return this.maxLoad;
    }
}
