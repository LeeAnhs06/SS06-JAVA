class Account {
    String username;
    String password;
    String email;
    
    Account(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }
    
    void doiMatKhau(String matKhauMoi) {
        this.password = matKhauMoi;
        System.out.println("Da doi mat khau thanh cong!");
    }
    
    void hienThiThongTin() {
        System.out.println("Username: " + username);
        System.out.println("Password: ******");
        System.out.println("Email: " + email);
    }
}

public class Bai02 {
    public static void main(String[] args) {
        Account acc1 = new Account("nguyenvana", "123456", "vana@gmail.com");
        
        System.out.println("Thong tin ban dau:");
        acc1.hienThiThongTin();
        
        acc1.doiMatKhau("abc123xyz");
        
        System.out.println("\nThong tin sau khi doi mat khau:");
        acc1.hienThiThongTin();
    }
}
