package upper.lesson04.logging_system.observer;

import upper.lesson04.logging_system.LogEvent;
import upper.lesson04.logging_system.subscriber.LogEventSubscriber;

public class ConsolePrintObserver implements LogEventObserver {

    public static final String TEXT_RESET = "\u001B[0m";
    public static final String TEXT_BLUE = "\u001B[34m";
    public static final String TEXT_YELLOW = "\u001B[33m";
    public static final String TEXT_RED = "\u001B[31m";

    public void logErrorToConsole(String message) {
        System.out.println(TEXT_RED + "[LOG_ERROR]" + message + TEXT_RESET);
    }

    public void logWarningToConsole(String message) {
        System.out.println(TEXT_YELLOW + "[LOG_WARNING]" + message + TEXT_RESET);
    }

    public void logInfoToConsole(String message) {
        System.out.println(TEXT_BLUE + "[LOG_INFO]" + message + TEXT_RESET);
    }

    @SuppressWarnings("unchecked")
    public String adapt(LogEvent e) {
        return "::" + e.getEventName() + "::" + e.getEventDescription();
    }

    public void update() {
        LogEvent event = LogEventSubscriber.getLatestLogEvent();
        int level = event.getLevel();
        switch (level) {
            case 1: logInfoToConsole(this.adapt(event));
                    break;
            case 2: logWarningToConsole(this.adapt(event));
                    break;
            case 3: logErrorToConsole(this.adapt(event));
                    break;
            default: logInfoToConsole(this.adapt(event));
        }
    }
}
