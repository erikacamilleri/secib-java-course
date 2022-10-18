package upper.lesson01;

import java.util.ArrayList;

public class Sport extends AbstractEntityFile<Sport> {
  /**
   * ------ Attributes ----------------------------------------------------
   */
   private static Sport daoInstance;

   private int recordId;

   private String sportKey;

   private String sportId;

    @Override
    protected String getFileName() {
        return "Sports.txt";
    }

   @Override
    protected int getRecordSize() {
        // TODO Auto-generated method stub
        return 0;
    }

    public String getSportId() {
        return this.sportId;
    }

   @Override
    protected String serialize() {
        String serialized = "";
        serialized += this.sportKey + this.DELIMITER;
        serialized += this.sportId + this.DELIMITER;
        return serialized;
    }

   @Override
    protected Sport deserialize(String record) {
        // TODO Auto-generated method stub
        return null;
    }

   @Override
    protected boolean delete(int id) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public ArrayList<Sport> all() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Sport getById(int id) {
       throw new UnsupportedOperationException("Use static method Sport.getDaoInstance().getById(sportId);"); 
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

    public Sport getById(String id) {
        int lastRecordId = getLastRecordId();
        int currentRecordId = 1;
        while (currentRecordId <= lastRecordId) {
            Sport sport = deserialize(read(currentRecordId));
            if (sport.getSportId().equals(id)) {
                return sport;
            }
        }
        return null;
    }

   /**
    * ---- Constructor(s) ----------------------------------------------------
   */
   public Sport(String sportKey, String sportId) {
        this.sportKey = sportKey;
        this.sportId = sportId;
   }

   private Sport() {}

   // Singleton Design Pattern
   public static Sport getDaoInstance() {
      if (daoInstance == null) {
        daoInstance = new Sport();
      }
      return daoInstance;
   }

   @Override
   public void save(Sport entity) {
        // TODO Auto-generated method stub
    }
}
