import java.util.Scanner;

public class Ngay {
    private int ngay,thang,nam;

    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }
    public Ngay Nhap()
    {
        Ngay time = new Ngay();
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNgày ");
        time.ngay=sc.nextInt();
        System.out.println("Tháng ");
        time.thang=sc.nextInt();
        System.out.println("Năm ");
        time.nam=sc.nextInt();
        return time;
    }
    @Override
    public String toString() {
        return ngay+" \\ "+thang+ " \\ "+nam;
    }
}
