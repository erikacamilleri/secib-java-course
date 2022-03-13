package upper.lesson04.logging_system.observer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import upper.lesson04.logging_system.LogEvent;
import upper.lesson04.logging_system.subscriber.LogEventSubscriber;

/**
 * https://www.w3schools.com/java/java_files_create.asp
 */
public class FileWriteObserver implements LogEventObserver {
    protected File logFile;

    public FileWriteObserver() {
      this.logFile = createTodaysLogFile();
    }
    
    private File createTodaysLogFile() {
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date();
        String todaysLogFileName = "log_" + dateFormat.format(date) + ".txt";
        try {
            File logFile = new File("java-ib-sec", todaysLogFileName);
            logFile.createNewFile();
            return logFile;
        } catch (IOException e) {
           // File could not be created
           return null;
        }
    }

    private void writeToLogFile(String log) {
      try {
        FileWriter writer = new FileWriter(this.logFile);
        writer.write(log);
        writer.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

    public void update() {
      if (this.logFile != null) {
        LogEvent event = LogEventSubscriber.getLatestLogEvent();
        this.writeToLogFile(this.adapt(event));
      }
    }

    @SuppressWarnings("unchecked")
    public String adapt(LogEvent e) {
      DateFormat dateFormat = new SimpleDateFormat("[HH:mm:ss]");
      Date date = new Date();
      return dateFormat.format(date) + " " +  e;
    }
}
