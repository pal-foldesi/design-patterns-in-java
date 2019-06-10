package structural.flyweight;

public class Client {
    public static void main(String[] args) {
        Size size = new Size(300, 200, "mm");
        Design design = new Design("Beech Grove I by Gustav Klimt",
                "https://upload.wikimedia.org/wikipedia/commons/a/a3/Gustav_Klimt_-_Beech_Grove_I_-_Google_Art_Project.jpg");

        FlyweightFactory factory = new FlyweightFactory();

        Postcard postcard = factory.obtainPostcard(size, design);
        Postcard another = factory.obtainPostcard(size, design);

        Size same = new Size(300, 200, "mm");

        Postcard withSameSize = factory.obtainPostcard(same, design);

        if (postcard.hashCode() != another.hashCode()) {
            throw new IllegalStateException("Postcard object was supposed to be reused!");
        }

        if (postcard.hashCode() != withSameSize.hashCode()) {
            throw new IllegalStateException("Postcard object was supposed to be reused!");
        }

        // Let's send it - this is the operation that uses extrinsic state
        Location from = new Location(-10.49124145, 105.6173514897963);
        Location to = new Location(51.5073219, -0.1276474);

        another.send(from, to);
    }
}
