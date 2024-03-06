import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

public class QuanLyLop {
    private ArrayList<Lop>  danhSachLop= new ArrayList<Lop>();
    public void NhapThem()
    {
            Lop lop= new Lop();
            lop.NhapThongTin();
            danhSachLop.add(lop);
    }
    public Lop timKiemLop (String _maLop)
    {
        for(Lop _lop:this.danhSachLop)
        {
            if(_lop.timKiemLop(_maLop))
            return _lop;
        }
        return null;
    }
    public ArrayList<Lop> dangKyNhieuNhat()
    {
        if(danhSachLop.isEmpty())
        {
            System.out.println("Chưa có lớp nào.");
            return null;
        }
        else
        {
            int temp=0;
            ArrayList<Lop> temp_arrLop=new ArrayList<Lop>();
            for(Lop _lop: this.danhSachLop)
            {
                if(_lop.soLuongDK>=temp && _lop.soLuongDK!=0)
                {
                    temp_arrLop.add(_lop);
                    temp=_lop.soLuongDK;
                }
            }
            if(temp_arrLop.isEmpty())
            {
                System.out.println("Chưa có ai đăng ký môn học nào");
                return null;
            }
            return temp_arrLop;
        }

    }
}
