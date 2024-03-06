import java.util.Date;
import java.util.Scanner;

public class Lop {
    private String maLop;
    private String tenMon;
    private int soTinChi;
    private ThoiGianHoc thoiGianHoc;

    private Ngay ngayBatDau;
    private Ngay ngayKetThuc;

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public int getSoTinChi() {
        return soTinChi;
    }

    public void setSoTinChi(int soTinChi) {
        this.soTinChi = soTinChi;
    }

    public ThoiGianHoc getThoiGianHoc() {
        return thoiGianHoc;
    }

    public void setThoiGianHoc(ThoiGianHoc thoiGianHoc) {
        this.thoiGianHoc = thoiGianHoc;
    }

    public Ngay getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(Ngay ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public Ngay getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(Ngay ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

   public int NhapTinChi()
   {
       this.soTinChi = new Scanner(System.in).nextInt();
       return this.soTinChi;
   }
    public void NhapThongTin()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhập mã lớp:");
        this.maLop= sc.nextLine();
        System.out.print("\nNhập tên môn:");
        this.tenMon=sc.nextLine();
        System.out.print("\nNgày bắt đầu:");
        this.ngayBatDau= new Ngay().Nhap();
        System.out.print("\nNgày kết thúc:");
        this.ngayKetThuc = new Ngay().Nhap();
        System.out.println("");
    }
}
