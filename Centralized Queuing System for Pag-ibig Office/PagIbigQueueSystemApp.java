public class PagIbigQueueSystemApp {
    public static void main(String[] args) {
        QueuingSystem stationOne = QueuingSystem.getInstance();
        QueuingSystem stationTwo = QueuingSystem.getInstance();
        QueuingSystem stationThree = QueuingSystem.getInstance();
        QueuingSystem monitor = QueuingSystem.getInstance();

        System.out.println("===== PAG-IBIG CENTRALIZED QUEUING SYSTEM =====\n");

        // People getting queue numbers
        stationOne.getNextQueueNumber();
        stationTwo.getNextQueueNumber();
        stationThree.getNextQueueNumber();
        stationOne.getNextQueueNumber();
        stationTwo.getNextQueueNumber();
        stationOne.getNextQueueNumber();

        // Monitor display current number of queue
        System.out.println("\n[Online Monitor] Current Queued: " + monitor.getCurrentQueuedNumber());

        // Serving people
        stationOne.personServed();
        stationTwo.personServed();
        stationThree.personServed();

        // Monitor display current number of queue
        System.out.println("\n[Online Monitor] Now serving number: " + monitor.getPersonServed());

        // Simulate a reset event
        System.out.println("\n--- System Update ---");
        stationOne.resetQueueNumber(4);
        stationOne.updateServingNumber(2);

        // All desks now reflect the updated queue
        stationOne.getNextQueueNumber();
        stationTwo.getNextQueueNumber();
        stationThree.getNextQueueNumber();
        stationOne.personServed();
        stationTwo.personServed();

        // Serving people after reset
        System.out.println("\n[Online Monitor] Current Queued: " + monitor.getCurrentQueuedNumber());
        System.out.println("\n[Online Monitor] Now serving number: " + monitor.getPersonServed());
    }
}
