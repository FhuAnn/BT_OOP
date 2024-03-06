import java.util.Date;
import java.util.Scanner;

public class Lop {
    private String maLop;
    private String tenMon;
    private int soTinChi;
    private ThoiGianHoc thoiGianHoc = new ThoiGianHoc();

    private Ngay ngayBatDau;
    private Ngay ngayKetThuc;

    public int soLuongDK = 0 ;
    public void ghiNhanDangKy()
    {
        soLuongDK++;
    }
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

    public void setNgayBatDau(Ngay ngayBatDau)
    {
        this.ngayBatDau = ngayBatDau;
    }

    public Ngay getNgayKetThuc()
    {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(Ngay ngayKetThuc)
    {
        this.ngayKetThuc = ngayKetThuc;
    }

   public int NhapTinChi()
   {
       System.out.print("Số tín chỉ của môn: ");
       this.soTinChi = new Scanner(System.in).nextInt();
       return this.soTinChi;
   }
    public void NhapThongTin()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã lớp:");
        this.maLop= sc.nextLine();
        System.out.print("Nhập tên môn:");
        this.tenMon=sc.nextLine();
        NhapTinChi();
        System.out.print("Ngày bắt đầu:");
        this.ngayBatDau= new Ngay().Nhap();
        System.out.print("Ngày kết thúc:");
        this.ngayKetThuc = new Ngay().Nhap();
        this.thoiGianHoc.Nhap();
    }
    public void xuatCoBan()
    {
        System.out.print("Mã lớp: "+this.maLop);
        System.out.print(", Tên lớp: "+ this.tenMon);
    }
    public boolean timKiemLop(String _maLop)
    {
        return this.maLop.equals(_maLop);
    }
    public boolean kiemTraHocMon(String _mamon)
    {
        return _mamon==this.maLop;
    }
}
