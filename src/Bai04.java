class Employee {
    private String maNhanVien;
    private String hoTen;
    private double luong;
    
    public Employee() {
        this.maNhanVien = "NV000";
        this.hoTen = "Chua cap nhat";
        this.luong = 0;
    }
    
    public Employee(String maNhanVien, String hoTen) {
        this.maNhanVien = maNhanVien;
        this.hoTen = hoTen;
        this.luong = 0;
    }
    
    public Employee(String maNhanVien, String hoTen, double luong) {
        this.maNhanVien = maNhanVien;
        this.hoTen = hoTen;
        this.luong = luong;
    }
    
    public void hienThiThongTin() {
        System.out.println("Ma nhan vien: " + maNhanVien);
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Luong: " + luong);
    }
}

public class Bai04 {
    public static void main(String[] args) {
        Employee nv1 = new Employee();
        System.out.println("Nhan vien 1 (khong tham so):");
        nv1.hienThiThongTin();
        
        Employee nv2 = new Employee("NV001", "Nguyen Van A");
        System.out.println("Nhan vien 2 (ma va ten):");
        nv2.hienThiThongTin();
        
        Employee nv3 = new Employee("NV002", "Tran Thi B", 15000000);
        System.out.println("Nhan vien 3 (day du thong tin):");
        nv3.hienThiThongTin();
    }
}
