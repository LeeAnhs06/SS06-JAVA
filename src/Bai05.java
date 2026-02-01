class Book {
    private String maSach;
    private String tenSach;
    private String tacGia;
    private double giaBan;
    
    public Book(String maSach, String tenSach, String tacGia, double giaBan) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.giaBan = giaBan;
    }
    
    public void hienThiThongTin() {
        System.out.println("Ma sach: " + this.maSach);
        System.out.println("Ten sach: " + this.tenSach);
        System.out.println("Tac gia: " + this.tacGia);
        System.out.println("Gia ban: " + this.giaBan);
    }
}

public class Bai05 {
    public static void main(String[] args) {
        Book book1 = new Book("BK001", "Lap trinh Java", "Nguyen Van A", 150000);
        Book book2 = new Book("BK002", "Toan cao cap", "Tran Thi B", 200000);
        
        book1.hienThiThongTin();
        book2.hienThiThongTin();
    }
}
