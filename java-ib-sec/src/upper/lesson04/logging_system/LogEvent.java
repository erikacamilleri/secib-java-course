package upper.lesson04.logging_system;

public class LogEvent {

    final int LEVEL_INFO = 1;
    final int LEVEL_WARN = 2;
    final int LEVEL_ERROR = 3;

    protected int level;
    
    protected String eventName;
    
    protected String eventDescription;

    protected String other;

    public LogEvent(int level, String eventName) {
        this.level = level;
        this.eventName = eventName;
    }

    public LogEvent(int level, String eventName, String eventDescription, String other) {
        this.level = level;
        this.eventName = eventName;
        this.eventDescription = eventDescription;
        this.other = other;
    }

    public int getLevel() {
        return this.level;
    }

    public String getEventName() {
        return this.eventName;
    }

    public String getEventDescription() {
        return this.eventDescription;
    }

    public boolean isLevelThreeError() {
        return (this.level == LEVEL_ERROR);
    }

    @Override
    public String toString() {
        return "[LEVEL" + this.level + "] ::" + this.eventName + ":: " + this.eventDescription;
    }
}
