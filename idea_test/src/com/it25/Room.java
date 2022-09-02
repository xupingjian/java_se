package com.it25;

import com.it312am.Customer;

import java.util.Objects;

public class Room {
    private double id;
    private String type;
    private boolean statue;

    public Room() {

    }

    public Room(double id, String type, boolean statue) {
        this.id = id;
        this.type = type;
        this.statue = statue;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isStatue() {
        return statue;
    }

    public void setStatue(boolean statue) {
        this.statue = statue;
    }


    public String toString(){
        return "["+id+","+type+","+(statue ? "空闲":"占用")+"]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return Double.compare(room.id, id) == 0 && statue == room.statue && Objects.equals(type, room.type);
    }


}
