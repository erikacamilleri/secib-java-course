package upper.lesson05.record;

import java.io.File;
import java.io.RandomAccessFile;

public abstract class BaseEntityRecord {

    private final String DIR = "java-ib-sec/database";

    protected final String DELIMITER = ";";

    protected abstract String getFileName();

    protected abstract int getRecordSize();

    protected abstract String serialize();

    public int getLastRecordId() {
        File readFrom = new File(DIR, this.getFileName());
        try {
            RandomAccessFile raf = new RandomAccessFile(readFrom, "r");
            int pos = (int) raf.length();
            raf.close();
            return pos / (getRecordSize() + 2);
        } catch (Exception e) {
            return 0;
        }
    }

    public void insert() {
        File writeTo = new File(DIR, this.getFileName());
        try {
            RandomAccessFile raf = new RandomAccessFile(writeTo, "rw");
            long pos = raf.length();
            raf.seek(pos);
            raf.write(serialize().getBytes());
            raf.writeBytes(System.getProperty("line.separator"));
            raf.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update(int id) {
        File writeTo = new File(DIR, this.getFileName());
        try {
            RandomAccessFile raf = new RandomAccessFile(writeTo, "rw");
            long pos = (id - 1) * (getRecordSize() + 2);
            raf.seek(pos);
            raf.write(serialize().getBytes());
            raf.writeBytes(System.getProperty("line.separator"));
            raf.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(int id) {
        File writeTo = new File(DIR, this.getFileName());
        try {
            RandomAccessFile raf = new RandomAccessFile(writeTo, "rw");
            long pos = (id - 1) * (getRecordSize() + 2);
            raf.seek(pos);
            byte[] emptyLine = new byte[getRecordSize() + 2];
            raf.write(emptyLine);
            raf.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String read(int id) {
        File readFrom = new File(DIR, this.getFileName());
        try {
            RandomAccessFile raf = new RandomAccessFile(readFrom, "r");
            long pos = (id - 1) * (getRecordSize() + 2);
            raf.seek(pos);
            String data = raf.readLine();
            raf.close();
            return data;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void delete() {

    }

    public void update() {

    }
}
