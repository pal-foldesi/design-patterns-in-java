package structural.proxy;

public class Client {
    public static void main(String[] args) {

        //Security proxy example. There are also other types

        User user = new User("Jean-Claude Van Damme");

        SecretVault vault = new SecretVault();

        Proxy proxy = new Proxy();

        proxy.access(vault, user);

        User user2 = new User("Emperor Palpatine");

        proxy.access(vault, user2);
    }
}
