package template_method;

public class DancerTest {
    public static void main(String[] args) {
        Dancer sambaDancer = new SambaDancer();
        Dancer tangoDancer = new TangoDancer();
        sambaDancer.dailyRoutine();
        tangoDancer.dailyRoutine();
    }
}
