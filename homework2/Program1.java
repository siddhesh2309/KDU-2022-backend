package homework2;

class Credentials {
    private String username;
    private Integer pinCode;

    private Credentials() {
        this.username = "";
        this.pinCode = null;
    }

    public static Credentials getData(String username, Integer pinCode) {
        Credentials cred = new Credentials();
        cred.username = username;
        cred.pinCode = pinCode;
        return cred;
    }
    
    public void showData() {
        System.out.println("Credentials_are : " + this.username + " & " + this.pinCode);
    }
}

public class Program1 {
    public static void main(String[] args) {
        Credentials creds =  Credentials.getData("siddhesh.joshi@kickdrumtech.com", 2345);
//        creds.getData("siddhesh.joshi@kickdrumtech.com", 2345);
       creds.showData();
    }
}




