package collections.roomExercise;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class RoomService {

    private final Collection<Room> inventory;

    public RoomService() {
        this.inventory = new LinkedHashSet<>();
    }

    public boolean hasRoom(Room room){
        return this.inventory.contains(room);
    }

    public Room[] asArray() {
        return this.inventory.toArray(new Room[0]);
    }

    public Collection<Room> getByType(String type) {
        Collection<Room> copy = new HashSet<>(this.inventory);
        copy.removeIf(room -> !room.getType().equals(type));
        return copy;
    }

    public Collection<Room> getInventory() {
        // Create a copy of a collection (protect the collections from modifications)
        return new HashSet<>(this.inventory);
    }

    public void createRoom(String name, String type, int capacity, double rate) {
        this.inventory.add(new Room(name, type, capacity, rate));
    }

    public void createRooms(Room[] rooms) {
        this.inventory.addAll(Arrays.asList(rooms));
    }

    public void removeRoom(Room room) {
        this.inventory.remove(room);
    }

}
