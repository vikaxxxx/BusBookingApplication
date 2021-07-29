package com.timesinternet.busbooking.entities;

import javax.persistence.*;

@Entity
@Table
public class Bus{
    @Id

    private String busId;
    private String routeId;

    public Bus() {
    }

    public Bus(String busId, String routeId) {
        this.busId = busId;
        this.routeId = routeId;
    }

    public String getBusId() {
        return busId;
    }

    public void setBusId(String busId) {
        this.busId = busId;
    }

    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }
}
