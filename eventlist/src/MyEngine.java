import eduni.distributions.Negexp;
import eduni.distributions.Normal;

/* Simulate a queueing system with one service point and one queue.
 * The service time is normally distributed with mean 10.
 * The interarrival time is exponentially distributed with mean 15.
 * The simulation runs until the number of arrivals exceeds 1000.
 * The program prints the average waiting time.
 */
public class MyEngine extends Engine {
    private ArrivalProcess arrivalProcess;
    private ServicePoint[] servicePoint;

   public MyEngine() {
        super();
        servicePoint = new ServicePoint[1];     // just an array of one element
        servicePoint[0] = new ServicePoint(new Normal(10, 6), eventList, EventType.DEP);
        arrivalProcess = new ArrivalProcess(new Negexp(15), eventList, EventType.ARR);
    }

    protected void initialize() {
        arrivalProcess.generateNextEvent();
    }

    protected void runEvent(Event e) {
       switch (e.getType()) {
            case ARR:
                servicePoint[0].addToQueue(new Customer());
                arrivalProcess.generateNextEvent();
                break;

            case DEP:
                servicePoint[0].removeFromQueue();
                break;
        }
    }

    protected void tryCEvents() {
        for (ServicePoint sp : servicePoint) {
            if (!sp.isReserved() && sp.isOnQueue()) {
                sp.beginService();
            }
        }
    }

    protected void results() {
        System.out.printf("\nSimulation ended at %.2f\n", Clock.getInstance().getClock());
        System.out.println("Total customers serviced: " + servicePoint[0].getCustomerServiced());
        System.out.printf("Average service time: %.2f\n", servicePoint[0].getMeanServiceTime());
    }
}
