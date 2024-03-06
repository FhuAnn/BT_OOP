import java.util.Scanner;

public class ThoiGianHoc {
    private int tietBatDau;
    private int tietKetThuc;
    private String thu;

    public int getTietBatDau() {
        return tietBatDau;
    }

    public int getTietKetThuc() {
        return tietKetThuc;
    }

    public String getThu() {
        return thu;
    }

    public void setTietBatDau(int tietBatDau) {
        this.tietBatDau = tietBatDau;
    }

    public void setTietKetThuc(int tietKetThuc) {
        this.tietKetThuc = tietKetThuc;
    }

    public void setThu(String thu) {
        this.thu = thu;
    }
    public void Nhap()
    {
        System.out.println("Tiết 1:7h30-8h15"+",2:8h15-9h,3:9h-9h45,4:10h-10h45,5:10h45-11h30");
        System.out.println("Tiết 6:13h-13h45"+",2:13h45-14h30,3:14h30-15h15,4:15h30-16h15,5:16h15-17h");
        Scanner sc = new Scanner(System.in);
        System.out.println("Tiết bắt đầu:");
        this.tietBatDau=sc.nextInt();
        System.out.println("Tiết kết thúc:");
        this.tietKetThuc=sc.nextInt();
        System.out.println("Thứ(Mo-Tu-Wed-Thu-Fri-Sa-Sun)");
        this.thu=sc.nextLine();
    }
}
