package Contractor;

public class Constractor {
    public String username;
    public String password;
    public Constractor(String username, String password){
        this.username = username;
        this.password = password;
    }
}
class DemoConstructor{
    public static void main(String[] args) {
        Constractor cilsy = new Constractor ("Cilsy", "yeah");
        System.out.println("Username: " + cilsy.username);
        System.out.println("Password: " + cilsy.password);
    }
}


