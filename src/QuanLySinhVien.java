import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySinhVien {
    private ArrayList<SinhVien> danhSachSo = new ArrayList<>();
    public void Nhap()
    {
        Scanner sc = new Scanner(System.in);
        int soSinhVien = sc.nextInt();
        for(int i=0;i<soSinhVien;i++)
        {
            SinhVien sv = new SinhVien();
            sv.Nhap();
        }
    }
    public void DangKyHocPhan()
    {

    }
}
