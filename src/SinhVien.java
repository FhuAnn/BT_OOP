import jdk.jshell.SourceCodeAnalysis;

import java.util.List;
import java.util.Scanner;

public class SinhVien {
    private String hoTen;
    private int mssv;
    private List<Lop> _lop;
    public SinhVien(){}
    public int tinChiConLai()
    {
        int dem=0;
        for(Lop lop:this._lop)
        {
            dem+=lop.getSoTinChi();
        }
        return 24-dem;
    }
    public SinhVien(String hoTen,int mssv,List<Lop> lop) {
        this.hoTen = hoTen;
        this.mssv = mssv;
        this._lop = lop;
    }
    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten sinh vien: ");
        this.hoTen = sc.nextLine();
        System.out.println("Nhap mssv: ");
        this.mssv = sc.nextInt();
    }
    public void Xuat() {
        System.out.println("Sinh Vien : "+ this.hoTen + ",mssv :"+ this.mssv);
    }

    public void DangKyLop() {
        if(tinChiConLai()==0) System.out.println("Còn trống 0 tín chỉ. Không đăng ký thêm.");
        else
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Đăng ký học phần: ");
            do{
                System.out.println("1.Không đăng ký nữa.\n2. Tiếp tục đăng ký học phần.");
                int choose;
                choose = sc.nextInt();
                if( choose ==1 ) break; else if(choose != 2) continue;
                Lop lop= new Lop();
                lop.NhapThongTin();
                if(lop.NhapTinChi()>tinChiConLai())
                {
                    System.out.println("Error.Chỉ còn lại "+ tinChiConLai());
                    continue;
                }
                System.out.println("Đăng ký thành công. Chỉ còn lại "+ tinChiConLai());
            }
            while (true);
        }

    }
}
