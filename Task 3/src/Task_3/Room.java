package Task_3;

public class Room {
    private int numberOfLamps;
    private int numberOfWindows;

    //-----------Konstruktør-------------
    public Room(int numberOfLamps, int numberOfWindows){
        this.numberOfLamps = numberOfLamps;
        this.numberOfWindows = numberOfWindows;
            }

    //---------3c: Getters & Setters-------------
    public int getNumberOfLamps(){
        return numberOfLamps;
    }

    public void setNumberOfLamps(int numberOfLamps) {
        this.numberOfLamps = numberOfLamps;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }

    public void setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
    }
}
