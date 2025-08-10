import java.util.Scanner;

public class RentalManager {
    public static void main(String[] args) {
        // Hàm nhập
        Scanner sc = new Scanner(System.in);
        System.out.print("Số phòng bạn đang ở: ");
        int roomNum = sc.nextInt();
        System.out.print("Số người phòng bạn đang có: ");
        int roomLives = sc.nextInt();
        System.out.print("Số tiền thuê phòng của bạn là: ");
        double roomRent = sc.nextDouble();

        // khởi tạo constructor
        Room room = new Room(roomNum, roomLives, roomRent);
        room.Lives();

        // gọi hàm lấy thông tin
        System.out.println(room.getInfo());

        sc.close();
    }
}
