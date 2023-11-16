import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Random;

public class EventList {
    private PriorityQueue<Event> evenList;

    public EventList() {
        evenList = new PriorityQueue<>();
    }

    public void add(Event e) {
        System.out.println("Adding to the event list " + e.getType() + " " + e.getTime());
        evenList.add(e);
    }

    public Event remove() {
        if (evenList.isEmpty())
            return null;

        System.out.println("Removing from the event list " + evenList.peek().getType() + " " + evenList.peek().getTime());
        return evenList.remove();
    }

    public void print() {
        Object[] tmp = evenList.toArray();
        Arrays.sort(tmp);
        for (Object e : tmp)
            System.out.println(e);
    }

    public static void main(String[] args) {
        EventList eventList = new EventList();
        Random random = new Random();

        // generate events
        for (int i = 0; i < 10; i++) {
            EventType type;
            if (random.nextBoolean())
                type = EventType.ARR;
            else
                type = EventType.DEP;
            eventList.add(new Event(type, random.nextInt(1000)));
        }

        // remove the first event to be processed
        System.out.println("Event removed: " + eventList.remove());

        // finally print the whole event list
        eventList.print();
    }
}
