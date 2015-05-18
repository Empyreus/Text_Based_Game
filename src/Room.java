/**
 * Created by RJ on 5/13/2015.
 */
public class Room {
    public String roomName;
    private String roomDescription;

    public Room() {
        roomName = "";
        roomDescription = "";
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String newName) {
        this.roomName = newName;
    }

    public String getRoomDescription() {
        return roomDescription;
    }

    public void setRoomDescription(String newDescription) {
        this.roomDescription = newDescription;
    }

}
