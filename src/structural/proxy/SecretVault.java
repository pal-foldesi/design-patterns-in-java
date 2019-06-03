package structural.proxy;

import java.util.List;

public class SecretVault {
    public void listContents() {
        System.out.println(List.of("Treasure", "UFO", "Batmobile"));
    }
}
