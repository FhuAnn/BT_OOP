import jdk.jshell.SourceCodeAnalysis;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SinhVien {
    private String hoTen;
    private String mssv;
    private List<Lop> _lop = new ArrayList<Lop>();
    public SinhVien(){}
    public int tinChiConLai()
    {
        int dem=0;
        if(_lop==null) return 24;
        for(Lop lop:this._lop)
        {
            dem+=lop.getSoTinChi();
        }
        return 24-dem;
    }
    public SinhVien(String hoTen,String mssv,List<Lop> lop) {
        this.hoTen = hoTen;
        this.mssv = mssv;
        this._lop = lop;
    }
    public void Nhap() {
        System.out.println("Nhập họ và tên sinh viên ");
        this.hoTen = new Scanner(System.in).nextLine();
        System.out.println("Nhập mssv: ");
        this.mssv = new Scanner(System.in).nextLine();
    }

    public void Xuat() {

        System.out.print("Sinh Viên : "+ this.hoTen + ",mssv :"+ this.mssv);
    }

    public void DangKyLop(Lop __lop) {

        _lop.add(__lop);

                    System.out.println("Đăng ký thành công. Chỉ còn lại "+ tinChiConLai());
                    __lop.ghiNhanDangKy();


    }
    public boolean timKiemSinhVien(String ma)
    {
            return ma.equals(this.mssv);
    }
    public int soMonDangKỵ()
    {
        int dem=0;
        for(Lop lop:_lop)
        {
            dem++;
        }
        return dem;
    }
}

