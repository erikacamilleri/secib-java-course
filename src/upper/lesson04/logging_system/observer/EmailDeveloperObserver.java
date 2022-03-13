package upper.lesson04.logging_system.observer;

import upper.lesson04.Environment;
import upper.lesson04.logging_system.LogEvent;
import upper.lesson04.logging_system.subscriber.LogEventSubscriber;
import upper.lesson04.mailer.Email;

public class EmailDeveloperObserver implements LogEventObserver {
   
    @SuppressWarnings("unchecked")
    public Email adapt(LogEvent e) {
        Environment environment = Environment.instance();
        return new Email("alerts@mathseries.com", environment.properties.getProperty("alerts.dev.email"), "A L3 error has occurred", e.toString(), false);
    }
    
    public void update() {
        if (LogEventSubscriber.getLatestLogEvent().isLevelThreeError()) {
            Email notifyDevByEmail = this.adapt(LogEventSubscriber.getLatestLogEvent());
            try {
                notifyDevByEmail.send();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}