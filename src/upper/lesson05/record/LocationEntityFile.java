package upper.lesson05.record;

import java.util.ArrayList;

import upper.lesson05.entity.Location;

public class LocationEntityFile extends AbstractEntityFile<Location> {

    private Location location;

    protected static final int RECORD_SIZE = 138;

    protected static final String FILE_NAME = "locations.txt";

    @Override
    protected String getFileName() {
        return FILE_NAME;
    }

    @Override
    protected int getRecordSize() {
        return RECORD_SIZE;
    }

    @Override
    protected String serialize() {
        String record = "";
        record += String.format("%1$" + 4 + "s", this.location.id) + this.DELIMITER;
        record += String.format("%1$" + 100 + "s", this.location.name) + this.DELIMITER;
        record += String.format("%1$" + 15 + "s", this.location.lat) + this.DELIMITER;
        record += String.format("%1$" + 15 + "s", this.location.lon) + this.DELIMITER;
        return record;
        
    }

    @Override
    protected Location deserialize(String record) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ArrayList<Location> all() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Location getById(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void save(Location entity) {
        this.location = entity;
        if (this.location.id != -1) {
            // save a new car
            this.update(this.location.id);
        } else {
            // create a new car record
            this.location.id = this.getLastRecordId() + 1;
            this.insert();
        }
    }
}
