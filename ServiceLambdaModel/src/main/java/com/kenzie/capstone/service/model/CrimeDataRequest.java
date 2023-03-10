package com.kenzie.capstone.service.model;

import java.util.Objects;

public class CrimeDataRequest {

    String id;
    String borough;
    String state;
    String crimeType;
    String description;

    public CrimeDataRequest(String id, String borough, String state, String crimeType, String description ) {
        this.id = id;
        this.borough = borough;
        this.state = state;
        this.crimeType = crimeType;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public String getBorough() {
        return borough;
    }

    public String getState() {
        return state;
    }

    public String getCrimeType() {
        return crimeType;
    }

    public String getDescription() {
        return description;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setBorough(String borough) {
        this.borough = borough;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCrimeType(String crimeType) {
        this.crimeType = crimeType;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //If the Ids are equal to each other, then we're looking at the same CrimeData
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CrimeData)) return false;
        CrimeData crimeData = (CrimeData) o;
        return getId().equals(crimeData.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
