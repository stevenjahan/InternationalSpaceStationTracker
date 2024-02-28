package com.farhat.steven.InternationalSpaceStation.models;

public class IssLocator {
    //
    private long timestamp;
    private String message;
    private IssPosition iss_position;

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public IssPosition getIss_position() {
        return iss_position;
    }

    public void setIss_position(IssPosition iss_position) {
        this.iss_position = iss_position;
    }

    @Override
    public String toString() {
        return "IssLocator{" +
                "timestamp=" + timestamp +
                ", message='" + message + '\'' +
                ", iss_position=" + iss_position +
                '}';
    }
}
