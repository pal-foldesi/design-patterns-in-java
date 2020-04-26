package org.palfoldesi.structural.proxy;

import java.util.List;

/**
 * Acts as a security proxy to Vault
 */
public class RestrictedVault implements Vault {
    private List<String> contents = List.of("Treasure", "UFO", "Batmobile");

    @Override
    public void access(String username) {
        if ("Jean-Claude Van Damme".equals(username)) {
            System.out.println(contents);
        } else {
            throw new SecurityException(username + " does not have clearance to access the vault!");
        }
    }
}
