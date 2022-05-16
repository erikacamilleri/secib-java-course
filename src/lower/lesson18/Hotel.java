package lower.lesson18;

public class Hotel {
    
    Room[] allRooms;

    public int[] findRooms() {
        int[] emptyRooms = new int[allRooms.length];
        int numberOfEmptyRooms = 0;
        for(int i = 0; i < allRooms.length; i++) {
            Room check = allRooms[i];
            if (check.beds >=2 && check.empty) {
                emptyRooms[numberOfEmptyRooms] = check.roomNumber;
                numberOfEmptyRooms++;
            }
        }
        return emptyRooms;
     }

     public Room getRoomByNumber(int roomNumber) {
        return null;
     }
}
