class Product {
    private String maSanPham;
    private String tenSanPham;
    private double giaBan;
    
    public Product(String maSanPham, String tenSanPham, double giaBan) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        setGiaBan(giaBan);
    }
    
    public String getMaSanPham() {
        return maSanPham;
    }
    
    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }
    
    public String getTenSanPham() {
        return tenSanPham;
    }
    
    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }
    
    public double getGiaBan() {
        return giaBan;
    }
    
    public void setGiaBan(double giaBan) {
        if (giaBan > 0) {
            this.giaBan = giaBan;
        } else {
            System.out.println("Loi: Gia ban phai lon hon 0!");
            this.giaBan = 0;
        }
    }
    
    public void hienThiThongTin() {
        System.out.println("Ma san pham: " + maSanPham);
        System.out.println("Ten san pham: " + tenSanPham);
        System.out.println("Gia ban: " + giaBan);
    }
}

public class Bai03 {
    public static void main(String[] args) {
        Product sp1 = new Product("SP001", "Laptop Dell", 15000000);
        sp1.hienThiThongTin();
        
        System.out.println("Thu thay doi gia hop le:");
        sp1.setGiaBan(18000000);
        sp1.hienThiThongTin();
        
        System.out.println("Thu thay doi gia khong hop le:");
        sp1.setGiaBan(-5000);
        sp1.hienThiThongTin();
    }
}
