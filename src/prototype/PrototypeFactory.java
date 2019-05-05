package prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {
    private final Map<Class, Prototype> prototypes = new HashMap<>();

    PrototypeFactory() {
        prototypes.put(Duck.class, new Duck());
        prototypes.put(Goose.class, new Goose());
    }

    public Prototype getNew(Class clazz) {
        Prototype found = prototypes.get(clazz);
        if (found == null) {
            System.out.println("Prototype with class: " + clazz.getName() + " not found!");
            return null;
        } else {
            return found.clonePrototype();
        }
    }
}
