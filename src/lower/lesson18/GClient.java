package lower.lesson18;

import java.util.List;

public class GClient extends Client {

    private Group g;

    private List<Room> rooms;
    
    public GClient(int id, String c, Date dateIn, Date dateOut, List rooms, Group g) {
        super(id, c, dateIn, dateOut, null);
        this.rooms = rooms;
        this.g = g;
    }

    public Group getGroup() {
        return this.g;
    }

    public List<Room> getRoom() {
        return this.rooms;
    }
}
