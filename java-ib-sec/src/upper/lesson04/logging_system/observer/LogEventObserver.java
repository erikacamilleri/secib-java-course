package upper.lesson04.logging_system.observer;

import upper.lesson04.logging_system.LogEvent;

public interface LogEventObserver<T> {
    
    public T adapt(LogEvent e);

    public void update();
}