package upper.lesson05.record;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public abstract class AbstractEntityFile<T> {

    private final String DIR = "java-ib-sec/database";

    protected final String DELIMITER = ";";

    /**
     * ------ Internal File Methods -----------------------------------------------
     */
    protected abstract String getFileName();

    protected abstract int getRecordSize();

    protected abstract String serialize();

    protected abstract T deserialize(String record);

    /**
     * ------ Data Access Object API ----------------------------------------------
     */
    public abstract ArrayList<T> all();

    public abstract T getById(int id);

    public abstract void save(T entity);

    /**
     * ------ Random Access File CRUD Utils ---------------------------------------
     */
    public File getFile() {
        File file = new File(DIR, this.getFileName());
        return file;
    }

    public int getLastRecordId() {
        File readFrom = this.getFile();
        try {
            RandomAccessFile raf = new RandomAccessFile(readFrom, "r");
            int pos = (int) raf.length();
            raf.close();
            return pos / (getRecordSize() + 2);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public void insert() {
        File writeTo = this.getFile();
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
        File writeTo = this.getFile();
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

    public String read(int id) {
        File readFrom = this.getFile();
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

    // TODO This is a lesson on its own
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

    /**
     *  ------ Paginated Records Methods ----------------------------------
     */
}
