package behavioural.command;

public enum Oiledness {
    NOT_VERY_WELL_OILED_AT_ALL, SLIGHTLY_WELL_OILED, QUITE_WELL_OILED, VERY_WELL_OILED;

    private static Oiledness[] values = values();
    public Oiledness increase()
    {
        return values[(this.ordinal()+1) % values.length];
    }
}
