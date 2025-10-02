package Task_3;

import java.util.ArrayList;

public class Main {
    static void main() {

        //---------3g: Instanter tre værelser/rum------------
        Room room1 = new Room(2,3);
        Room room2 = new Room(1,2);
        Room room3 = new Room(4,1);

        //----------3h: Tilføj værelser til bygningen-----------
        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);

        
        //-----------3i: Instanter bygning--------------------
        Building building = new Building(rooms, 2);

        System.out.println("Antal lamper i bygning: " + countLampsInBuilding(building));
        System.out.println("Antal vinduer i bygning: " + countWindowsInBuilding(building));
        System.out.println("Antal værelser i bygning: " + countRoomsInBuilding(building));

    }
    //---------------3j: Tæl lamper, vinduer, værelser-metode-----------------------
    public static int countLampsInBuilding(Building building){
        int total = 0;
        for (Room r : building.getRooms()){
            total += r.getNumberOfLamps();
        }
        return total;
            }
    public static int countWindowsInBuilding(Building building){
        int total = 0;
        for (Room r : building.getRooms()){
            total += r.getNumberOfWindows();
        }
        return total;
    }

    public static int countRoomsInBuilding (Building building){
        return building.getRooms().size();
    }

    }

