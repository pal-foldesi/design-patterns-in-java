package prototype;

public class Client {
    public static void main(String[] args) {
        PrototypeFactory factory = new PrototypeFactory();
        Prototype duck = factory.getNew(Duck.class);
        Prototype goose = factory.getNew(Goose.class);
        Prototype notThere = factory.getNew(String.class);
    }
}
