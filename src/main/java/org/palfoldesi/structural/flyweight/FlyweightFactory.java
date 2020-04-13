package org.palfoldesi.structural.flyweight;

import java.util.List;
import java.util.ArrayList;

public class FlyweightFactory {
    private List<Postcard> postcards = new ArrayList<>();

    public Postcard obtainPostcard(Size size, Design design) {
        for (Postcard postcard : postcards) {
            if (postcard.getSize().equals(size) && postcard.getDesign().equals(design)) {
                return postcard;
            }
        }
        Postcard postcard = new Postcard(size, design);
        postcards.add(postcard);
        return postcard;
    }
}
