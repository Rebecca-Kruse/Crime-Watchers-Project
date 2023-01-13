package com.kenzie.capstone.service.model;

import java.util.Objects;

public class ExampleData {
    private final String caseId;
    private final String borough;
    private final String state;
    private final String crimeType;
    private final String description;
    private final String zonedDateTime;;


    public ExampleData(String caseId, String borough, String state, String crimeType, String description, String zonedDateTime) {
        this.caseId = caseId;
        this.borough = borough;
        this.state = state;
        this.crimeType = crimeType;
        this.description = description;
        this.zonedDateTime = zonedDateTime;
    }


    public String getCaseId() {
        return caseId;
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

    public String getDateAndTime() {
        return zonedDateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExampleData that = (ExampleData) o;
        return Objects.equals(caseId, that.caseId) && Objects.equals(crimeType, that.crimeType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(caseId, crimeType);
    }
}
