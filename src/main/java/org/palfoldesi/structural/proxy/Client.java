package org.palfoldesi.structural.proxy;

public class Client {
    public static void main(String[] args) {
        Vault vault = new RestrictedVault();
        vault.access("Jean-Claude Van Damme");
        vault.access("Emperor Palpatine");
    }
}
