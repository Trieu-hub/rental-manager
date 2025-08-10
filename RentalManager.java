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

        sc.nextLine();
        System.out.print("Tên khách hàng: ");
        String customerName = sc.nextLine();
        System.out.print("Tuổi khách hàng: ");
        int customerAge= sc.nextInt();
        System.out.print("Giới tính:");
        System.out.println(" 1: Nam, 0: Nữ");
        int customerG = sc.nextInt();

        // khởi tạo constructor
        Room room = new Room(roomNum, roomLives, roomRent);
        room.Lives();
        Customers customer = new Customers(customerName, customerAge, customerG);
        customer.Gender();

        // gọi hàm lấy thông tin
        System.out.println(room.getInfo());
        System.out.println("---------------------");
        System.out.println(customer.getInfo());

        sc.close();
    }
}
