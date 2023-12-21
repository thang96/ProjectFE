package QuanLyHocSinh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    private static ArrayList<HocSinh> hocSinhs = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        xemHocSinh();
        // themHocSinh();
        // capNhatDiemHocSinh();
        // xoaHocSinh();
        // xemDanhSachHocSinhTheoLop();
        // sapXepTheoTen();
        // sorthocSinhsByAge();
        // sorthocSinhsByPoint();
    }

    private static void xemHocSinh() {
        if (hocSinhs.isEmpty()) {
            System.out.println("Không có học sinh");
        } else {
            System.out.println("Danh sách học sinh :");
            for (HocSinh hocSinh : hocSinhs) {
                System.out.println(hocSinh);
            }
        }
    }

    private static void themHocSinh() {
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Tên: ");
        String name = scanner.nextLine();
        System.out.print("Tuổi: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Địa chỉ: ");
        String address = scanner.nextLine();
        System.out.print("Điểm: ");
        double point = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Lớp học: ");
        String classroom = scanner.nextLine();

        HocSinh newHocSinh = new HocSinh(id, name, age, address, point, classroom);
        hocSinhs.add(newHocSinh);
    }

    private static void capNhatDiemHocSinh() {
        System.out.print("Nhập ID học sinh: ");
        int studentId = scanner.nextInt();

        for (HocSinh hocSinh : hocSinhs) {
            if (hocSinh.getId() == studentId) {
                double newPoint = scanner.nextDouble();
                hocSinh.setPoint(newPoint);
                return;
            }
        }
    }

    private static void xoaHocSinh() {
        System.out.print("Nhập ID học sinh: ");
        int studentId = scanner.nextInt();

        for (HocSinh hocSinh : hocSinhs) {
            if (hocSinh.getId() == studentId) {
                hocSinhs.remove(hocSinh);
                return;
            }
        }
    }

    private static void xemDanhSachHocSinhTheoLop() {
        System.out.print("Nhập tên lớp: ");
        String tenLop = scanner.next();

        boolean found = false;
        for (HocSinh hocSinh : hocSinhs) {
            if (hocSinh.getClassroom().equalsIgnoreCase(tenLop)) {
                System.out.println(hocSinh);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Lớp không có học sinh");
        }
    }

    private static void sapXepTheoTen() {
        Collections.sort(hocSinhs, Comparator.comparing(HocSinh::getName));
    }

    private static void sorthocSinhsByAge() {
        Collections.sort(hocSinhs, Comparator.comparingInt(HocSinh::getAge));
    }

    private static void sorthocSinhsByPoint() {
        Collections.sort(hocSinhs, Comparator.comparingDouble(HocSinh::getPoint));
    }
}
