import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLyLop quanLyLop = new QuanLyLop();
        QuanLySinhVien quanLySV = new QuanLySinhVien();

        System.out.println("Trường hiện tại có bao nhiêu lớp?");
        int m = sc.nextInt();
        System.out.println("Nhập vào "+ m + " lớp");
        for(int i=0 ; i < m;i++)
        {
            System.out.println("\n-----------STT_LOP-"+(i+1)+"--------");
            quanLyLop.NhapThem();
            System.out.print("------------Kết thúc-----------");
        }

        /*System.out.println("\nNhập bao nhiêu sinh viên?");
        int n = sc.nextInt();
        System.out.println("Nhập vào "+ n + " sinh viên");
        for(int i=0 ; i < n ;i++)
        {
            quanLySV.NhapThem();
        }*/
        do {
            System.out.println("\n----------Menu------");
            System.out.println("1.Thêm lớp\n2.Thêm sinh viên\n3.Đăng ký môn học" +
                    "\n4.Môn nào có nhiều sinh viên đăng ký nhất? Bao nhiêu sinh viên(1)" +
                    "\n5.Sinh viên nào đăng ký nhiều môn nhất? Nhiều tín chỉ nhất(2) " +
                    "\n6.Xem lịch học sinh viên(3)" +
                    "\n7.Thoát");
            int choose = new Scanner(System.in).nextInt();
            switch (choose)
            {
                case 1:
                    System.out.println("1 -> Thêm lớp.");
                    quanLyLop.NhapThem();
                    break;
                case 2:
                    System.out.println("2 -> Thêm sinh viên.");
                    quanLySV.NhapThem();
                    break;
                case 3:
                    System.out.println("3 -> Đăng ký học phần.");
                    System.out.println("Nhập mã số sinh viên");
                    String _mssv = new Scanner (System.in).nextLine();
                    if(quanLySV.CheckSV(_mssv))
                    {
                        System.out.print("\nĐăng ký học phần: ");
                        do {
                            System.out.println("\n1.Không đăng ký nữa.\n2.Tiếp tục đăng ký học phần.");
                            choose = new Scanner(System.in).nextInt();
                            if (choose == 1) break;
                            else if (choose != 2) continue;
                            System.out.println("Nhập mã lớp để đăng ký:");
                            String _maLop = new Scanner(System.in).nextLine();
                            Lop _lop=quanLyLop.timKiemLop(_maLop);
                            if(_lop!=null)
                            quanLySV.DangKyHP(_mssv,_lop);
                            else
                                System.out.println("Không tim thấy dữ liệu của lớp");
                        }
                        while(true);
                    }
                    break;
                case 4:
                    ArrayList<Lop> _lop=quanLyLop.dangKyNhieuNhat();
                    if(_lop!=null)
                    {
                        for(Lop __lop:_lop)
                        {
                            __lop.xuatCoBan();
                            System.out.println(" có nhiều sinh viên đăng ký nhất.\nVới "+__lop.soLuongDK+ " người đăng ký.");
                        }

                    }
                    break;
                case 5:
                    ArrayList<SinhVien> _sv=quanLySV.dangKyNhieuNhat();
                    if(_sv!=null) {
                        for (SinhVien __sv : _sv) {
                            __sv.Xuat();
                            System.out.println(" đăng lý nhiều môn nhất. Với "+(24-__sv.tinChiConLai())+" tín chỉ");
                        }
                    }
                    break;
                case 6: // lich hoc sinh vien
                case 7:
                    System.out.println("Thoát. Chúc bạn vui vẻ!");
                    return;
                default: continue;
            }
        }
        while (true);

    }
}