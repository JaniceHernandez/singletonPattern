public class QueuingSystem {
    private static QueuingSystem instance;
    private int nextQueueNumber; // Next available queue number
    private int currentServingNumber; // Current number being served

    private QueuingSystem() {
        nextQueueNumber = 0;
        currentServingNumber = 0;
    }

    public static QueuingSystem getInstance() {
        if (instance == null) {
            instance = new QueuingSystem();
        }
        return instance;
    }

    public synchronized int getNextQueueNumber() {
        nextQueueNumber++;
        System.out.println("Issuing Queue Number: " + nextQueueNumber);
        return nextQueueNumber;
    }

    // Person at currentServing finishes → move to next
    public synchronized void personServed() {
        if (currentServingNumber < nextQueueNumber) {
            currentServingNumber++;
        } else {
            System.out.println("No one is in queued.");
        }
    }

    public int getCurrentQueuedNumber() {
        return nextQueueNumber;
    }

    public int getPersonServed() {
        return currentServingNumber;
    }

    public void resetQueueNumber(int newNumber) {
        nextQueueNumber = newNumber;
        System.out.println("Queue has been reset to: " + newNumber);
    }

    public void updateServingNumber(int newNumber) {
        currentServingNumber = newNumber;
    }
}
