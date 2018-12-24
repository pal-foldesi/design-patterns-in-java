package template_method;

abstract class Dancer {
    public void dailyRoutine() {
        this.warmUp();
        this.dance();
        this.relax();
    }

    private void warmUp() {
        System.out.println("Stretching limbs...");
    }

    abstract void dance();

    private void relax() {
        System.out.println("Stretching limbs, doing yoga, doing breathing exercises...");
    }
}
