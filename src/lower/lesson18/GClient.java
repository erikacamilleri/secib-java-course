package lower.lesson18;

import java.util.List;

public class GClient extends Client {

    private Group g;

    private List<Room> rooms;
    
    public GClient(int id, Date dateIn, Date dateOut, Group g) {
        super(id, "", dateIn, dateOut, null);
       
        this.g = g;
    }

    public Group getGroup() {
        return this.g;
    }

    public List<Room> getRoom() {
        return this.rooms;
    }

    public void allocateRooms() {

    }

    public Room getRoomByNumber(int roomNumber) {
        Room room = null;
        // code to find room in list
        return room;
    }
}
