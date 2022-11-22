package ba.unsa.etf.rpr.singletonPattern;

public class Singleton {

    public static Singleton instance;
    private String username;
    private String password;

    private Singleton(String username,String password){
        this.username=username;
        this.password=password;
    }

    public static Singleton getInstance(String username,String password){
        if(instance==null) {
            instance = new Singleton(username, password);
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Singleton {" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
