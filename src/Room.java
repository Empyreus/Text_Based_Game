/**
 * Created by RJ on 5/13/2015.
 */
public class Room {
    private String roomDescription;

    public Room( String description) {
        roomDescription = description;
    }

    public String getRoomDescription() {
        return roomDescription;
    }

    public void setRoomDescription(String newDescription) {
        this.roomDescription = newDescription;
    }

}
