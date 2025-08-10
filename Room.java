public class Room {
    private int num;
    private String n;
    private double rent;

    public Room(int num, String n, double rent){
        this.num=num;
        this.n=n;
        this.rent=rent;
    }

    public String getInfo(){
        return "Room: " + num + " have " + n + "person" + " Rent: " + rent;
    }
}
