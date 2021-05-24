package org.launchcode.codingevents.Data;

import org.launchcode.codingevents.models.Event;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventData {

    private static final Map<Integer, Event> events = new HashMap<>();

    // all events
    public static Collection<Event> getAllEvents() {
        return events.values();
    }

    // single event
    public static Event getSingleEvent(int id) {
        return events.get(id);
    }

    // add event
    public static void addEvent(Event event) {
        events.put(event.getID(), event);
    }

    //remove event
    public static void removeEvent(int id) {
        events.remove(id);
    }

}
