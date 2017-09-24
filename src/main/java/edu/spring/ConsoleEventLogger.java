package edu.spring;

/**
 * Created by Evgeniy on 16.09.2017.
 */
public class ConsoleEventLogger implements EventLogger {

    public void logEvent(Event event) {
        System.out.println(event.toString());
    }
}
