package org.launchcode.codingevents.models;

import java.util.Objects;

public class Event {

    private static int nextId = 1;
    private int ID;
    private String name;
    private String description;

    public Event(String name, String description) {
        this.name = name;
        this.description = description;
        this.ID = nextId;
        nextId++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getID() {
        return ID;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return ID == event.ID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID);
    }
}
