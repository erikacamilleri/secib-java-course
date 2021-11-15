package upper.lesson04.logging_system.subscriber;

import java.util.ArrayList;

import upper.lesson04.logging_system.LogEvent;
import upper.lesson04.logging_system.observer.LogEventObserver;

public class LogEventSubscriber {

    private ArrayList<LogEventObserver> observers;

    private static LogEvent logEvent;

    public LogEventSubscriber() {
        observers = new ArrayList<LogEventObserver>();
    }

    public static LogEvent getLatestLogEvent() {
        return LogEventSubscriber.logEvent;
    }

    public void attachObserver(LogEventObserver observer) {
        observers.add(observer);
    }
    
    public void notifyAbout(LogEvent logEvent) {
        LogEventSubscriber.logEvent = logEvent; 
        notifyAllObservers();
    }

    private void notifyAllObservers() {
        for(LogEventObserver observer : observers) {
            observer.update();
        }
    }
}
