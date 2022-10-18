package upper.lesson01;

import java.util.ArrayList;

import org.json.JSONObject;

/**
 * This is a behaves like relationship because AbstractEntityFile is an abstract class
 * which cannot be instantiated. Essentailly, AbstractEntityFile is a special kind of
 * interface. Fixure behaves like AbstractEntityFile
 */
public class Fixture extends AbstractEntityFile<Fixture> {

    // Class variables that do not have a state (use with caution)
    // i.e. are not specific to an instance, they are "global"
    private static Fixture daoInstance;

    /**
     * ------ Attributes ----------------------------------------------------
     */
    private int recordId = -1;

    // A field that uniquely identifies a fixture e.g. ABC123JKLMN123
    private String fixtureId;

    // TODO: Expand on this next lesson
    // A field that is related to a sport object e.g. "FB"
    private String sportId;

    private String home;

    private String away;

    // JSONObject is provided by org.json (downloaded library)
    JSONObject metaData = new JSONObject();

    /**
     * ---- Constructor(s) ----------------------------------------------------
     */
    private Fixture() {}

    public Fixture(String fixtureId, String sportId, String home, String away, JSONObject metaData) {
        this.fixtureId = fixtureId;
        this.sportId = sportId;
        this.home = home;
        this.away = away;
        this.metaData = metaData;
    }

    /**
    * ----- Get and Set Methods --------------------------------------------
    */
    public String getFixtureId() {
        return this.fixtureId;
    }

    public void setFixtureId(String fixtureId) {
        this.fixtureId = fixtureId;
    }

    // TODO: Get and Set for home, away, metaData

    /**
    * ----- Abstract Entity File Methods --------------------------------------------
    */

    // Override means that this class will not use the definition of the
    // parent class.
    @Override
    protected String getFileName() {
        return "Fixtures.txt";
    }

    @Override
    protected int getRecordSize() {
        return 88;
    }

    @Override
    protected String serialize() {
        String serialized = "";
        serialized += this.fixtureId + this.DELIMITER;
        serialized += this.sportId + this.DELIMITER;
        serialized += this.home + this.DELIMITER;
        serialized += this.away + this.DELIMITER;
        serialized += this.metaData.toString();
        return serialized;
    }

    @Override
    protected Fixture deserialize(String record) {
        String[] temp = record.split(this.DELIMITER);
        JSONObject metaData = new JSONObject(temp[4]);
        return new Fixture(temp[0], temp[1], temp[2], temp[3], metaData);
    }

    @Override
    protected boolean delete(int id) {
        // TODO: Deleting a record is tricky and messy... we might need to use a flag
        return false;
    }

    @Override
    public ArrayList<Fixture> all() {
        // When someone else's code does not work for you
        // you can return an exception... but be nice and give an alternative
        // do honour the contract
        throw new UnsupportedOperationException("Use static method Fixture.getDaoInstance().getAll();");
    }

    @Override
    public Fixture getById(int id) {
        // When someone else's code does not work for you
        // you can return an exception... but be nice and give an alternative
        // do honour the contract
        throw new UnsupportedOperationException("Use static method Fixture.getDaoInstance().getById(fixtureId);");
    }

    public void save() {
        if (this.recordId == -1) {
            // insert a new record in the file
            this.recordId = this.getLastRecordId() + 1;
            this.create();
        } else {
            // update an existing record in the file
            this.update(this.recordId);
        }
    }

    @Override
    public void save(Fixture entity) {
        entity.save();
    }

    /**
    * ----- Stateless Methods --------------------------------------------
    */
    // Usage: Fixture.getDaoInstance().save(fixtureObj);
    public static Fixture getDaoInstance() {
        if (daoInstance == null) {
            daoInstance = new Fixture();
        }
        return daoInstance;
    }

    public Fixture getById(String id) {
        int lastRecordId = getLastRecordId();
        int currentRecordId = 1;
        while (currentRecordId <= lastRecordId) {
            Fixture fixture = deserialize(read(currentRecordId));
            if (fixture.getFixtureId().equals(id)) {
                return fixture;
            }
        }
        return null;
    }

    public ArrayList<Fixture> getAll() {
        ArrayList<Fixture> fixtureList = new ArrayList<Fixture>();
        // TODO: For each record in the Fixture file, deserialize it
        // and add it to the list
        return fixtureList;
    }

    public static int compare(Fixture fixture1, Fixture fixture2) {
        // TODO: Why would we want to compare two fixtures?
        return 0; // equal
    }
}
