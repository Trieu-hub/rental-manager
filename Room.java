public class Room {
    private int num;
    private int n;
    private double rent;

    public Room(int num, int n, double rent){
        this.num=num;
        this.n=Math.abs(n);
        this.rent=rent;
    }

    public void Lives(){
        if(n==1)
            System.out.println("1 person");
        else{
            System.out.println(n +"persons");
        }
    }

    public String getInfo(){
        return "Room: " + num + " has " + n + " person(s)." + " Rent: " + rent;
    }
}
