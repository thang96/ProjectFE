package QuanLyNhanVien;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyNhanVien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<NhanVien> danhSachNhanVien = new ArrayList<>();

        System.out.println("Nhập thông tin kiểm chứng viên:");
        scanner.nextLine();
        System.out.print("Mã nhân viên: ");
        String maNhanVienKC = scanner.nextLine();
        System.out.print("Họ tên: ");
        String hoTenKC = scanner.nextLine();
        System.out.print("Tuổi: ");
        int tuoiKC = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Số điện thoại: ");
        String soDienThoaiKC = scanner.nextLine();
        System.out.print("Email: ");
        String emailKC = scanner.nextLine();
        System.out.print("Lương cơ bản: ");
        double luongCoBanKC = scanner.nextDouble();
        System.out.print("Số lỗi phát hiện: ");
        int soLoiPhatHienKC = scanner.nextInt();

        System.out.println("Nhập thông tin lập trình viên:");
        scanner.nextLine();
        System.out.print("Mã nhân viên: ");
        String maNhanVienLT = scanner.nextLine();
        System.out.print("Họ tên: ");
        String hoTenLT = scanner.nextLine();
        System.out.print("Tuổi: ");
        int tuoiLT = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Số điện thoại: ");
        String soDienThoaiLT = scanner.nextLine();
        System.out.print("Email: ");
        String emailLT = scanner.nextLine();
        System.out.print("Lương cơ bản: ");
        double luongCoBanLT = scanner.nextDouble();
        System.out.print("Số giờ overtime: ");
        double overtimeLT = scanner.nextInt();

        KiemChungVien kiemChungVien = new KiemChungVien(maNhanVienKC, hoTenKC, tuoiKC, soDienThoaiKC, emailKC,
                luongCoBanKC, soLoiPhatHienKC);
        danhSachNhanVien.add(kiemChungVien);
        LapTrinhVien lapTrinhVien = new LapTrinhVien(maNhanVienLT, hoTenLT, tuoiLT, soDienThoaiLT, emailLT,
                luongCoBanLT, overtimeLT);

        danhSachNhanVien.add(lapTrinhVien);
        System.out.println("\nThông tin các nhân viên:");
        for (NhanVien nhanVien : danhSachNhanVien) {
            nhanVien.inThongTin();
            System.out.println();
        }

        scanner.close();
    }
}
