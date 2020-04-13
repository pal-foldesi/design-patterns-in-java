package org.palfoldesi.structural.proxy;

public class Proxy {
    public void access(SecretVault vault, User user) {
        if (user.getName().equals("Jean-Claude Van Damme")) {
            vault.listContents();
        } else {
            throw new SecurityException("User " + user.getName() + " does not have clearance to access the vault!");
        }
    }
}
