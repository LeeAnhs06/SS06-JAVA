class Student {
    String maSinhVien;
    String hoTen;
    int namSinh;
    double diemTrungBinh;
    
    Student(String maSinhVien, String hoTen, int namSinh, double diemTrungBinh) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.diemTrungBinh = diemTrungBinh;
    }
    
    void hienThiThongTin() {
        System.out.println("Ma sinh vien: " + maSinhVien);
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Nam sinh: " + namSinh);
        System.out.println("Diem trung binh: " + diemTrungBinh);
    }
}

public class Bai01 {
    public static void main(String[] args) {
        Student sv1 = new Student("SV001", "Nguyen Van A", 2003, 8.5);
        Student sv2 = new Student("SV002", "Tran Thi B", 2004, 7.8);
        
        sv1.hienThiThongTin();
        sv2.hienThiThongTin();
    }
}
