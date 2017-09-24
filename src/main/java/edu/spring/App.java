package edu.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Collection;
import java.util.Map;

/**
 * Created by Evgeniy on 16.09.2017.
 */
public class App {

    private Client client;

    private EventLogger eventLogger;

    private Map<EventType, EventLogger> loggers;

    public App(Client client, EventLogger eventLogger, Map<EventType, EventLogger> loggers) {
        this.client = client;
        this.eventLogger = eventLogger;
        this.loggers = loggers;
    }

    public App() {
    }

    public static void main(String[] args) {

        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

        App app = (App) ctx.getBean("app");

        app.eventLogger.logEvent("Some event for user 1");

        ctx.close();
    }

    private void logEvent (EventType type, String msg){
        EventLogger logger = loggers.get(type);
        if(logger == null){
            logger = defaultLogger;
        }
        eventLogger.logEvent(event);
    }

}
