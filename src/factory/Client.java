package factory;

public class Client {
    public static void main(String[] args) {
        CanvasFactory onlyFactory = new CanvasFactoryImpl();
        Canvas canvas = onlyFactory.createCanvas();
    }
}
