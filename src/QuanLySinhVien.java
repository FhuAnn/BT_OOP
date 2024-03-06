import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySinhVien {
    private ArrayList<SinhVien> danhSachSV = new ArrayList<SinhVien>();
    public void NhapThem()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào bao nhiêu sinh viên: ");
        int soSinhVien = sc.nextInt();
        for(int i=0;i<soSinhVien;i++)
        {
            System.out.println("Nhập thông tin sinh viên thứ "+(i+1));
            SinhVien sv = new SinhVien();
            sv.Nhap();
            danhSachSV.add(sv);
        }
    }
    public void DangKyHP(String _mssv,Lop _lop)
    {
        timKiemSV(_mssv).DangKyLop(_lop);
    }
    public SinhVien timKiemSV(String _mssv)
    {
        for(SinhVien sv : danhSachSV)
        {
            if( sv.timKiemSinhVien(_mssv)) return sv;
        }
        return null;
    }
    public boolean CheckSV (String _mssv)
    {
        SinhVien sv = timKiemSV(_mssv);
        if(sv==null)
        {
            do
            {
                System.out.println("Chưa có thông tin sinh viên\n1.Hủy\n2.Thêm thông tin");
                int choose = new Scanner(System.in).nextInt();
                if(choose==1) return false;
                else if (choose!=2) continue;
                sv= new SinhVien();
                sv.Nhap();
                danhSachSV.add(sv);
                return true;
            }
            while(true);
        }
        return true;
    }
    public ArrayList<SinhVien> dangKyNhieuNhat()
    {
        if(danhSachSV.isEmpty())
        {
            System.out.println("Chưa có dữ liệu sinh viên.");
            return null;
        }
        int temp=0;
        ArrayList<SinhVien> temp_arrSV=new ArrayList<SinhVien>();
        for(SinhVien sv: danhSachSV)
        {
            if(sv.soMonDangKỵ()>=temp&& sv.soMonDangKỵ()!=0)
            {
                temp=sv.soMonDangKỵ();
                temp_arrSV.add(sv);
            }
        }
        if(temp_arrSV.isEmpty())
        {
            System.out.println("Tất cả sinh viên chưa có ai đăng ký môn học nào");
            return null;
        }
        return temp_arrSV;
    }
}
