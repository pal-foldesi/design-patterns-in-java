package structural.adapter;

public class Client {
    public static void main(String[] args) {
        CelsiusSensor celsiusSensor = new CelsiusSensor();
        System.out.println(celsiusSensor.toString());

        TemperatureSensor kelvinAdapter = new KelvinAdapter(celsiusSensor);
        System.out.println(kelvinAdapter.toString());
    }
}
