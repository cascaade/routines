package org.example;

public class Utils {
    public enum EventType {
        WEB_VISIT,
        WEB_BUTTON_CLICK
    }

    public record Event(
        EventType eventType,
        long timestamp,
        String d1,
        String d2
    ) {}
}
