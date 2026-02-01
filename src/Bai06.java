class User {
    private String id;
    private String username;
    private String password;
    private String email;
    
    public User(String id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        setPassword(password);
        setEmail(email);
    }
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        if (password != null && !password.trim().isEmpty()) {
            this.password = password;
        } else {
            System.out.println("Loi: Mat khau khong duoc de trong!");
            this.password = "default123";
        }
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        if (email != null && email.contains("@") && email.contains(".")) {
            this.email = email;
        } else {
            System.out.println("Loi: Email khong hop le!");
            this.email = "invalid@email.com";
        }
    }
    
    public void hienThiThongTin() {
        System.out.println("ID: " + id);
        System.out.println("Username: " + username);
        System.out.println("Password: ******");
        System.out.println("Email: " + email);
    }
}

public class Bai06 {
    public static void main(String[] args) {
        System.out.println("Tao user hop le:");
        User user1 = new User("U001", "nguyenvana", "abc123", "vana@gmail.com");
        user1.hienThiThongTin();
        
        System.out.println("\nTao user voi email khong hop le:");
        User user2 = new User("U002", "tranb", "xyz456", "emailsai");
        user2.hienThiThongTin();
        
        System.out.println("\nThu doi password thanh rong:");
        user1.setPassword("");
        user1.hienThiThongTin();
        
        System.out.println("\nThu doi email hop le:");
        user2.setEmail("tranb@gmail.com");
        user2.hienThiThongTin();
    }
}
