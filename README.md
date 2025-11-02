# Centralized Queuing System for Pag-ibig Office

The Pag-ibig office implements a centralized queuing system for three help desk stations. Individuals visiting the office obtain a queue number from this centralized system. Additionally, there's an online monitoring system that displays the current queued number in real-time for individuals monitoring the queue remotely.

Each help desk station has an option to reset the queuing number based on an inputted number, allowing flexibility in managing the queue during specific situations, such as reorganization or technical issues. This queuing system ensures a single centralized queue number for all help desk stations, while the reset option offers control and adjustment in exceptional circumstances.

This approach aims to maintain an organized queuing process for individuals visiting the office and provides the flexibility to handle queue adjustments as needed.

# UML Class Diagram
<img width="544" height="744" alt="singletonPattern_UML_Class_Diagram" src="https://github.com/user-attachments/assets/85dde1e8-feda-4c7a-a8e1-6fb8eeea184e" />

# Components

#### QueuingSystem (Singleton Class)
- ensures only one shared instance manages all queue operations across help desks.

#### getInstance() 
- provides access to the single instance of the QueuingSystem.

#### getNextQueueNumber() 
- issues a new queue number and increments the queued count.

#### personServed()
- updates the system when a person finishes being served, decreases the queued count, and moves to the next serving number.

#### getPersonServed() 
- returns the current person being served.

#### getCurrentQueuedNumber()
- returns the current number of people still waiting in the queue.

#### resetQueue(int newNumber) 
- resets the queue system to a specific number for reorganization or technical adjustments.
